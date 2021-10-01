import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Infirmiere } from '../shared/models/infirmiere';
import { Patient } from '../shared/models/patient';
import { InfirmiereService } from '../shared/services/infirmiere.service';
import { PatientService } from '../shared/services/patient.service';

@Component({
  selector: 'app-add-patient',
  templateUrl: './add-patient.component.html',
  styleUrls: ['./add-patient.component.scss']
})
export class AddPatientComponent implements OnInit {

  newPatientForm: FormGroup;
  adresseForm: FormGroup;
  infirmiereList!: Array<Infirmiere>;
  infirmiereId!: number;

  constructor(private service: PatientService, private serviceInfirmiere: InfirmiereService, private router: Router) {
    this.newPatientForm = new FormGroup({
      id: new FormControl(""),
      nom: new FormControl("", Validators.required),
      prenom: new FormControl("", Validators.required),
      dateDeNaissance: new FormControl("", Validators.required),
      sexe: new FormControl("", Validators.required),
      numeroSecuriteSociale: new FormControl("", Validators.required),
      adresse: new FormControl(""),
      infirmiere: new FormControl({
        id: new FormControl("")
      })
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
    this.serviceInfirmiere.getAll().subscribe((infirmieres: Array<Infirmiere>) => {
      this.infirmiereList = infirmieres;
    })
  }


  sendNewPatient() {
    console.log(this.newPatientForm.value);

    this.newPatientForm.patchValue({
      infirmiere : {
        id: "1"
      }
    })


    this.newPatientForm.patchValue({
      adresse: this.adresseForm.value
    })

    // this.service.create(this.newPatientForm.value).subscribe((patient: Patient) => {
    //   this.router.navigate(["/patients"]);
    // })

  }

}
