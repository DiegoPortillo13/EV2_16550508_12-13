/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class ListasDobles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListasDoblesD ldLista=new ListasDoblesD();
        ldLista.add(new Nodo(1));
        ldLista.add(new Nodo(2));
        ldLista.add(new Nodo(3));
        ldLista.add(new Nodo(4));
        ldLista.printList();
        System.out.println("");
        ldLista.printListB();
        ldLista.clear();
        ldLista.printList();
        System.out.println("");
        ldLista.printListB();
        ldLista.count();
        ldLista.printList();
        System.out.println("");
        ldLista.printListB();
        
    }
    
}
