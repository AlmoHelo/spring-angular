import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Patient } from 'src/app/shared/models/patient';
import { PatientService } from 'src/app/shared/services/patient.service';

@Component({
  selector: 'app-one-patient',
  templateUrl: './one-patient.component.html',
  styleUrls: ['./one-patient.component.scss']
})
export class OnePatientComponent implements OnInit {

  patient!: Patient;

  constructor(private service: PatientService, private route : ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    const id = this.route.snapshot.params['id'];
    this.service.getOneById(id).subscribe((patient: Patient) => {
      this.patient = patient;
    })
  }

  update(patient: Patient){
    this.service.donnees = patient;
    this.router.navigate([`patients/${patient.id}/update`]);
  }

  delete(id: number){
    console.log(id);
    this.service.deleteById(id).subscribe((res: any) => {
      this.router.navigate(["/"])
    })
  }

}
