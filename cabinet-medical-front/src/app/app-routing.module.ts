import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';
import { OnePatientComponent } from './patients/one-patient/one-patient.component';
import { PatientsComponent } from './patients/patients.component';


const routes: Routes = [
  { path: '', redirectTo: 'accueil', pathMatch: 'full' },
  { path: 'accueil', component: HomePageComponent },
  { path: "patients", component: PatientsComponent},
  { path: "patients/:id", component: OnePatientComponent}
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
