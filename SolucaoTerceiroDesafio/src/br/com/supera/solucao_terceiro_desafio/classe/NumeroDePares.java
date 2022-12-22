package br.com.supera.solucao_terceiro_desafio.classe;

import java.util.Scanner;

/**
 *
 * @author ALISSON JAQUES
 */
public class NumeroDePares {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = scan.nextInt();
        if (tamanho <= 0) {
            System.out.println("O tamanho ["+tamanho+"] não é válido.\nPrograma encerrado.");
        } else {
            System.out.print("Informe o valor alvo: ");
            int valorAlvo = scan.nextInt();
            
            int[] vetor = new int[tamanho];
            System.out.println("Agora preencha os campos do vetor: ");
            for(int i = 0; i<vetor.length; i++){
                System.out.print("["+i+"]: ");
                vetor[i] = scan.nextInt();
            }
            System.out.println(getNumeroDePares(vetor, valorAlvo));
        }
    }

    public static int getNumeroDePares(int[] listaDeInteiros, int alvo) {
        int contador = 0;
        for (int i = 0; i < listaDeInteiros.length; i++) {
            for (int j = i; j < listaDeInteiros.length; j++) {
                if (listaDeInteiros[i] - listaDeInteiros[j] == alvo) {
                    contador++;
                }
                if (listaDeInteiros[j] - listaDeInteiros[i] == alvo) {
                    contador++;
                }
            }
        }
        return contador;
    }
}
