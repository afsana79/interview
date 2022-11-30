import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ApiResponse } from './output-object';
 
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  public response:any;

  public constructor(private httpClient:HttpClient) 
  { }

  public ngOnInit() : void {
    const url = "https://cdn.contentful.com/spaces/8utyj17y1gom/entries?access_token=e50d8ac79fd7a3545d8c0049c6a1216f5d358a192467c77584eca6fad21e0f37&content_type=pageTemplate&include=1&fields.url=%2Fhome%2Fsupport";
    this.httpClient.get<ApiResponse>(url).subscribe((response => {
      
      this.response = response;
    }))
  }
}