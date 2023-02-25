package List1;

 /*7) Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber,
  sabendo-se que o funcionário tem gratificação de R$ 50 e paga imposto de 10% sobre o salário base.*/

import java.util.Scanner;
import java.text.*;

public class Ex7_Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float salario, novoSalario, imposto;

        System.out.print("Informe o salário: R$ ");
        salario = input.nextFloat();
        imposto = (salario * 10) / 100;
        novoSalario = (salario + 50) - imposto;
        System.out.println("Salário a receber: R$ " + casas.format(novoSalario));
    }
}
