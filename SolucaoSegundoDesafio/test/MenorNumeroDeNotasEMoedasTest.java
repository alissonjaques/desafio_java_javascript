
import br.com.supera.solucao_segundo_desafio.classes.MenorNumeroDeNotasEMoedas;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author ALISSON JAQUES
 */
public class MenorNumeroDeNotasEMoedasTest {

    @Test
    public void deveriaCalcularOMenorNumeroDeNotasEMoedasPossiveis() {
        double valor = 576.73;
        assertEquals("Deveria calcular o menor número de notas e moedas possíveis "
                + "no qual o valor pode ser decomposto",
                "NOTAS:\n"
                + "5 nota(s) de R$ 100.00\n"
                + "1 nota(s) de R$ 50.00\n"
                + "1 nota(s) de R$ 20.00\n"
                + "0 nota(s) de R$ 10.00\n"
                + "1 nota(s) de R$ 5.00\n"
                + "0 nota(s) de R$ 2.00\n"
                + "MOEDAS:\n"
                + "1 moeda(s) de R$ 1.00\n"
                + "1 moeda(s) de R$ 0.50\n"
                + "0 moeda(s) de R$ 0.25\n"
                + "2 moeda(s) de R$ 0.10\n"
                + "0 moeda(s) de R$ 0.05\n"
                + "3 moeda(s) de R$ 0.01",
                MenorNumeroDeNotasEMoedas.getMenorNumeroDeNotasEMoedas(valor));

        valor = 10753.7894;
        assertEquals("Deveria calcular o menor número de notas e moedas possíveis "
                + "no qual o valor pode ser decomposto",
                "NOTAS:\n"
                + "107 nota(s) de R$ 100.00\n"
                + "1 nota(s) de R$ 50.00\n"
                + "0 nota(s) de R$ 20.00\n"
                + "0 nota(s) de R$ 10.00\n"
                + "0 nota(s) de R$ 5.00\n"
                + "1 nota(s) de R$ 2.00\n"
                + "MOEDAS:\n"
                + "1 moeda(s) de R$ 1.00\n"
                + "1 moeda(s) de R$ 0.50\n"
                + "1 moeda(s) de R$ 0.25\n"
                + "0 moeda(s) de R$ 0.10\n"
                + "0 moeda(s) de R$ 0.05\n"
                + "4 moeda(s) de R$ 0.01",
                MenorNumeroDeNotasEMoedas.getMenorNumeroDeNotasEMoedas(valor));
        
        valor = 753.999;
        assertEquals("Deveria calcular o menor número de notas e moedas possíveis "
                + "no qual o valor pode ser decomposto",
                "NOTAS:\n"
                + "7 nota(s) de R$ 100.00\n"
                + "1 nota(s) de R$ 50.00\n"
                + "0 nota(s) de R$ 20.00\n"
                + "0 nota(s) de R$ 10.00\n"
                + "0 nota(s) de R$ 5.00\n"
                + "2 nota(s) de R$ 2.00\n"
                + "MOEDAS:\n"
                + "0 moeda(s) de R$ 1.00\n"
                + "0 moeda(s) de R$ 0.50\n"
                + "0 moeda(s) de R$ 0.25\n"
                + "0 moeda(s) de R$ 0.10\n"
                + "0 moeda(s) de R$ 0.05\n"
                + "0 moeda(s) de R$ 0.01",
                MenorNumeroDeNotasEMoedas.getMenorNumeroDeNotasEMoedas(valor));
    }
    
    @Test
    public void naoDeveriaAceitarValoresMenoresDoQueZeroOuMaioresQueUmMilhao(){
        assertEquals("Não deveria aceitar valores negativos", "Valor inválido!",
                MenorNumeroDeNotasEMoedas.getMenorNumeroDeNotasEMoedas(-2000.0));
        assertEquals("Não deveria aceitar valores maiores que um milhao", "Valor inválido!",
                MenorNumeroDeNotasEMoedas.getMenorNumeroDeNotasEMoedas(10000001.0));
    }
}
