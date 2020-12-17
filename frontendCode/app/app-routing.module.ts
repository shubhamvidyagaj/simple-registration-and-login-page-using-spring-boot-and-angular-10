import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { TestingComponent } from './testing/testing.component';

const routes: Routes = [
  {path:"login",component:LoginComponent},
  {path:"register",component:RegistrationComponent},
  {path:"testing",component:TestingComponent},
  {path:"",redirectTo:"login",pathMatch:"full"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
