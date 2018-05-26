/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class ArbolBinario {

    private Nodo Root;

    public ArbolBinario() {
        Root = null;
    }

    public ArbolBinario(Nodo Root) {
        this.Root = Root;
    }

    public void addN(Nodo nNodo) throws Exception {
        if (Root == null) {
            Root = nNodo;
        } else {
            addNR(nNodo, Root);
        }
    }

    private void addNR(Nodo nNodo, Nodo Actual) throws Exception {
        if (nNodo.getiD() > Actual.getiD()) {//Mayor Derecha 
            if (Actual.getnSig() == null) {//verificamos si esta vacio el lado derecho
                Actual.setnSig(nNodo);
            } else {//Chin#@#% No esta Vacia
                addNR(nNodo, Actual.getnSig());
            }

        } else if (nNodo.getiD() < Actual.getiD()) {//Menor Izq
            if (Actual.getnPrev() == null) {//verificamos si esta vacio el lado derecho
                Actual.setnPrev(nNodo);
            } else {//Chin#@#% No esta Vacia
                addNR(nNodo, Actual.getnPrev());
            }
        } else {
            throw new Exception("Ta tonto o que??, No acepto valores repetidos");
        }
    }

    public void impPre() {
        PreOr(Root);
    }

    public void impPost() {
        PostOr(Root);
    }
    public void impIn() {
        InOr(Root);
    }

    private void PreOr(Nodo Act) {
        if (Act != null) {
            System.out.print(Act.getiD() + " - ");
            PreOr(Act.getnPrev());
            PreOr(Act.getnSig());
        }
    }

    private void InOr(Nodo Act) {
        if (Act != null) {
            InOr(Act.getnPrev());
            System.out.print(Act.getiD() + " - ");
            InOr(Act.getnSig());
            //System.out.print(Act.getiD() + " - ");
        }
    }

    private void PostOr(Nodo Act) {
        if (Act != null) {
            PostOr(Act.getnPrev());
            PostOr(Act.getnSig());
            System.out.print(Act.getiD() + " - ");
        }

    }}
   /* public void B(int iv){
        Be(Root, iv);
    }
    private void Be(Nodo Act, int iv){
        if (Act != null) {
            if(Act.getiD()==iv){
                System.out.println("Nodo Encontrado: "+Act.getiD());   
            }else{
            if (Act.getiD()<iv){
                Be(Act.getnSig());
            }
        }}
    }*/
//}
