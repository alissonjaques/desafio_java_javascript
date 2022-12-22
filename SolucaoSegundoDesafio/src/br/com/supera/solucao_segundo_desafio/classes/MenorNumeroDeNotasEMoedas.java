package br.com.supera.solucao_segundo_desafio.classes;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author ALISSON JAQUES
 */
public class MenorNumeroDeNotasEMoedas {
 
    public static String getMenorNumeroDeNotasEMoedas(double valor) {
        
        if( valor < 0 || valor > 1000000.00){
            return "Valor inválido!";
        }
        
        BigDecimal bd = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
        double valorComDuasCasas = Double.parseDouble(String.format("%.2f", 
                bd.doubleValue()).replace(".","").replace(",","."));
        double moedas;
        int notas, cemReais, restoCemReais, cinquentaReais, restoCinquentaReais, 
                vinteReais, restoVinteReais, dezReais, restoDezReais, 
                cincoReais, restoCincoReais, doisReais, restoDoisReais, 
                moedaUmReal, restoMoedaUmReal, 
                moedaCinquentaCentavos, restoMoedaCinquentaCentavos, 
                moedaVinteECincoCentavos, restoMoedaVinteECincoCentavos, moedaDezCentavos,
                restoMoedaDezCentavos, moedaCincoCentavos, moedaUmCentavo;
        
        // notas
        notas = (int)valorComDuasCasas;
        cemReais = notas / 100;
        restoCemReais = notas % 100;
        cinquentaReais = restoCemReais / 50;
        restoCinquentaReais = restoCemReais % 50;
        vinteReais = restoCinquentaReais / 20; 
        restoVinteReais = restoCinquentaReais % 20;
        dezReais = restoVinteReais / 10;
        restoDezReais = restoVinteReais % 10;
        cincoReais = restoDezReais / 5;
        restoCincoReais = restoDezReais % 5;
        doisReais = restoCincoReais / 2;
        restoDoisReais = restoCincoReais % 2;
        // moeda
        moedas = valorComDuasCasas * 100;
        moedaUmReal = (int) moedas;
        restoMoedaUmReal = moedaUmReal % 100;
        moedaCinquentaCentavos = restoMoedaUmReal / 50;
        restoMoedaCinquentaCentavos = restoMoedaUmReal % 50;
        moedaVinteECincoCentavos = restoMoedaCinquentaCentavos / 25;
        restoMoedaVinteECincoCentavos = restoMoedaCinquentaCentavos % 25;
        moedaDezCentavos = restoMoedaVinteECincoCentavos / 10;
        restoMoedaDezCentavos = restoMoedaVinteECincoCentavos % 10;
        moedaCincoCentavos = restoMoedaDezCentavos / 5;
        moedaUmCentavo = restoMoedaDezCentavos % 5;
        
        StringBuilder saidaFormatada = new StringBuilder();
        // notas
        saidaFormatada.append("NOTAS:\n");
        saidaFormatada.append(cemReais).append(" nota(s) de R$ 100.00\n");
        saidaFormatada.append(cinquentaReais).append(" nota(s) de R$ 50.00\n");
        saidaFormatada.append(vinteReais).append(" nota(s) de R$ 20.00\n");
        saidaFormatada.append(dezReais).append(" nota(s) de R$ 10.00\n");
        saidaFormatada.append(cincoReais).append(" nota(s) de R$ 5.00\n");
        saidaFormatada.append(doisReais).append(" nota(s) de R$ 2.00\n");
        // moedas
        saidaFormatada.append("MOEDAS:\n");
        saidaFormatada.append(restoDoisReais).append(" moeda(s) de R$ 1.00\n");
        saidaFormatada.append(moedaCinquentaCentavos).append(" moeda(s) de R$ 0.50\n");
        saidaFormatada.append(moedaVinteECincoCentavos).append(" moeda(s) de R$ 0.25\n");
        saidaFormatada.append(moedaDezCentavos).append(" moeda(s) de R$ 0.10\n");
        saidaFormatada.append(moedaCincoCentavos).append(" moeda(s) de R$ 0.05\n");
        saidaFormatada.append(moedaUmCentavo).append(" moeda(s) de R$ 0.01");

        return saidaFormatada.toString();
    }

}
