package packagetp1;

public class Employe {
    // données
    private String nom;
    private String numero;
    private double salaireHoraire;
    private double nbreHeuresSemaine;
    private int anciennete;

    // constante(s): static final UPPER_SNAKE_CASE
    // EX: public static final int UNE_CONSTANTE = 3;

    public static final double IMPOT_FEDERAL = 0.19;
    public static final double IMPOT_PROVINCIAL = 0.2;

    // méthode constructeur
    public Employe(String nom, String numero, double salaireHoraire, double nbreHeuresSemaine, int anciennete) {
        this.nom = nom;
        this.numero = numero;
        this.salaireHoraire = salaireHoraire;
        this.nbreHeuresSemaine = nbreHeuresSemaine;
        this.anciennete = anciennete;
    }

    public double salaireBrut(){
        return this.nbreHeuresSemaine * this.salaireHoraire;
    }
    public double salaireNetAvantImpot(){
        double salaire = salaireBrut();
        salaire -= salaireBrut() * 0.111;
        salaire -= salaireBrut() * 0.0136;
        salaire -= 20;
        return salaire < 0 ? 0 : salaire;

    }
    public double impotFederal(){
        return salaireNetAvantImpot() * IMPOT_FEDERAL;
    }
    public double impotProvincial(){
        return salaireNetAvantImpot() * IMPOT_PROVINCIAL;
    }
    public double salaireNetApresImpot(){
        return (salaireNetAvantImpot() - impotFederal()) - impotProvincial();
    }
}