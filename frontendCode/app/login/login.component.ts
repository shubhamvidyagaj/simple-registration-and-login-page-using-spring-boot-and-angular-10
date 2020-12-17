import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RegistrationService } from '../registration.service';
import { Student } from '../student';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  
  user:Student=new Student();
  errmsg="";
  constructor(private service:RegistrationService,
    private router:Router) { }

  ngOnInit(): void {
  }

  loginUser(){
      this.service.loginUser(this.user).subscribe(data=>{
         console.log(data);
         this.router.navigate(["/testing"]);
      },err=>{console.log("error occured")
        this.errmsg="Wrong credentials enter correct username and password";
    });
  }

  gotoregister(){
    this.router.navigate(["/register"]);
  }

}
