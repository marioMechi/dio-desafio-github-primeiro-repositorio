import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PeopleService {

  constructor() { }

  getPeople(): Observable<any> {
    let peopleArray = [
      {
        firstName:'Ivonaldo',
        lastName:'Soares',
        age: 26
      },
      {
        firstName:'João',
        lastName:'Batista',
        age: 52
      },
      {
        firstName:'Maria',
        lastName:'Joaquina',
        age: 33
      },
    ]
    return of(peopleArray);
  }
}
