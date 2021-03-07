package morpion;

public class Case {
    private Motif motif;

    public Case() {
        this.motif = Motif.VIDE;
    }

    @Override
    public String toString() {
        return "[" + this.motif.getMotif() + "]";
    }

    public void setMotif(Motif motif) throws CaseNonVideException {
        if (this.isEmpty()) {
            this.motif = motif;
        } else {
            throw new CaseNonVideException();
        }
    }

    public boolean isEmpty() {
        return this.motif == Motif.VIDE;
    }

    public Motif getMotif() {
        return this.motif;
    }

}
