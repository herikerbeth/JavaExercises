package List1;

/*6)Faça um programa que receba o salário base de um funcionário,
calcule e mostre o salário a receber,sabendo-se que o funcionário tem gratificação de 5%
sobre o salário base e paga imposto de 7%também sobre o salário base.*/

import java.util.Scanner;
import java.text.*;

public class Ex6_SalaryWithDiscounts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float salarioBase, novoSalario, gratificacao, impostos;

        System.out.print("Informe o salário base: R$ ");
        salarioBase = input.nextFloat();
        gratificacao = (salarioBase * 5) / 100;
        impostos = (salarioBase * 7) / 100;
        novoSalario = (salarioBase + gratificacao) - impostos;

        System.out.println("Salário bruto é igual a: R$ " + casas.format(novoSalario));
    }
}