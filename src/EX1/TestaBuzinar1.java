package EX1;

/**
 * @author Pedro Simões (30007732@students.ual.pt);
 * Gonçalo Lemos (30007523@students.ual.pt).
 */
public class TestaBuzinar1 {
    public static void main(String[] args) {
        Citadino cit = new Citadino();
        System.out.println(cit.toString());
        cit.buzinar();
        Familiar fam = new Familiar();
        System.out.println(fam.toString());
        fam.buzinar();
        Jipe jipe = new Jipe();
        System.out.println(jipe.toString());
        jipe.buzinar();
    }
}