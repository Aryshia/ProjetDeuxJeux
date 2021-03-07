package pierrefeuilleciseaux;

import java.util.Scanner;

public class Partie {

    private Joueur joueur1 = null;
    private Joueur joueur2 = null;
    Scanner sc = new Scanner(System.in);


    public Partie() {

    }

    public void jouer() {


    }

    public int comparaisonSignes() {

        if(joueur1.getSigne() == joueur2.getSigne()){
            System.out.println("égalité");
            return 0;
        }

        if(joueur1.getSigne() == Signes.CISEAUX && joueur2.getSigne() == Signes.FEUILLE || joueur1.getSigne() == Signes.FEUILLE && joueur2.getSigne() == Signes.PIERRE){
            return 1;
        }
        else{
            return 2;
        }


    }

}
