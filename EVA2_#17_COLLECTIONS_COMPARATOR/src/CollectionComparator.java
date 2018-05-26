
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Diego
 */
public class CollectionComparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> ListSOI = new LinkedList<>();
        ListSOI.add("Diego");
        ListSOI.add("Aaron");
        ListSOI.add("Aaronstasio");
        ListSOI.add("Alberto");
        ListSOI.add("Rosalba");
        ListSOI.add("Ramon");
        ListSOI.add("Ariel");
        ListSOI.add("Aeeeeee");
        ListSOI.add("Aiiiiii");

        System.out.println(ListSOI);
        //Collections.sort(ListSOI);
        //System.out.println("---------------------------------");
        //System.out.println(ListSOI);
        System.out.println("---------------------------------");
        //Ordenamiento al revez
        Comparator OrdZA = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String cade1, cade2;
                cade1 = (String) o1;
                cade2 = (String) o2;
                int iR = 0;
                char c1, c2;
                c1 = cade1.charAt(0);
                c2 = cade2.charAt(0);
                //iR=c1-c2// a-z
                iR = c2 - c1;//z-a
                return iR;
            }
        };

        Collections.sort(ListSOI, OrdZA);
        System.out.println(ListSOI);
        System.out.println("---------------------------------");
      
        Comparator cmOrdenarZ_A = new Comparator() {//Case anónima de una clase abstracta
            @Override
            public int compare(Object o1, Object o2) {
                String cad1, cad2;
                cad1 = (String) o1;
                cad2 = (String) o2;
                int iResu = 0;//Dependiendo el valor de iResu ordenaremos los valores                
                char c1, c2;
                c1 = cad1.charAt(0);
                c2 = cad2.charAt(0);
                if (c1 == c2) {
                    if (cad1.length() < cad2.length()) {
                        for (int i = 1; i < cad1.length(); i++) {
                            c1 = cad1.charAt(i);
                            c2 = cad2.charAt(i);
                            if (c1 != c2) {
                                iResu = c2 - c1;
                                break;
                            }
                        }
                    } else {
                        for (int i = 1; i < cad2.length(); i++) {
                            c1 = cad1.charAt(i);
                            c2 = cad2.charAt(i);
                            if (c1 != c2) {
                                iResu = c2 - c1;
                                break;
                            }
                        }
                    }
                } else {
                    iResu = c2 - c1;
                }
                //Si lo implementamos bien es necesario implementar algo para evitar que truene
                //iResu = c1 - c2; //a-z (0 - 9)
                //iResu = c2 - c1;//z-a (0 -9)

                return iResu;
            }
        };
        Collections.sort(ListSOI, cmOrdenarZ_A);
        System.out.println(ListSOI);
        System.out.println("---------------------------------");
    }
}
