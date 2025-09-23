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

    // méthode constructeur
    public Employe(String nom, String numero, double salaireHoraire, double nbreHeuresSemaine, int anciennete) {
        this.nom = nom;
        this.numero = numero;
        this.salaireHoraire = salaireHoraire;
        this.nbreHeuresSemaine = nbreHeuresSemaine;
        this.anciennete = anciennete;
    }
}