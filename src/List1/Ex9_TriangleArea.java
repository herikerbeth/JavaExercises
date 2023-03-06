package List1;

/*9) Faça um programa que calcule e mostre a área de um triângulo.
Sabe-se que: Área = (base * altura)/2.
*/

import java.util.Scanner;

public class Ex9_TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int altura, area, base;

        System.out.print("Digite o valor da base: ");
        base = scan.nextInt();
        System.out.print("Digite o valor da altura: ");
        altura = scan.nextInt();
        area = (base * altura) / 2;
        System.out.println("A área do triângulo é " + area);
    }
}
