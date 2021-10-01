import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Patient } from 'src/app/shared/models/patient';

@Component({
  selector: 'app-patient-card',
  templateUrl: './patient-card.component.html',
  styleUrls: ['./patient-card.component.scss']
})
export class PatientCardComponent implements OnInit {

  @Input() patient!: Patient;

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  afficherUnPatient(id: number){
    this.router.navigate([`patients/${id}`])
    
  }

}
