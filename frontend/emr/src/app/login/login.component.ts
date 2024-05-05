import { Component, OnInit } from '@angular/core';
import { AuthService } from '../services/auth.service';
import { Router } from '@angular/router';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  message:string;
  constructor(public authService:AuthService, private router:Router) { this.message=""; }

  ngOnInit(): void {
  }

  login(username:string,password:string):boolean{
    console.log("Logging in...");
    if(!this.authService.login(username,password)){
      this.message="Incorrect credentials.";
      setTimeout(()=>{
        this.message="";
      },2500);
         
    }else{
      this.router.navigateByUrl('home');
    }
    return false;
  }

  logout():void{
    this.authService.logout();
  }
  myfunc():any{
    this.message="";
  }
}
