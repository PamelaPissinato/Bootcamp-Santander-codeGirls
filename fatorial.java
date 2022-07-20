//Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
//Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número para obter o fatorial: ");
        int numero = entrada.nextInt();

        int fatorial = 1;

            for(int i = numero; i >+ 1 ;i-- ){
                fatorial *= i;
            }

        System.out.println("Fatorial de " + numero + " = " + fatorial);
        entrada.close();
    }
}
