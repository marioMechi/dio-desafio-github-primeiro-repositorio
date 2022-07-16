import { AfterContentChecked, AfterContentInit, AfterViewChecked, AfterViewInit, Component, DoCheck, Input, OnChanges, OnDestroy, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-life-cycle',
  templateUrl: './life-cycle.component.html',
  styleUrls: ['./life-cycle.component.css']
})
export class LifeCycleComponent implements OnInit, OnChanges, DoCheck, AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked, OnDestroy {
  @Input()number =10;
  constructor() {
    console.log('Chamou o constutor')
   }
   ngOnChanges(changes: SimpleChanges): void {
     console.log('Chamou o on Changes')
   }
  ngOnInit(): void {
    console.log('Chamou o on Init')
  }
  ngDoCheck(): void {
    console.log('Chamou o do Check')
  }
  ngAfterContentInit(): void {
    console.log('Chamou o on After Content Init')
  }
  ngAfterContentChecked(): void {
    console.log('Chamou o on After Content Checked')
  }
  ngAfterViewInit(){
    console.log('Chamou o After View Init')
  }
  ngAfterViewChecked(): void {
    console.log('Chamou o After View Checked')
  }
  ngOnDestroy(): void {
    console.log('Chamou o on Destroy')
  }
}
