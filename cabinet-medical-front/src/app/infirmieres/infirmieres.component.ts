import { Component, OnInit } from '@angular/core';
import { Infirmiere } from '../shared/models/infirmiere';
import { InfirmiereService } from '../shared/services/infirmiere.service';

@Component({
  selector: 'app-infirmieres',
  templateUrl: './infirmieres.component.html',
  styleUrls: ['./infirmieres.component.scss']
})
export class InfirmieresComponent implements OnInit {
  infirmieres: Infirmiere[] = [];
  constructor(private service: InfirmiereService) { }

  ngOnInit(): void {
    this.service.getAll().subscribe((infirmieres: Infirmiere[]) => {
      this.infirmieres = infirmieres;
    })
  }
}
