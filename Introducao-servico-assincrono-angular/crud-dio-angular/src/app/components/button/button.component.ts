import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-button',
  templateUrl: './button.component.html',
  styleUrls: ['./button.component.css']
})
export class ButtonComponent implements OnInit {
  @Input() btnText: string='Clique';
  @Input() btnType: string='';
  @Output() clickChildren= new EventEmitter;
  textFilho = 'clicouNoFilho';

  constructor() { }

  ngOnInit(): void {
  }
  clicou(value:any){
    this.clickChildren.emit(this.textFilho);
  }
  clicouNoFilho(text:any){
    console.log(text)
  }
}
