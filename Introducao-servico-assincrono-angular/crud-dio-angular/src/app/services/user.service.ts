import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../model/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {
apiUrl = 'https://sheet.best/api/sheets/c9293639-6d1e-4e66-b85b-d256f45e4f66';
httpOptions = {
  headers : new HttpHeaders({
    'Content-type':'application/json'
  })
}
  //Retorna lista de usuários READ
  constructor(private httpClient:HttpClient) { }
  getUsers(): Observable<User[]> {
    return this.httpClient.get<User[]>(this.apiUrl)
  }
  //Salva usuário no banco CREATE
  postUser(user:User):Observable<User>{
    return this.httpClient.post<User>(this.apiUrl, user, this.httpOptions)
  }
  //Exclui o usuário do banco DELETE
  deleteUser(id: number):Observable<User>{
    return this.httpClient.delete<User>(`${this.apiUrl}/id/${id}`)
  }
  //Edita usuário UPDATE
  updateUser(id: string, user: User):Observable<User>{
    return this.httpClient.put<User>(`${this.apiUrl}/id/${id}`, user, this.httpOptions)
  }
  //Lista usuário único
  getUser(id:string):Observable<User[]>{
    return this.httpClient.get<User[]>(`${this.apiUrl}/id/${id}`)
  }
}
