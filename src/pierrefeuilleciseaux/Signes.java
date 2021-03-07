package pierrefeuilleciseaux;

public enum Signes {
    PIERRE("P"),
    FEUILLE("F"),
    CISEAUX("C");

    private String signes;

    Signes(String signes) {
        this.signes = signes;
    }

    public String getSignes() {
        return signes;
    }

}
