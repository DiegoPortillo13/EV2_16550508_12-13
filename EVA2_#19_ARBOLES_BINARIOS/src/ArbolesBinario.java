
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Diego
 */
public class ArbolesBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBinario Arb = new ArbolBinario();
        try {
            Arb.addN(new Nodo(15));
            Arb.addN(new Nodo(7));
            Arb.addN(new Nodo(25));
            Arb.addN(new Nodo(10));
            Arb.addN(new Nodo(18));
            Arb.addN(new Nodo(11));
        } catch (Exception ex) {
            Logger.getLogger(ArbolesBinario.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("PreOrder");
        Arb.impPre();
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("PostOrder");
        Arb.impPost();
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("InOrder");
        Arb.impIn();
    }

}
