//Faça um programa que leia 5 números e informe o maior número
//e a média desses números.

import java.util.Scanner;

public class maiorEMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        int numero, media = 0, maiorNumero = 0, soma = 0;

        for(int i = 1; i <= 5; i++){
            System.out.println("Digite o " + i + "º número: ");
            numero = entrada.nextInt();

            soma += numero;
            media = soma/i;

            if (numero > maiorNumero) maiorNumero = numero;
        }
            System.out.println("A média dos número digitados é: " + media);
            System.out.println("O maior número digitado é: " + maiorNumero);
            entrada.close();
    }
}
