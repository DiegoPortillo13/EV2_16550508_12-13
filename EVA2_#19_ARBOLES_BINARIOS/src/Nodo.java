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
    //Atributos 1.Dato a almacenar 2.enlace al sig nodo o Anterior
    
    private int iD;
    private Nodo nSig;
    private Nodo nPrev;

    public Nodo() {
        this.nSig=null;
        this.nPrev=null;
        
    }

    public Nodo(int iD) {
        this.iD = iD;
        this.nSig=null;
        this.nPrev=null;
    }
    
    public Nodo(int iD, Nodo nSig, Nodo nPrev) {
        this.iD = iD;
        this.nSig = nSig;
        this.nPrev = nPrev;
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
    public Nodo getnPrev() {
        return nPrev;
    }

    public void setnPrev(Nodo nPrev) {
        this.nPrev = nPrev;
    }    
}
