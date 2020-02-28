import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserListComponent } from './user-list/user-list.component';
import { ItemListComponent } from './component/item-list/item-list.component';
import { LoginComponent } from './component/login/login.component';
import { RegisterComponent } from './component/register/register/register.component';


const routes: Routes = [
  { path: 'users', component: UserListComponent, pathMatch: 'full' },
  { path: 'items', component: ItemListComponent, pathMatch: 'full' },
  { path: 'login', redirectTo: 'dologin', pathMatch: 'full' },
  { path: 'dologin', component: LoginComponent, data:{title: 'Login Page'} },
  {path:'adduser', component: RegisterComponent, data:{title: 'Add User Page'}}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }