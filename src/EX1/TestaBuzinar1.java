package EX1;

/**
 * @author Pedro Simões (30007732@students.ual.pt);
 * Gonçalo Lemos (30007523@students.ual.pt).
 */
public class TestaBuzinar1 {
    public static void main(String[] args) {
        Citadino cit = new Citadino();
        cit.toString();
        cit.buzinar();
        Familiar fam = new Familiar();
        fam.toString();
        fam.buzinar();
        Jipe jipe = new Jipe();
        jipe.toString();
        jipe.buzinar();
    }
}