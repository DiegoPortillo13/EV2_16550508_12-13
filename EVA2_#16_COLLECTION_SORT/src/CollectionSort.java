
import java.util.Collections;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class CollectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> List = new LinkedList<>();
        List.add("Hola");
        List.add(" ");
        List.add("Mundo");
        List.add(" ");
        List.add("Cruel");
        List.add("!!");
        System.out.println(List);
        Collections.sort(List);
        System.out.println(List);
        for (String string : List) {
            System.out.print(string);
        }System.out.println("");
        //lista de numeros
        System.out.println("\n-----------------------------------");
         LinkedList<Integer> ListI = new LinkedList<>();
        ListI.add(1);
        ListI.add(25);
        ListI.add(12);
        ListI.add(100);
        ListI.add(50);
        ListI.add(2);
        System.out.println(ListI);
        Collections.sort(ListI);
        System.out.println(ListI);

    }
    
}
