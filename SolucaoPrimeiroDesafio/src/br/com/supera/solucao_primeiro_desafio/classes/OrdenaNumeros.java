package br.com.supera.solucao_primeiro_desafio.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ALISSON JAQUES
 */
public class OrdenaNumeros {
    
    public String ordenar(String entrada){
        String[] numerosEmTexto = entrada.split("[\\r\\n]+");
        String textoOrdenado = "";
        List<Integer> listaDeNumeros = converteEmListaDeNumeros(numerosEmTexto);
        if(verificaCondicoes(listaDeNumeros)){
            listaDeNumeros.remove(listaDeNumeros.get(0));
            List<Integer> saidaOrdenada = ordenaValores(listaDeNumeros);
            
            for(Integer valor: saidaOrdenada){
                textoOrdenado += valor + "\n";
            }
                        
        } else{
           throw new UnsupportedOperationException("Entrada não suportada."); 
        }
        return textoOrdenado.trim();
    }
    
    
    private List<Integer> converteEmListaDeNumeros(String[] numerosEmTexto) {
        List<Integer> numeros = new ArrayList();
        try{
            for(String valor: numerosEmTexto){
                numeros.add(Integer.parseInt(valor));
            }
        }catch(NumberFormatException e){
            System.out.println("Número não válido! Erro: " + e.getMessage());
        }
        return numeros;
    }
    
    private boolean verificaCondicoes(List<Integer> listaDeNumeros){        
        
        if(listaDeNumeros.get(0) <= 1 || listaDeNumeros.get(0)>Math.pow(10,5)){
            return false;
        }
        
        if (!listaDeNumeros.stream().noneMatch((valor) -> (valor<0))) {
            return false;
        }
        
        return listaDeNumeros.get(0) == listaDeNumeros.size()-1;
    }
    
    private List<Integer> ordenaValores(List<Integer> valores){
        List<Integer> listaDeNumerosPares = new ArrayList();
        List<Integer> listaDeNumerosImpares = new ArrayList();
        List<Integer> listaOrdenada = new ArrayList();
        
        valores.forEach((valor) -> {
            if(valor % 2 == 0){
                listaDeNumerosPares.add(valor);
            } else{
                listaDeNumerosImpares.add(valor);
            }
        });
        
        Collections.sort(listaDeNumerosPares);
        Collections.sort(listaDeNumerosImpares);
        Collections.reverse(listaDeNumerosImpares);
        
        listaDeNumerosPares.forEach((valor) -> {
            listaOrdenada.add(valor);
        });
        
        listaDeNumerosImpares.forEach((valor) -> {
            listaOrdenada.add(valor);
        });
        
        return listaOrdenada;
    }
}
