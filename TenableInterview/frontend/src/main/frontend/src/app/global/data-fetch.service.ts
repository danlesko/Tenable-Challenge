import { Injectable } from '@angular/core';
import { Http }       from '@angular/http';
import { Observable }     from 'rxjs/Observable';
import 'rxjs/add/operator/map';

@Injectable()
export class DataFetchService {

  constructor(private http: Http) { }

  private hostsURL = './download/request?host=';

  fetchHosts(hostNum : number): Observable<any>{
    let url = `${this.hostsURL}${hostNum}`;
    return this.http
      .get(url)
      .map(response=> response.json() as any);
  }

}
