package morpion;

import java.util.Scanner;

public class Partie {
    private int tour = 1;
    private Joueur joueur1 = null;
    private Joueur joueur2 = null;
    //Création de deux joueurs
    Joueur[] tabJoueur = new Joueur[2];
    private Plateau plateau = null;

    public Partie() {
        this.joueur1 = new Joueur(Motif.CROIX);
        this.joueur2 = new Joueur(Motif.ROND);
        this.tabJoueur[0] = this.joueur1;
        this.tabJoueur[1] = this.joueur2;
        this.plateau = new Plateau();
        this.plateau.initPlateau();
        this.start();
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        for(Joueur joueurActuel = null; this.tour < 9 && !this.checkVictoire(); ++this.tour) {
            joueurActuel = this.tabJoueur[this.tour % 2];
            System.out.println(this.plateau);
            System.out.println("Tour: " + tour);
            String reponse = sc.nextLine();
            String coordX = reponse.split(";")[0];
            String coordY = reponse.split(";")[1];
            System.out.println(coordX + ";" + coordY);
            int x = Integer.parseInt(coordX);
            int y = Integer.parseInt(coordY);

            try {
                this.plateau.getCase(x, y).setMotif(joueurActuel.getMotif());
            } catch (ArrayIndexOutOfBoundsException | CaseNonVideException var9) {
                System.out.println("Case non vide");
                tour--;
            }
        }

        System.out.println("Victoire");

    }

    public boolean checkVictoire() {
        int y;
        Case[] ligne;
        for(y = 0; y < 3; y++) {
            ligne = this.plateau.getColonne(y);
            if (ligne[0].getMotif() != Motif.VIDE && ligne[0].getMotif() == ligne[1].getMotif() && ligne[1].getMotif() == ligne[2].getMotif()) {
                return true;
            }
        }

        for(y = 0; y < 3; y++) {
            ligne = this.plateau.getLigne(y);
            if (ligne[0].getMotif() != Motif.VIDE && ligne[0].getMotif() == ligne[1].getMotif() && ligne[1].getMotif() == ligne[2].getMotif()) {
                return true;
            }
        }

        for(y = 0; y < 2; y++) {
            ligne = this.plateau.getDiagonale(y);
            if (ligne[0].getMotif() != Motif.VIDE && ligne[0].getMotif() == ligne[1].getMotif() && ligne[1].getMotif() == ligne[2].getMotif()) {
                System.out.println("diag win");
                return true;
            }

        }

        return false;
    }

}
