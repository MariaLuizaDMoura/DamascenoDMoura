package Vixta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/*
*VIXTA
*PROG007: Avaliação VIXTA
*Data: 08/02/2022
*Autor:Maria Luiza Moura
*Função:
Escreva uma função chamada "findSum" que tenha 2 argumentos:
- Um array contendo números em ordem crescente
- Um número que corresponde ao valor da soma desejada.

A função deve procurar dentro da matriz para encontrar 2 elementos que possam ser adicionados para corresponder à soma desejada. 
Se os dois valores forem encontrados, retorne-os como um novo array. Se nenhum valor for encontrado, retorne nulo.*/
public class Exercicio7 {
	public static void sortTheArrayByFrequency(int[] array){
		Locale.setDefault(Locale.US);
	    Map<Integer, Integer> map = new HashMap<>();

	    //colocar elementos da matriz com base em suas frequências
	    for(int i : array){
	        map.put(i, map.getOrDefault(i,0)+1);  
	    }

	    //Coloque o hashmap em uma lista onde usamos comparador personalizado
	    List<Map.Entry<Integer, Integer>> list = new ArrayList<>();
	    for(Map.Entry<Integer, Integer> e : map.entrySet()){
	        list.add(e);
	    }

	    // list looks like [1=5, 2=3, 3=3, 4=2, 5=1]

	    Collections.sort(list, (a, b) -> {
	        // se suas ocorrências forem as mesmas, classifique naturalmente
	        //senão classificar com base em frequências
	        if(a.getValue() == b.getValue())
	            return a.getKey() - b.getKey();
	        else
	            return a.getValue() - b.getValue();
	    });

	    // lista parece [5=1, 4=2, 2=3, 3=3, 1=5]

	    for(Map.Entry<Integer, Integer> e : list){
	        int num = e.getValue();
	        while(num!=0){
	            System.out.print(e.getKey()+ " ");
	            num--;
	        }
	    }
	}
}

/*Solução : -
1 . Crie um HashMap que armazene os elementos do array e suas ocorrências
2 . Coloque o hashmap em uma lista onde podemos aplicar a classificação com base em suas frequências usando um comparador personalizado
3 . A comparação de objetos em Java: -
  se Obj1for menor, Obj2então retornar -1
  se Obj1for igual a Obj2então retornar 0
  se Obj1for maior que Obj2 então retornar +1
4 . No nosso caso, se dois números têm as mesmas frequências, devemos colocar o número que tem precedência natural na saída*/
