/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Factorial(5));
        System.out.println(Sumatoria(6));
    }

    public static int Factorial(int iVal) {
        if (iVal == 0) {
            return 1;
        } else {
            return iVal * Factorial(iVal - 1);
        }
    }
    public static  int Sumatoria(int iVal){
        if (iVal==0) {
            return 0;
        }else{
            return iVal + Sumatoria(iVal-1);
        }
    }
}
