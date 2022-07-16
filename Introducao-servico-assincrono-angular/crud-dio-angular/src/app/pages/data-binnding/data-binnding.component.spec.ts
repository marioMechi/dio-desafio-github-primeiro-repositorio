import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DataBinndingComponent } from './data-binnding.component';

describe('DataBinndingComponent', () => {
  let component: DataBinndingComponent;
  let fixture: ComponentFixture<DataBinndingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DataBinndingComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DataBinndingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
