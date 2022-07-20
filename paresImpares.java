//Faça um programa que peça N números inteiros,
//calcule e mostre a quantidade de números pares
//e a quantidade de números impares.

import java.util.Scanner;

public class paresImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, quantidadeNumeros, par = 0, impar = 0;

        System.out.println("Informe a quantidade de números que deseja digitar: ");
        quantidadeNumeros = entrada.nextInt();

        int count = 0;
        do{
            System.out.println("Digite os números: ");
            numero = entrada.nextInt();  

                if (numero % 2 == 0) par++; 
                else impar++; 
                count++;

        }while (count < quantidadeNumeros);

        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números ímpares: " + impar);
        entrada.close();
    }
}
