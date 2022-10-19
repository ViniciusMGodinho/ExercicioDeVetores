import java.util.*;
public class ExercicioVetores {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        //Variaveis
        double[] vetor = new double[10];
        double somatorio = 0, media = 0, par = 0, impar = 0;

        //Entrada
        for (int i = 0; i <= vetor.length; i++) {
            if (i < vetor.length) {
                System.out.println("Informe o " + i + " número: ");
                vetor[i] = Entrada.nextDouble();
                somatorio = somatorio + vetor[i];
            }
            if (vetor[i] % 2 == 0) {
                par = par + 1;
            } else {
                impar = impar + 1;
            }
            if (i == (vetor.length)-1) {
                System.out.println("O somatório dos valores do vetor é " + somatorio);
                System.out.println("-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                media = somatorio / vetor.length;
                System.out.println("A media dos valores inserido é: " + media);
                System.out.println("-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println(par + " pares e " + impar + " ímpares");
                System.out.println("-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                for(int j = (vetor.length)-1; j >= 0; j--){
                    System.out.print(vetor[j] + "|");
                }
            }
        }
    }
}