import { Injectable } from '@angular/core';
import { Produto } from './';

@Injectable({
  providedIn: 'root'
})
export class CalculoService {

  produto = new Produto();

  private precoProd: number = 0;

  constructor() { }

  addPreco(): number {
    
    if(this.produto.price > 0)
      this.precoProd = this.produto.price;

    return this.precoProd;
  }

}
