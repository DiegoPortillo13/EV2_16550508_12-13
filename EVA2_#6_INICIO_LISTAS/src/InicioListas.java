/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class InicioListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo nN1=new Nodo();
        nN1.iD=1;
        nN1.nS=null;
        Nodo nN2=new Nodo();
        nN2.iD=2;
        nN2.nS=null;
        Nodo nN3=new Nodo();
        nN3.iD=3;
        nN3.nS=null;
        //hasta aqui es indeoendiente.Hay q enlazarlo
        //N1-->N2-->N3-->Null
        nN1.nS=nN2;
        nN2.nS=nN3;
        //Probar la cadena
        System.out.println("Nodo 1 = "+nN1.iD);//Directo se puede con todos
        System.out.println("Nodo 2 = "+nN1.nS.iD);//Otra forma de imprimir el Sig nodo
        System.out.println("Nodo 3 = "+nN2.nS.iD);//nN1.nS.nS.iD otra forma pero mas extensa 
        //recorrer una lista
        Nodo nTemp=nN1;
        while(nTemp!=null){
            System.out.println("+Nodo = "+nTemp.iD);
            nTemp=nTemp.nS;
        }
    }
    
}
class Nodo{
    public int iD;//lo que guardamos 
    public Nodo nS;//enlace para crear la lista
    
}