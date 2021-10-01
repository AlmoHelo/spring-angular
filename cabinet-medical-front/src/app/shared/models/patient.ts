import { Adresse } from "./adresse";
import { Infirmiere } from "./infirmiere";

export interface Patient{
    id: number,
    nom: String,
    prenom: String,
    dateDeNaissance: Date,
    sexe: String,
    numeroSecuriteSociale: number,
    adresse: Adresse,
    infirmiere: Infirmiere
}