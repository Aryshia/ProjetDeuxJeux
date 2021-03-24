package morpion;

public class CaseNonVideException extends Exception {
    private static final long serialVersionUID = 1L;

    public CaseNonVideException() {
        super("La case n'est pas vide");
    }
}
