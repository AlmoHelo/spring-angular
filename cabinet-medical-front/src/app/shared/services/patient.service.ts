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
    return this.http.get<Patient>(`${environment.url}/patients/${id}`);
  }

  public create(patient: Patient): Observable<Patient>{
    return this.http.post<Patient>(`${environment.url}/patients/`, patient);
  }

  public update(patient: Patient): Observable<Patient>{
    return this.http.put<Patient>(`${environment.url}/patients/`, patient);
  }

  public deleteById(id: number): Observable<any>{
    return this.http.delete<any>(`${environment.url}/patients/${id}`);
  }

  donnees!: Patient;

}
