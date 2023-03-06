package List1;

/*10) Faça um programa que calcule e mostre a área de um círculo. Sabe-se que: Área = p * R2.*/

import java.util.Scanner;

public class Ex10_CircleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final float p = 3.14F;
        float area, raio;
        System.out.print("Informe o tamanho do raio: ");
        raio = scan.nextFloat();
        area = ( raio * 2) * p;
        System.out.printf("A área do círculo é %.2f", area);
    }
}
