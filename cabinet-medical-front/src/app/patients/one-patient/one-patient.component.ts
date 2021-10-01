import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Patient } from 'src/app/shared/models/patient';
import { PatientService } from 'src/app/shared/services/patient.service';

@Component({
  selector: 'app-one-patient',
  templateUrl: './one-patient.component.html',
  styleUrls: ['./one-patient.component.scss']
})
export class OnePatientComponent implements OnInit {

  patient!: Patient;

  constructor(private service: PatientService, private route : ActivatedRoute) { }

  ngOnInit(): void {
    const id = this.route.snapshot.params['id'];
    this.service.getOneById(id).subscribe((patient: Patient) => {
      this.patient = patient;
      console.log(patient);
      
    })
  }

}
