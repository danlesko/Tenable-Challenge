# Tenable-Challenge

For the Tenable Interview Coding Challenge I was asked to make 4 separate pages to display my skills with HTML, CSS, JS, jQuery, and a framework of my choosing. I chose to use Angular2 for my frontend. Also for this application, I decided to make a REST API using Spring Boot so that way my projects could call data in real time from a MySQL database. All pages are hosted on an Amazon EC2 instance and served via a Tomcat 8 server. 

### File Locations
For Parts 1-3 all files are located in the root directory of this repository. 

For Part 4, the frontend application code is found under:
`TenableInterview/frontend/src/main/frontend/`

The rest API written for the application is found under:
`TenableInterview/backend/src/main/java/`

### See It Live

1) [Part 1](http://ec2-52-54-85-216.compute-1.amazonaws.com:8080/GetHosts/tenable1.html)
2) [Part 2](http://ec2-52-54-85-216.compute-1.amazonaws.com:8080/GetHosts/tenable2.html)
3) [Part 3](http://ec2-52-54-85-216.compute-1.amazonaws.com:8080/GetHosts/tenable3.html)
4) [Part 4](http://ec2-52-54-85-216.compute-1.amazonaws.com:8080/GetHosts/)
5) Part 5 Written Below:

If I had to handle a response of containing 10000 objects on my JSON, there are a couple of ways I would handle it. First and foremost, we should make sure that all requests are asynchronous so that other rendering can be accomplished while the data is loading.

From a frontend design standpoint, I would most likely implement some sort of pagination, allowing for X number of results to be displayed per page. Displaying 10000 results on a single page would be overwhelming to the user and hard to interpret. In addition to this pagination, I would allow for the filters and sorting to be applied to the data so a given object inside of the JSON can be located more efficiently. If possible, I would send the filters back during the request so that, possibly, less data is returned. Otherwise they would be implemented in the frontend to decrease the amount of information displayed, but it might make the application less responsive if this is a must. Another possible way to increase response time of the application is to break the request into chunks and load each chunk in parallel. Once the data is loaded it can be stitched back together. Another thought is to load all of the data locally to a file, or cache it in the browser. This would make requests to the same pieces of data occur more efficiently, although this is not always possible for data that is dynamic. 

From a backend standpoint, I would allow for either the compression of the data through GZIP or some other method. The compressed data would have to be unzipped on the frontend in this method. Lazy loading could also be implemented so that the server only sends back what it has to at a given point in time. This goes along with the concept of pagination, except in this case, each page chunk is requested as the user switches from page to page instead of loading all the data at once. 
