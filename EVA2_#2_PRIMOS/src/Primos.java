/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class Primos {

    /**
     * @param args the command line arguments
     */
    static int lento=0;
    static int rapido=0;
    public static void main(String[] args) {
        // TODO code application logic here
        int iNum = 175783;
        if (PrimoL(iNum)) {
            System.out.println("el numero " + iNum + " es primo");
        } else {
            System.out.println("el numero " + iNum + " no es primo");
        }
        System.out.println("Lento = "+lento);
        if (PrimoR(iNum)) {
            System.out.println("R-el numero " + iNum + " es primo");
        } else {
            System.out.println("R-el numero " + iNum + " no es primo");
        }
        System.out.println("rapido = "+rapido);
    }

    public static boolean PrimoL(int iNum) {
        lento=0;
        boolean bBande = true;
        for (int i = 2; i < iNum; i++) {//numero no es primo
            int iRes = iNum % i;
            if (iRes == 0) {
                bBande = false;
                break;
            }
            lento++;
        }
        return bBande;
    }

    public static boolean PrimoR(int iNum) {
        rapido=0;
        boolean bBande = true;
        int iRaiz=(int)Math.sqrt(iNum)+1;
        for (int i = 2; i < iRaiz; i++) {//numero no es primo
            int iRes = iNum % i;
            if (iRes == 0) {
                bBande = false;
                break;
            }
            rapido++;
        }
        return bBande;
    }

}
