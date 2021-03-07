package morpion;

public class Joueur {
    private Motif motif = null;

    public Joueur(Motif motif) {
        this.motif = motif;
    }

    public Motif getMotif() {
        return this.motif;
    }
}
