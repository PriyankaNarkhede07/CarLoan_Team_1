import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { RegistrationServiceService } from 'app/module/registration-service.service';

@Component({
  selector: 'app-customerregister',
  templateUrl: './customerregister.component.html',
  styleUrls: ['./customerregister.component.css']
})
export class CustomerregisterComponent implements OnInit {

  constructor(private formBuilder:FormBuilder,private regservice:RegistrationServiceService) { }

  RegForm:FormGroup

  getDoc:any;

  uploadingimage:any;
  uploadingsalaryslip:any;

  imageSrc1:any;
  imageSrc2:any;

  reader=new FileReader();

  ngOnInit(): void {
    this.RegForm=this.formBuilder.group({
      bankCheque:[''],
      salarySlips:['']
    })
  }


  onselectedImage1(event:any){
    console.log("inside onselectedImage1()");
    this.uploadingimage=event.target.files[0];
    console.log(this.uploadingimage);
    const file=event.target.files[0];
    this.reader.onload = e => this.imageSrc1 = this.reader.result;
    this.reader.readAsDataURL(file);
  }

  onselectedImage2(event:any){
    console.log("inside onselectedImage2()");
    this.uploadingsalaryslip=event.target.files[0];
    console.log(this.uploadingsalaryslip);
    const file=event.target.files[0];
    this.reader.onload = e => this.imageSrc2 = this.reader.result;
    this.reader.readAsDataURL(file);
  }

  save(){
    console.log("inside save method");
    const docs=JSON.stringify(this.RegForm.value);

    const uploadimg=new FormData();

    uploadimg.append('bankCheque',this.uploadingimage);
    uploadimg.append('salarySlips',this.uploadingsalaryslip);
    
    uploadimg.append("doc",docs);

    this.regservice.postAllpersonalDocuments(uploadimg).subscribe();
    console.log("Upload method")

  }
}

