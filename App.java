import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Exemplos:
Entrada: Saída:
3.0 4.0 5.2 TRIANGULO: 7.800
CIRCULO: 84.949
TRAPEZIO: 18.200
QUADRADO: 16.000
RETANGULO: 12.000
Entrada: Saída:
12.7 10.4 15.2 TRIANGULO: 96.520
CIRCULO: 725.833
TRAPEZIO: 175.560
QUADRADO: 108.160
RETANGULO: 132.080 */
    Scanner sc = new Scanner(System.in);  
    double a, b, c, tringulo, circulo, trapezio, quadrado, retangulo; 

    System.out.println("Digite os lados do triângulo: ");
    a = sc.nextDouble();

    System.out.println("Digite os lados do círculo: ");
    b = sc.nextDouble();

    System.out.println("Digite os lados do trapézio: ");
    c = sc.nextDouble();

    tringulo = a * c / 2;
    circulo = 3.14159 * c * c;
    trapezio = (a + b) * c / 2;
    quadrado = b * b;
    retangulo = a * b;

    System.out.println("TRIANGULO: " + tringulo);
    System.out.println("CIRCULO: " + circulo);
    System.out.println("TRAPEZIO: " + trapezio);
    System.out.println("QUADRADO: " + quadrado);
    System.out.println("RETANGULO: " + retangulo);
    }
}
