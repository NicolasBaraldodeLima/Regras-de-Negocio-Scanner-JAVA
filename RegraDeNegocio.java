package academy.devdojo.maratonajava;

import java.util.Scanner;

public class RegraDeNegocio {

    public  boolean verificarValorTotal(double valorTotal) {
        return valorTotal > 100;
    }

    public static void main(String[] args) {
        RegraDeNegocio regraDeNegocio = new RegraDeNegocio();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o voalor total do pedido:");
        double valorPedido = scanner.nextDouble();

        if (regraDeNegocio.verificarValorTotal(valorPedido)) {
            System.out.println("Pedido aceito. Valor total está dentro das regras de negócio.");
        } else {
            System.out.println("Pedido reijeitado. Valor total abaixo do permitido.");
        }

        scanner.close();

    }
}
