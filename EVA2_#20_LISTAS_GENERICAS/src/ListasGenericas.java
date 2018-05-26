
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class ListasGenericas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Tipos de datos genericos
        //ArrayList <Integer> ListE = new ArrayList();
        //ListE.add(100);
        WardAny <Integer> objW = new WardAny();
        objW.setCade(100);
        System.out.println(objW.getCade());
    }
    
}
class WardAny <L>{
    private L Cade;

    public L getCade() {
        return Cade;
    }

    public void setCade(L Cade) {
        this.Cade = Cade;
    }

    public WardAny() {
    }

    public WardAny(L Cade) {
        this.Cade = Cade;
    }
    
}