import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { User } from '../models/user';
import { Observable } from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders({'content-Type': 'application/json'})
}

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private url: string;

  constructor(private http: HttpClient) {
    this.url = 'http://localhost:8080/api/users';
  }

  public getUsers(): Observable<User[]>{
    return this.http.get<User[]>(this.url);
  }
  public addUser(user: User){
    return this.http.post<User>(this.url, user);
  }
}
