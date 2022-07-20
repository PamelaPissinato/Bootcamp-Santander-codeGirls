//Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.

public class ordemInversa {
    public static void main(String[] args) {
        int vetor[] = {1,2,3,4,5,6};

        int count = 0;

        System.out.print("Vetor original: ");
            while(count < (vetor.length)){
                System.out.println(vetor[count] + " " );
                count++;
            }

        System.out.print("Vetor inverso: ");
            for(int i = (vetor.length - 1); i >= 0; i --) {
                System.out.print(vetor[i] + " ");
            }
        }
}
