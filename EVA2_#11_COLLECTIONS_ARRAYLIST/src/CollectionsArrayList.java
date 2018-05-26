
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class CollectionsArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> alArray= new ArrayList();
        alArray.add(10);
        alArray.add(20);
        alArray.add(30);
        alArray.add(40);
        // se puede recorrer con un for o un fore
        System.out.println("-------------fore");
        for (Integer integer : alArray) {
            System.out.print(integer+" ");
        }System.out.println("");
        System.out.println("--------------For");
        for (int i = 0; i < alArray.size(); i++) {
            System.out.print(alArray.get(i)+" ");
        }System.out.println("");
        System.out.println("------------iterador");
        for (Iterator<Integer> iterator = alArray.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();
            System.out.print(next+" ");
            
        }System.out.println("");
        System.out.println("-----------iterator while");
        Iterator itIt=alArray.iterator();
        while(itIt.hasNext()){
            System.out.print(itIt.next()+" ");
        }System.out.println("");
        System.out.println("---------------remove");
        alArray.remove((Object)30);
        for (Integer integer : alArray) {
            System.out.print(integer+" ");
        }System.out.println("");
        System.out.println("--------------remove 2");
        alArray.remove(0);
        for (Integer integer : alArray) {
            System.out.print(integer+" ");
        }System.out.println();
        System.out.println("-------------clear");
        alArray.clear();
        for (Integer integer : alArray) {
            System.out.print(integer+" ");
        }System.out.println();
    }
    
}
