package br.com.supera.solucao_primeiro_desafio.classes;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author ALISSON JAQUES
 */
public class OrdenaNumerosTest {

    private OrdenaNumeros ordenaNumeros;

    @Before
    public void beforeAll() {
        setOrdenaNumeros(new OrdenaNumeros());
    }

    @Test
    public void deveriaRetornarListasOrdenadasCrescenteParDescrescenteImpar() {
        assertEquals("Deveria retornar a lista com números pares em ordem crescente, "
                + "seguidos de números ímpares em ordem decrescente",
                "4\n"
                + "32\n"
                + "34\n"
                + "98\n"
                + "654\n"
                + "3456\n"
                + "6789\n"
                + "567\n"
                + "543\n"
                + "87",
                ordenaNumeros.ordenar("10\n"
                        + "4\n"
                        + "32\n"
                        + "34\n"
                        + "543\n"
                        + "3456\n"
                        + "654\n"
                        + "567\n"
                        + "87\n"
                        + "6789\n"
                        + "98"));       
    }

    /**
     * @return the ordenaNumeros
     */
    public OrdenaNumeros getOrdenaNumeros() {
        return ordenaNumeros;
    }

    /**
     * @param ordenaNumeros the ordenaNumeros to set
     */
    public void setOrdenaNumeros(OrdenaNumeros ordenaNumeros) {
        this.ordenaNumeros = ordenaNumeros;
    }
}
