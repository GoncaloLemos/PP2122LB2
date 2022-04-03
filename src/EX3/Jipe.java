package EX3;

/**
 * @author Pedro Simões (30007732@students.ual.pt);
 * Gonçalo Lemos (30007523@students.ual.pt).
 */
public class Jipe extends Carro {
    public void ligarTracao4x4() {
        System.out.println("Tração ligada!");
    }

    @Override
    public void buzinar() {
        System.out.println("Buzina do carro");
    }

    @Override
    public String toString() {
        return "Jipe";
    }
}