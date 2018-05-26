
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
public class CollectionList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> llListP=new LinkedList();
        
        llListP.add("Hola");
        llListP.add(" ");
        llListP.add("Mundo");
        llListP.add(" ");
        llListP.add("Cruel ");
        System.out.println(llListP);
        for (String string : llListP) {
            System.out.print(string);
        }System.out.println("");
        llListP.removeLast();
         for (String string : llListP) {
            System.out.print(string);
        }
    }
    
}
