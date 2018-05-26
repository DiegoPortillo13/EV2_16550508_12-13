/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class Nodo {
    //Atributos 1.Dato a almacenar 2.enlace al sig nodo
    private int iD;
    private Nodo nSig;

    public Nodo() {
        this.nSig=null;
    }

    public Nodo(int iD) {
        this.iD = iD;
        this.nSig=null;
    }
    
    public Nodo(int iD, Nodo nSig) {
        this.iD = iD;
        this.nSig = nSig;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }
    
    
}
