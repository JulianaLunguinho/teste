package learingSets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        Set<String> fruits = new HashSet<String>();

/*Escreva um programa Java para anexar o elemento especificado ao final de um conjunto hash.*/
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("strawberry");

/*Escreva um programa Java para iterar por meio de todos os elementos em uma lista de hash.*/
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

/*Escreva um programa Java para clonar um conjunto de hash para outro conjunto de hash.*/
        Set<String> copyFruits = new HashSet<String>();

        for(String fruit : fruits) {
            copyFruits.add(fruit);
        }

/*Escreva um programa Java para comparar dois conjuntos de hash.*/
        fruits.equals(copyFruits);

/*Escreva um programa Java para obter o número de elementos em um conjunto hash.*/
        fruits.size();

/*Escreva um programa Java para esvaziar um conjunto hash.*/
        fruits.clear();

/*Escreva um programa Java para testar se um conjunto de hash está vazio ou não.*/
        fruits.isEmpty();

/*Escreva um programa Java para converter um conjunto hash em um array.*/
        String[] array = new String[copyFruits.size()];
        copyFruits.toArray(array);

/*Escreva um programa Java para converter um conjunto de hash em uma Lista / ArrayList.*/
        List<String> listFruits = new ArrayList<>();
        listFruits.addAll(fruits);

/*Escreva um programa Java para comparar dois conjuntos e reter elementos que são iguais em ambos os conjuntos.*/
        Set<String> comparator = new HashSet<>();

        comparator.addAll(listFruits);
        for (int i = 0; i < array.length; i++) {
            comparator.add(array[i]);
        }

    }
}
