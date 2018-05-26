/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class ListasDoblesD {

    private Nodo nIni;//El nodo que marca el inicio de la lista
    private Nodo nFin;
    private int iCont;

    public ListasDoblesD(Nodo nNodo) {
        this.nIni = nNodo;
        this.nFin = nNodo;
        iCont = 1;
    }

    public ListasDoblesD() {
        nIni = null;
        nFin = null;
        iCont = 0;
    }

    public void add(Nodo nNodo) {
        if (nIni == null) {
            nIni = nNodo;
            nFin = nNodo;
        } else {//La lista esta llena
            nFin.setnSig(nNodo);
            nNodo.setnPrev(nFin);
            nFin = nNodo;
        }
        iCont++;
    }

    public void printList() {//hacia adelante
        Nodo nTemp = nIni;
        while (nTemp != null) {
            System.out.print(nTemp.getiD() + " - ");
            nTemp = nTemp.getnSig();
        }
    }

    public void printListB() {
        Nodo nTemp = nFin;
        while (nTemp != null) {
            System.out.print(nTemp.getiD() + " - ");
            nTemp = nTemp.getnPrev();
        }
    }

    public void clear() {
        nIni = null;//Solo tenemos que desconectar el primer elemento
        nFin = null;//Tambien el final lo tenemos que desconectar

    }

    public boolean isEmpty() {
        if (nIni != null) {
            return false;//Hay nodos en la lista
        } else {
            return true;//No hay  nodos en la lista
        }

    }

    public int count() {

        return iCont;
    }

}
