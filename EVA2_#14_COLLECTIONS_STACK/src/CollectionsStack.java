
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class CollectionsStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<Integer> scPila= new Stack();
        scPila.add(10);
        scPila.add(20);
        scPila.add(30);
        scPila.add(40);
        System.out.println(scPila.peek());
        System.out.println(scPila.pop());
        System.out.println(scPila.pop());
        
        Set<Integer> stC=new LinkedHashSet();
        stC.add(10);
        stC.add(10);
        stC.add(20);
        stC.add(30);
        stC.add(30);
        stC.add(40);
        stC.add(40);
        stC.add(50);
        stC.add(50);
        System.out.println(stC);
    }
    
}
