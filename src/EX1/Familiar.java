package EX1;

/**
 * @author Pedro Simões (30007732@students.ual.pt);
 * Gonçalo Lemos (30007523@students.ual.pt).
 */
public class Familiar extends Carro {
    public void desligarAirbagPassageiro() {
        System.out.println("Airbag desligado!");
    }

    @Override
    public void buzinar() {
        super.buzinar();
    }

    @Override
    public String toString() {
        return "Familiar";
    }
}
