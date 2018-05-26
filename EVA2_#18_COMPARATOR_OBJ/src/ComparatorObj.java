
import com.sun.istack.internal.Pool;
import java.util.Collection;
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
public class ComparatorObj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Persona> llLista=new LinkedList();
        llLista.add(new Persona("Ariel","Estrada",19));
        llLista.add(new Persona("Alejandro","Estrada",85));
        llLista.add(new Persona("Timmy","Turner",10));
        llLista.add(new Persona("TT","Matutino",25));
        llLista.add(new Persona("Leonardo","Hernandez",1));
        llLista.add(new Persona("Leonardo","Hernandez",17));
        llLista.add(new Persona());
         impL(llLista);
        //Comparator Ap
        Comparator Ape=new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                //los obj son personas
                Persona Per1, Per2;
                Per1 = (Persona) o1;
                Per2 = (Persona) o2;
                String cade1, cade2;
                cade1 = Per1.getApe();
                cade2 = Per2.getApe();
                int iR = 0;
                char c1, c2;
                c1 = cade1.charAt(0);
                c2 = cade2.charAt(0);
                iR=c1-c2;// a-z
                return iR;
            }
          
        
        };
        System.out.println("Apellido");
        System.out.println("----------------------------------------------------");
        Collections.sort(llLista, Ape);
        impL(llLista);
        //Comparator Edad
        Comparator Edad=new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                //los obj son personas
                Persona Per1, Per2;
                Per1 = (Persona) o1;
                Per2 = (Persona) o2;
                int cade1, cade2;
                cade1 = Per1.getEdad();
                cade2 = Per2.getEdad();
                int iR = 0;
                
                iR=cade1-cade2;// a-z
                return iR;
            }
          
        
        };
        System.out.println("Edad");
        System.out.println("-------------------------------------------------");
        Collections.sort(llLista, Edad);
        impL(llLista);
        //Comparator Edad-Ape
           Comparator ApeE=new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                //los obj son personas
                
                Persona Per1, Per2;
                Per1 = (Persona) o1;
                Per2 = (Persona) o2;
                String cade1, cade2;
                cade1 = Per1.getApe();
                cade2 = Per2.getApe();
                int Edad1=Per1.getEdad();
                int Edad2=Per2.getEdad();
                
                char c1, c2;
                c1 = cade1.charAt(0);
                c2 = cade2.charAt(0);
                if (c1-c2==0) {
                    return Edad1-Edad2;
                }else{
// a-z
                return c1-c2;}
            }
          
        
        };
           System.out.println("Apellida-Edad");
        System.out.println("-------------------------------------------------");
        Collections.sort(llLista, ApeE);
        impL(llLista);
    }
    public static void impL(LinkedList<Persona> ls){
        for (Persona l : ls) {
            System.out.println("Nombre: "+l.getNom());
            System.out.println("Apellido: "+l.getApe());
            System.out.println("Edad: "+l.getEdad());
            System.out.println("---------------------------------------------");
        }
}
}

class Persona{
    private String Nom;
    private String Ape;
    private int Edad;

    public Persona() {
        this.Nom = "Diego";
        this.Ape = "Portillo";
        this.Edad = 20;
    }

    public Persona(String Nom, String Ape, int Edad) {
        this.Nom = Nom;
        this.Ape = Ape;
        this.Edad = Edad;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getApe() {
        return Ape;
    }

    public void setApe(String Ape) {
        this.Ape = Ape;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
}