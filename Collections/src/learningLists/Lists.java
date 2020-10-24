package learningLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Lists {
    public static void main(String[] args) {
        /*Dada uma lista de inteiros, devolva o segundo maior número desta lista…*/
        List<Integer> integers = new ArrayList<Integer>(Arrays.asList(1,2,3,5,9,15,23,48632,515,14,163));

        Collections.sort(integers);
        System.out.println(integers.get(integers.size()-2));

    }
}
