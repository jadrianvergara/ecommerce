import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { EcommerceComponent } from './ecommerce/ecommerce.component';
import { ProductsComponent } from './ecommerce/products/products.component';
import { OrdersComponent } from './ecommerce/orders/orders.component';
import { ShoppingCartComponent } from './ecommerce/shopping-cart/shopping-cart.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {EcommerceService} from "./ecommerce/services/EcommerceService";
import {HttpClientModule} from "@angular/common/http";

@NgModule({
  declarations: [
    AppComponent,
    EcommerceComponent,
    ProductsComponent,
    ShoppingCartComponent,
    OrdersComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [EcommerceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
