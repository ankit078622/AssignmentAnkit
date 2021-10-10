import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-viewproduct',
  templateUrl: './viewproduct.component.html',
  styleUrls: ['./viewproduct.component.css']
})
export class ViewproductComponent implements OnInit {

  // id: number;
  // products: Product[];

  // constructor(private route: ActivatedRoute,private router: Router,
  //   private prductservice: ProductService) { }

  // ngOnInit() {
  //   this.products = new Product();

  //   this.id = this.route.snapshot.params['id'];
    
  //   this.prductservice.getProduct(this.id)
  //     .subscribe(data => {
  //       console.log(data)
  //       this.products = data;
  //     }, error => console.log(error));
  // }

  // list(){
  //   this.router.navigate(['products']);
  // }
  public products: Product[];

  constructor(private productservice:ProductService){}
  
 ngOnInit(){
   this.getProduct();
 }

  public getProduct(): void{
    this.productservice.getProducts().subscribe(
      (response: Product[]) => {
        this.products=response;
      //(products) => {
       // this.products=products;
       /* for(let i=0;i<response.length;i++){

          this.products[i]=response[i];
          console.log(JSON.stringify(this.products[i].product_category));//for checking the in inspect
       }*/

          // this.products[]=response;
           console.log(JSON.stringify(this.products[0].product_id));//for checking the in inspect
           
  
      },
      (error: HttpErrorResponse)=>{
        alert(error.message);
        
      }
      
    );
  }
  

}
