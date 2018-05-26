
import java.util.LinkedList;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class CollectionDouble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<Integer> qCola = new LinkedList();
        qCola.add(10);
        qCola.add(20);
        qCola.add(30);
        qCola.add(40);
        System.out.println("El primero es"+qCola.element());
        System.out.println("El primero es(peek)"+qCola.peek());
        System.out.println("El primero es(poll)"+qCola.poll());
        System.out.println("El primero es(poll)"+qCola.poll());
        System.out.println("El primero es(poll)"+qCola.poll());
        System.out.println("El primero es(poll)"+qCola.poll());
    
}}
