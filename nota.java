//Faça um programa que peça uma nota, entre zero e dez.
//Mostre uma mensagem caso o valor seja inválido
//e continue pedindo até que o usuário informe um valor válido.

import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nota;
        System.out.println("Digite sua nota: ");
        nota = entrada.nextInt();

        while (nota < 0 ||  nota > 10){
            System.out.println("Nota inválida. Digite uma nota entre 0 e 10: ");
            nota = entrada.nextInt();
        }  
        entrada.close();
    }  
}
