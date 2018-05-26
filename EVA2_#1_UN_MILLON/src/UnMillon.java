/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class UnMillon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] Arr1=new int[300000000];
        for (int i = 0; i < Arr1.length; i++) {
            Arr1[i]=(int)(Math.random()*999)+1;
        }
        
    }
    
}
