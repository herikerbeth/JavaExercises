package List1;

/*4) Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário,
 sabendo-se que este sofreu um aumento de 25%.*/

import java.util.Scanner;
import java.text.*;

public class Ex4_NewSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float salario, novoSalario, porcentagem;

        System.out.print("Informe o salário: R$ ");
        salario = input.nextFloat();
        porcentagem = (salario * 25) / 100;
        novoSalario = salario + porcentagem;
        System.out.println("Novo salário com reajuste de 25% é: R$ " + casas.format(novoSalario));
    }
}