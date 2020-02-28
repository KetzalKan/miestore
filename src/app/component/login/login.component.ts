import { Component, OnInit } from '@angular/core';
import { Router} from '@angular/router';
import {LoginService} from '../../service/login/login.service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  model: any = {}

  errorMessage:string;
  constructor(private router: Router, private LoginService:LoginService){}

  ngOnInit() {
    sessionStorage.removeItem('userName');
    sessionStorage.clear();
  }

  login(){
    debugger;
    this.LoginService.login(this.model).subscribe(
      data => {
        debugger;
        if(data.Status == "Success")
        {
          this.router.navigate(['/admin_dashboard']);
          debugger;
        }else{
          this.errorMessage = data.message;
        }
      },
      error => {
        this.errorMessage = error.message;
      }
    );
  }

}
