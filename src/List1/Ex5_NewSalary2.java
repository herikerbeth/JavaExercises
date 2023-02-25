package List1;

/*5) Faça um programa que receba o salário de um funcionário e o percentual de aumento,
calcule e mostre o valor do aumento e o novo salário.*/

import java.util.Scanner;
import java.text.*;

public class Ex5_NewSalary2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float salario, percentual, aumento, novoSalario;

        System.out.print("Informe o salário: R$ ");
        salario = input.nextFloat();
        System.out.print("Informe o aumento percentual: ");
        percentual = input.nextFloat();

        aumento = (salario * percentual) / 100;
        novoSalario = salario + aumento;
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Valor do novo salário: R$ " + novoSalario);
    }
}