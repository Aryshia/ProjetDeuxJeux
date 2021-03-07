package morpion;

public class CaseNonVideException extends Exception {
    private static final long serialVersionUID = 1L;
    private static final String msg = "La case n'est pas vide";

    public CaseNonVideException() {
        super("La case n'est pas vide");
    }
}
