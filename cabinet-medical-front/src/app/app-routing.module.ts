import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddPatientComponent } from './add-patient/add-patient.component';
import { HomePageComponent } from './home-page/home-page.component';
import { InfirmieresComponent } from './infirmieres/infirmieres.component';
import { OnePatientComponent } from './patients/one-patient/one-patient.component';
import { PatientsComponent } from './patients/patients.component';
import { UpdatePatientComponent } from './update-patient/update-patient.component';


const routes: Routes = [
  { path: '', redirectTo: 'accueil', pathMatch: 'full' },
  { path: 'accueil', component: HomePageComponent },
  { path: "patients", component: PatientsComponent},
  { path: "patients/addPatient", component: AddPatientComponent, pathMatch: "full"},
  { path: "patients/:id", component: OnePatientComponent},
  { path: "patients/:id/update", component: UpdatePatientComponent},
  {path: "infirmieres", component: InfirmieresComponent}
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
