/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3_FigurasGeométricas;

import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio so circulo:");
        double valor = sc.nextDouble();
        Circulo c1 = new Circulo(valor);

        System.out.println("Area do circulo: " + c1.calcularArea());
        System.out.println("Perimetro do circulo: " + c1.calcularPerimetro());

        System.out.println("Digite o valor da largura do retângulo: ");
        double largura = sc.nextDouble();

        System.out.println("Digite o valor da altura do retângulo: ");
        double altura = sc.nextDouble();

        retangulo r1 = new retangulo(largura, altura);

        System.out.println("Area do retângulo: " + r1.calcularArea());
        System.out.println("Perimetro do retângulo: " + r1.calcularPerimetro());

    }
}
