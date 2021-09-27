import { Component, OnInit } from '@angular/core';
import { CalculoService } from 'src/app/calculo';

@Component({
  selector: 'app-buttons',
  templateUrl: './buttons.component.html',
  styleUrls: ['./buttons.component.css']
})
export class ButtonsComponent implements OnInit {

  private subtotal: number = 0;
  private total: number = 0;
  private readonly FRETE: number = 10;

  constructor(private calculoService: CalculoService) { }

  ngOnInit(): void {
  }

  get freteProd(): number {
      return this.FRETE;
  }

  get subProd(): number {
    return this.subtotal = this.FRETE + this.calculoService.addPreco();
  }

  get totalProd(): number {
    if(this.total < 250) {
     this.total = this.calculoService.addPreco() + this.FRETE;
    }
    else
    {
      this.total = this.calculoService.addPreco();
    }

    return this.total;
  }

}
