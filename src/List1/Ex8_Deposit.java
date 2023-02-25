package List1;
/*8) Faça um programa que receba o valor de um depósito e o valor da taxa de juros, calcule e
 mostre o valor do rendimento e o valor total depois do rendimento.*/

import java.util.Scanner;
import java.text.*;

public class Ex8_Deposit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float valorDep, juros, rendimento, valorTotal;

        System.out.print("Informe o valor de depósito: R$ ");
        valorDep = scan.nextFloat();
        System.out.print("Informe o valor da taxa de juros: R$ ");
        juros = scan.nextFloat();

        rendimento = (valorDep * juros) / 100;
        valorTotal = valorDep + rendimento;

        System.out.println("O valor depois do rendimento é R$ " + casas.format(valorTotal));
    }
}