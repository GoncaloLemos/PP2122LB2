package EX2;

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
        System.out.println("Buzina do carro");
    }

    @Override
    public String toString() {
        return "Citadino";
    }
}
