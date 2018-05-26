
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
public class CollectionObj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Simple> llObj=new LinkedList();
        llObj.add(new Simple());
        llObj.add(new Simple());
        llObj.add(new Simple());
        llObj.add(new Simple());
    }
  
}
  class Simple{
        public int iD;
  }
    
