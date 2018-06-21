import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Res } from './res';

@Injectable({
  providedIn: 'root'
})
export class ChatterService {

  private url: string = 'http://localhost:9000/hello';

  constructor(private http: HttpClient) { }

  getResult(): Observable<any> {
    return this.http.get(this.url);
  }
}
