package EX3;

import java.util.Scanner;

/**
 * @author Pedro Simões (30007732@students.ual.pt);
 * Gonçalo Lemos (30007523@students.ual.pt).
 */
public class TestaBuzinar2 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Introduza o tipo de carro (citadino, familiar ou jipe):");
        String type = S.nextLine();
        switch (type) {
            case "citadino" -> {
                Citadino c = new Citadino();
                c.ligarACManual();
            }
            case "familiar" -> {
                Familiar f = new Familiar();
                f.desligarAirbagPassageiro();
            }
            case "jipe" -> {
                Jipe j = new Jipe();
                j.ligarTracao4x4();
            }
            default -> System.out.println("Tipo de carro inválido!");
        }
    }
}
