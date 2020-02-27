import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserListComponent } from './user-list/user-list.component';
import { UserFormComponent } from './user-form/user-form.component';
import { ItemListComponent } from './component/item-list/item-list.component';
import { LoginComponent } from './component/login/login.component';


const routes: Routes = [
  {path: 'users', component:UserListComponent},
  {path: 'adduser', component:UserFormComponent},
  {path: 'items', component:ItemListComponent},
  {path: 'login', component:LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
