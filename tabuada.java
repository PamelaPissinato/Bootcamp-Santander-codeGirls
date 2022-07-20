//Desenvolva um gerador de tabuada,capaz de gerar a tabuada de qualquer número inteiro
//entre 1 e 10. O usuário deve informar de qual numero ele deseja ver a tabuada.

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número que deseja ver a tabuada do 1 ao 10: ");
        int numero = entrada.nextInt();

        System.out.println("Tabuada do " + numero + ": ");

        int tabuada = 0, count = 0;
            for(int i = 1; i <= 10; i++){
                tabuada = numero * i;
                count++;
                System.out.println(numero + " X " + i + " = " + tabuada);
            }
            entrada.close();
    }
}
