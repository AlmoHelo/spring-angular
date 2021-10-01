import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Patient } from '../models/patient';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class PatientService {

  constructor(private http: HttpClient) { }

  /**
   * Route pour récupérer tous les patients
   * @returns Array de patient
   */
  public getAll(): Observable<Patient[]> {
    return this.http.get<Patient[]>(`${environment.url}/patients`);
  }

  /**
   * Route pour récupérer un patient selon son id
   * @param id number
   * @returns patient
   */
  public getOneById(id: number): Observable<Patient>{
    return this.http.get<Patient>(`${environment.url}/patients/${id}`)
  }
}
