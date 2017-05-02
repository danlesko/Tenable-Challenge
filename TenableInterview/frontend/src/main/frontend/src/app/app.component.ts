import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { DataFetchService } from './global/data-fetch.service';

import { Configurations } from "./configs";
import { Hosts } from "./configs";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [DataFetchService]
})
export class AppComponent implements OnInit{

  constructor( private dataFetchService: DataFetchService, private fb: FormBuilder,) { }

  ngOnInit() {
    this.buildForm();
  }

  configurations : Configurations;
  hosts : Hosts[];
  hostsPretty : any;
  hostNum : any;

  searchForm: FormGroup;
  buildForm(): void {
    this.searchForm = this.fb.group({
      'hostNum': [null, [Validators.required]],
    });
  }

  submitForm(value: any): void {
    console.log(value);
    let hostNum = value.hostNum;
    if (hostNum == '' || hostNum == null){
      alert("Please enter a value!");
    } else if (hostNum < 0)
    {
      alert("Please enter a value greater than 0!");
      this.searchForm.reset();
    } else{
      this.fetchHosts(hostNum);
      this.searchForm.reset()
    }
  }

  clearForm(): void {
    this.searchForm.reset();
    this.hosts = null;
  }

  fetchHosts(hostNum : number): void{
    this.dataFetchService
      .fetchHosts(hostNum)
      .subscribe(response => {
        this.configurations = response;
        this.hosts = this.configurations.configurations;
      });
  }



}
