/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class ListaSimple {

    private Nodo nIni;//El nodo que marca el inicio de la lista
    private Nodo nFin;
    private int iCont;
    
    
    public ListaSimple() {
        nIni = null;
        nFin = null;
        iCont =0;
    }

    public ListaSimple(Nodo nIni) {
        this.nIni = nIni;
        this.nFin = nIni;
        iCont = 1;
        
    }
    
    //Agregar un noo al final de la lista
    
    public void add(Nodo nNodo){
        //La lista esta vacia
        if(nIni == null){
            nIni = nNodo;
            nFin = nNodo;
        }else{//La lista esta llena
            //Hay que movernos al final de la lista
           /* Nodo nTemp = nIni;
            while(nTemp.getnSig()!= null){
                nTemp = nTemp.getnSig();
            }
            //Conectar el nuevo nodo al final de la lista
            nTemp.setnSig(nNodo);
            */
           //La seccion comentada es el concepro básico de como funcionan los nodos;
           //el problema es que es poco efectiva porque se tiene que leer toda la lista, si es muy grande tarda demasiado
            nFin.setnSig(nNodo);
            nFin = nNodo;
        }
        iCont++;//Cada vez que agreguemos un nodo iCont aumenta
    }
    
    //Imprimir datos de la lista}
    public void printList(){
        Nodo nTemp = nIni;
        while(nTemp != null){
            System.out.print(nTemp.getiD()+ " - ");
            nTemp = nTemp.getnSig();
        }
    }
    
    //Eliminar todos los elementos de la lista:
    public void clear(){
        nIni = null;//Solo tenemos que desconectar el primer elemento
        nFin = null;//Tambien el final lo tenemos que desconectar
        
    }
    //Vacía o no; devuelve true si la lista esta vacía
    public boolean isEmpty(){
        if(nIni != null){
            return false;//Hay nodos en la lista
        }else{
            return true;//No hay  nodos en la lista
        }
            
    }
    
    //Contar los elementos de la lista
    public int count(){
        
        
         return iCont;
    }
    
    //Insertar en una posición particular
    public void insertAt(Nodo nNodo, int iPos) throws Exception{//No cambiamos datos; cambiamos direcciones de memoria
        //Analizar los casos
        
        if(iPos < 0){//No se pueden insertar en valores negativos
            
            throw new Exception("No se puede agregar un nodo en una posició negativa");
            
        }else if(iPos>count()){//Si queremos insertar en una posicion mayor al tamaño de la lista
            
            throw new Exception("No se puede agregar un nodo en una posició mayor que el tamaño de la lista");
            
        }else if(iPos == 0){//Se quiere agregar al inicio de la lista
                    nNodo.setnSig(nIni);//Nuevo nodo.sig = nIni
                    nIni = nNodo;
                    }
        else{
                        Nodo nTemp = nIni;
                        for (int i = 0; i < (iPos-1); i++) {
                            nTemp.getnSig();
                            
                        }
                        nNodo.setnSig(nTemp.getnSig());
                        nTemp.setnSig(nNodo);
                        
        }
        
        
        
    }
    
    //Imprimir una posición especifíca
    public int getValueAt(int iPos) throws Exception{
        if(iPos < 0){//No se pueden insertar en valores negativos
            
            throw new Exception("No se puede leer un nodo en una posició negativa");
            
        }else if(iPos>count()){//Si queremos insertar en una posicion mayor al tamaño de la lista
            
            throw new Exception("No se puede leer un nodo en una posició mayor que el tamaño de la lista");
            
        }else{
        
                        Nodo nTemp = nIni;
                        for (int i = 0; i < iPos; i++) {
                            nTemp.getnSig();
                            
                        }
                        return nTemp.getiD();
                        
        }     
                        
    }
}
