import { Adresse } from "./adresse";

export interface Infirmiere{
    id: number,
    nom: String,
    prenom: String,
    numeroProfessionnel: number,
    telPro: String,
    telPerso: String,
    adresse: Adresse
}