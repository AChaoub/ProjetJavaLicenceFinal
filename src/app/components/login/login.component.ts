import { AccountService } from './../../services/account.service';
import { AuthService } from './../../services/auth.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { TokenService } from './../../services/token.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginForm = new FormGroup({
    email: new FormControl(null, Validators.required),
    password: new FormControl(null, Validators.required),
    
  })
  constructor(
    private authService : AuthService,
    private tokenService: TokenService,
    private accountService : AccountService,
    private router: Router
    ) { }
  
  ngOnInit(): void {
  }
  login(){
    this.authService.login(this.loginForm.value).subscribe(res => this.handleResponse(res))
  }
  handleResponse(res: Object){
    this.tokenService.handle(res)
    this.accountService.changeAuthStatus(true);
    this.router.navigateByUrl("/acceuil")
  }
}