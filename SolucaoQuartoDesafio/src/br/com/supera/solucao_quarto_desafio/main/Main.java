package br.com.supera.solucao_quarto_desafio.main;

import br.com.supera.solucao_quarto_desafio.classes.Decifra;

/**
 *
 * @author ALISSON JAQUES
 */
public class Main {
    public static void main(String[] args){
        String textoEmbaralhado = "5\nI ENIL SIHTHSIREBBIG S\nLEVELKAYAK\nH "
                + "YPPAHSYADILO\nABCDEFGHIJKLMNOPQRSTUVWXYZ\nVOD OWT SNEH HCNERF "
                + "EGDIRTRAP A DNA SE\n";
        System.out.println(Decifra.defifraTexto(textoEmbaralhado));
    }    
}
