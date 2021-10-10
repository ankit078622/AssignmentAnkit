import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private apiServerUrl=environment.apiBaseUrl;
  constructor(private httpClient: HttpClient) { }

  addProduct(productBody: any): Observable<Product>{
    const productUrl = 'http://localhost:8080/springbootrestful/ecommerce/products';

    return this.httpClient.post<Product>(productUrl, productBody); // return an observable
  }

  public getProducts(): Observable<Product[]> {
    return this.httpClient.get<Product[]>(`${this.apiServerUrl}`);
  }
  // getProductList(): Observable<Product> {
  //   return this.httpClient.get<Product>(`${this.apiServerUrl}`);
  // }

  // getProduct(id: number): Observable<Product> {
  //   return this.httpClient.get<Product>(`${this.apiServerUrl}/${id}`);
  // }
}
