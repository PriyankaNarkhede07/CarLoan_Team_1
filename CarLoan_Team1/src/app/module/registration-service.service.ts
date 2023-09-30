import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { AllPersonalDocuments } from './all-personal-documents';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class RegistrationServiceService {

  constructor(private http : HttpClient) { }

  httpOptions = {
    headers : new HttpHeaders({'Content-Type': 'application/x-www-form-urlencoded'})
  };
  postAllpersonalDocuments(uploadimg: any) : Observable<AllPersonalDocuments>{
  
        console.log("inside postImage method");

    return this.http.post<AllPersonalDocuments>("http://localhost:9094/detailsUpload/personaldocUpload",uploadimg);
  }
  }
   

