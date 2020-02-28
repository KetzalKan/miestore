import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserListComponent } from './user-list/user-list.component';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http'
import { UserService } from './user-service.service';
import { ItemListComponent } from './component/item-list/item-list.component';
import { ItemService } from './service/item-service/item.service';
import { LoginComponent } from './component/login/login.component';
import { CouponComponent } from './component/coupon/coupon.component';
import { RegisterComponent } from './component/register/register/register.component';
import { DashboardComponent } from './component/dashboard/dashboard.component';

@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    ItemListComponent,
    LoginComponent,
    CouponComponent,
    RegisterComponent,
    DashboardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [UserService, ItemService],
  bootstrap: [AppComponent]
})
export class AppModule { }
