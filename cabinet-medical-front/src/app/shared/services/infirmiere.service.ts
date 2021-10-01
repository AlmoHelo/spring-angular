import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Infirmiere } from '../models/infirmiere';

@Injectable({
  providedIn: 'root'
})
export class InfirmiereService {

  constructor(private http: HttpClient) { }
  
  /**
   * Route pour récupérer tous les infirmieres
   * @returns Array de infirmieres
   */
   public getAll(): Observable<Infirmiere[]> {
    return this.http.get<Infirmiere[]>(`${environment.url}/infirmieres`);
  }
}
