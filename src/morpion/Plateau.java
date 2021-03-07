package morpion;

import java.util.Arrays;

public class Plateau {

    Case[][] plateau = new Case[3][3];

    public Plateau() {
    }

    public void initPlateau() {
        for(int i = 0; i < 3; ++i) {
            for(int j = 0; j < 3; ++j) {
                this.plateau[i][j] = new Case();
            }
        }
    }

    public String toString() {
        String map = "";

        for(int i = 0; i < this.plateau.length; ++i) {
            for(int j = 0; j < this.plateau[i].length; ++j) {
                map = map + this.plateau[i][j];
            }

            map = map + "\n";
        }

        return map;
    }

    public Case getCase(int x, int y) {
        return this.plateau[x][y];
    }

    public Case[] getLigne(int y) {
        Case[] ligne = new Case[3];

        for(int i = 0; i < 3; i++) {
            ligne[i] = this.getCase(i, y);
        }

        return ligne;
    }

    public Case[] getColonne(int x) {
        Case[] colonne = new Case[3];

        for(int i = 0; i < 3; i++) {
            colonne[i] = this.getCase(x, i);
        }

        return colonne;
    }

    public Case[] getDiagonale(int diag) {
        Case[] diagonale = new Case[3];

        if(diag == 0){
            diagonale[0] = this.getCase(0,0);
            diagonale[2] = this.getCase(2,2);
        }
        else{
            diagonale[0] = this.getCase(2,0);
            diagonale[2] = this.getCase(0,2);
        }

        diagonale[1] = this.getCase(1,1);



        return diagonale;

    }

}
