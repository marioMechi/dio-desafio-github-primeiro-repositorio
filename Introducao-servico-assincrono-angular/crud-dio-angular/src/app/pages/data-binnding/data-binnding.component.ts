import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binnding',
  templateUrl: './data-binnding.component.html',
  styleUrls: ['./data-binnding.component.css']
})
export class DataBinndingComponent implements OnInit {
  text= 'Ivonaldo Soares';
  imageUrl ='http:/picsum.photos./200/300';
  imageDesc= 'essa é uma imagem';
  buttonText='Clique aqui';
  textRed= 'textRed';
  bgColor='green';
  styleSize='20px';
  width=600;
  textInput='';
  number=0;
  destroy=false;

  constructor() { }

  ngOnInit(): void {
  }
  retornaNome(){
    return this.text;
  }
  clicou(value:any){
    console.log('Clicou aqui', value);
  }
  incrementa(){
    this.number++;
  }
  destroiComponente(){
    this.destroy=true;
  }
}
