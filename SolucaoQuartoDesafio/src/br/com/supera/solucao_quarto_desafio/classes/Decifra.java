package br.com.supera.solucao_quarto_desafio.classes;

/**
 *
 * @author ALISSON JAQUES
 */
public class Decifra {

    public static String defifraTexto(String texto) {
        String[] listaDeFrases = texto.split("[\\r\\n]+");
        String textoDecifrado = "";
        boolean ignoraPrimeiraLinha = false;

        if (verificaCondicoes(listaDeFrases)) {
            for (String textoEmbaralhado : listaDeFrases) {
                if (ignoraPrimeiraLinha) {
                    textoDecifrado += new StringBuilder(textoEmbaralhado.
                            substring(0, textoEmbaralhado.length() / 2)).reverse().toString();
                    textoDecifrado += new StringBuilder(textoEmbaralhado.
                            substring((textoEmbaralhado.length() / 2),
                                    textoEmbaralhado.length())).reverse().toString() + "\n";
                } else {
                    ignoraPrimeiraLinha = true;
                }

            }
        } else {
            throw new UnsupportedOperationException("Entrada não suportada.");
        }

        return textoDecifrado.trim();
    }

    private static boolean verificaCondicoes(String[] listaDeFrases) {
        try {
            if (Integer.parseInt(listaDeFrases[0]) != listaDeFrases.length - 1) {
                return false;
            }

        } catch (NumberFormatException e) {
            System.out.println("Número de entrada não é válido! Erro: " + e.getMessage());
        }

        return true;
    }
}
