package br.com.supera.solucao_quarto_desafio.classes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 *
 * @author ALISSON JAQUES
 */
public class DecifraTest {
    @Test
    public void deveriaDecifrarOsTextos() {
        assertEquals("Deveria retorna o texto decifrado",
                "THIS LINE IS GIBBERISH\n"
                        + "LEVELKAYAK\n"
                        + "HAPPY HOLIDAYS\n"
                        + "MLKJIHGFEDCBAZYXWVUTSRQPON\n"
                        + "FRENCH HENS TWO DOVES AND A PARTRIDGE",
                 Decifra.defifraTexto("5\nI ENIL SIHTHSIREBBIG S\nLEVELKAYAK\nH "
                + "YPPAHSYADILO\nABCDEFGHIJKLMNOPQRSTUVWXYZ\nVOD OWT SNEH HCNERF "
                + "EGDIRTRAP A DNA SE\n"));    
        
        assertEquals("Deveria retorna o texto decifrado","NAM  SOG",Decifra.defifraTexto("1\n MANGOS "));
    }
}
