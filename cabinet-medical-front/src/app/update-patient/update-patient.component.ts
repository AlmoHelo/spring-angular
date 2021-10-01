import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Infirmiere } from '../shared/models/infirmiere';
import { Patient } from '../shared/models/patient';
import { InfirmiereService } from '../shared/services/infirmiere.service';
import { PatientService } from '../shared/services/patient.service';

@Component({
  selector: 'app-update-patient',
  templateUrl: './update-patient.component.html',
  styleUrls: ['./update-patient.component.scss']
})
export class UpdatePatientComponent implements OnInit {

  patient!: Patient;
  patientForm: FormGroup;

  adresseForm: FormGroup;

  infirmieres= new FormControl();
  infirmiereList!: Array<Infirmiere>;

  constructor(private service: PatientService, private serviceInfirmiere: InfirmiereService, private router: Router) { 
    this.patientForm = new FormGroup({
      id: new FormControl(""),
      nom: new FormControl("", Validators.required),
      prenom: new FormControl("", Validators.required),
      dateDeNaissance: new FormControl("", Validators.required),
      sexe: new FormControl("", Validators.required),
      numeroSecuriteSociale: new FormControl("", Validators.required),
      adresse: new FormControl(""),
      infirmiere: new FormControl("", Validators.required)
    })
    this.adresseForm = new FormGroup({
      id: new FormControl(""),
      numero: new FormControl("", Validators.required),
      rue: new FormControl("", Validators.required),
      cp: new FormControl("", Validators.required),
      ville: new FormControl("", Validators.required)
    })
  }

  ngOnInit(): void {
    this.patient = this.service.donnees
    this.serviceInfirmiere.getAll().subscribe((infirmieres: Array<Infirmiere>) => {
      this.infirmiereList = infirmieres;      
    })     
  }

  sendUpdate(){
    this.adresseForm.patchValue({
      id: this.patient.adresse.id 
    })
    this.patientForm.patchValue({
      id: this.patient.id,
      adresse: this.adresseForm.value
    })

    console.log(this.adresseForm)
    
    this.service.update(this.patientForm.value).subscribe((patient: Patient) => {
      console.log(patient);
      this.router.navigate(["/"]);
    })
  }
}
