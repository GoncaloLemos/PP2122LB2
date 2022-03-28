package EX1;

/**
 * @author Pedro Simões (30007732@students.ual.pt);
 * Gonçalo Lemos (30007523@students.ual.pt).
 */
public class Citadino extends Carro {
    public void ligarACManual() {
        System.out.println("AC ligado!");
    }

    @Override
    public void buzinar() {
        super.buzinar();
    }

    @Override
    public String toString() {
        return "Citadino";
    }
}
