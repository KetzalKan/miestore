import { Component, OnInit } from '@angular/core';
import { LoginService } from '../../../service/login/login.service'
import { Register} from '../../../model/register/register';
import {Observable} from 'rxjs';
import {NgForm, FormBuilder, FormGroup, Validators, FormControl,
   FormsModule, ReactiveFormsModule} from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  data = false;
  userForm:any;
  message:string;

  constructor(private formbuilder: FormBuilder, private loginService:LoginService) { }

  ngOnInit() {
    this.userForm = this.formbuilder.group({
      userName:['', [Validators.required]],
      loginName:['',[Validators.required]],
      password:['',[Validators.required]],
      email:['',[Validators.required]]
    });
  }

  onFormSubmit(){
    const user = this.userForm.value;
    this.createEmployee(user);
  }

  createEmployee(register:Register){
    this.loginService.createUser(register).subscribe(
      () => {this.data = true;
            this.message = "Data saved successfully";
            this.userForm.reset();
          }
    )
  }

}
