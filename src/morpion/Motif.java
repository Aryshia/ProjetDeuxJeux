package morpion;

public enum Motif {
    VIDE(" "),
    ROND("O"),
    CROIX("X");

    private String motif;

    private Motif(String motif) {
        this.motif = motif;
    }

    public String getMotif() {
        return motif;
    }
}
