package pierrefeuilleciseaux;

public class Joueur {
    private Signes signe = null;

    public Joueur(Signes signe) {
        this.signe = signe;
    }

    public Signes getSigne() {
        return this.signe;
    }

    public void setSigne(Signes signe) {
        this.signe = signe;
    }


}
