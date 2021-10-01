import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Adresse } from '../models/adresse';

@Injectable({
  providedIn: 'root'
})
export class AdresseService {

  constructor(private http: HttpClient) { }

  public getOneById(id: number): Observable<Adresse>{
    return this.http.get<Adresse>(`${environment.url}/adresses/${id}`)
  }

  public create(adresse: Adresse): Observable<Adresse>{
    return this.http.put<Adresse>(`${environment.url}/adresses/`, adresse);
  }
  
  public update(adresse: Adresse): Observable<Adresse>{
    return this.http.put<Adresse>(`${environment.url}/adresses/`, adresse);
  }
}
