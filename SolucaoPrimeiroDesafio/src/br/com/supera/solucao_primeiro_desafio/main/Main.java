package br.com.supera.solucao_primeiro_desafio.main;

import br.com.supera.solucao_primeiro_desafio.classes.OrdenaNumeros;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALISSON JAQUES
 */
public class Main {

    public static void main(String[] args) {
        try {
            String entrada = lerArquivo("src\\br\\com\\supera\\solucao_primeiro_desafio\\entradas\\entrada01.txt");
            OrdenaNumeros ordenaNumeros = new OrdenaNumeros();
            System.out.println(ordenaNumeros.ordenar(entrada));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro ao ler arquivo! Erro: " + ex.getMessage());
        }
    }

    public static String lerArquivo(String caminho) throws IOException {
        String entrada = "";
        try (BufferedReader buffRead = new BufferedReader(new FileReader(caminho))) {
            String linha = "";
            while (true) {
                if (linha != null) {
                    entrada += linha + "\n";                    
                } else {
                    break;
                }
                linha = buffRead.readLine();
            }
        }
        return entrada.trim();
    }
}
