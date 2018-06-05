/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] Arreglo = new int[10];
        int[] Arreglo2 = new int[10];
        for (int i = 0; i < Arreglo.length; i++) {
            Arreglo[i] = (int) (Math.random() * 100) + 1;
            Arreglo2[i]=Arreglo[i];
        }
        System.out.println("Original");
       
        ImpArr(Arreglo);
       

        //selection sort
        System.out.println("Selection Sort");
         //long ini = System.nanoTime();
        //selectionSort(Arreglo);
         //long fin = System.nanoTime();
         //System.out.println("Tardo "+(fin-ini)/100000+" milisegundos");
        //ImpArr(Arreglo);

        //insertion sort
        System.out.println("Insertion Sort");
         //ini = System.nanoTime();
        //insertionSort(Arreglo);
         //fin = System.nanoTime();
         //System.out.println("Tardo "+(fin-ini)/100000+" milisegundos");
        //ImpArr(Arreglo);
        
        System.out.println("Bubble Sort");
        //bubbleSort(Arreglo);
        //ImpArr(Arreglo);
        
        System.out.println("Quick Sort");
        quickSort(Arreglo, Arreglo.length -1, 0);
        ImpArr(Arreglo);
        
        int pos = LineS(Arreglo, 55);
        System.out.println("El numero: "+55);
        if (pos==-1) {
            System.out.println("No existe");
        }else{
            System.out.println("Si existes en la posicion "+ pos);
        }
        
        
        

    }

    public static void ImpArr(int[] Arre) {
        for (int i : Arre) {
            System.out.print("[" + i + "]");
        }
        System.out.println("\n---------------------------------");
    }

    public static void selectionSort(int[] Arre) {
        for (int i = 0; i < Arre.length - 1; i++) {//lista en desorden 
            int min = i;
            //marcar la posicion del minimo 
            for (int j = i + 1; j < Arre.length; j++) {
                if (Arre[j] < Arre[min]) {
                    min = j;
                }
            }
            //intercambiar con la primer posicion de la lista en desorden 
            int t = Arre[min];
            Arre[min] = Arre[i];
            Arre[i] = t;
        }
    }

    public static void insertionSort(int[] Arre) {
        int n = Arre.length;//Se declara una variable que lea todo el arreglo
        for (int i = 1; i < n; ++i) {//el for que recorre el arreglo
            int temp = Arre[i];//una variable temp con el valor en i
            int j = i - 1;//variable para la insersion
            while (j >= 0 && Arre[j] > temp) {
                Arre[j + 1] = Arre[j];
                j = j - 1;
            }
            Arre[j + 1] = temp;
        }
    }
    public static void bubbleSort(int[] Arre){
        for (int i = 0; i < Arre.length - 1; i++) {
            for (int j = 0; j < Arre.length - 1 ; j++) {
                int k = j+1;
                if (Arre[j] > Arre[k]) {
                    int tmp = Arre[k];
                    Arre[k] = Arre[j];
                    Arre[j] = tmp;

                }

            }

        }
        
    }
    public static void quickSort(int[] Arre, int D, int I){
        int P = Arre[I];
        int i = I;
        int j = D;
        int aux;
        while(i<j){
            while(Arre[i]<=P&&i<j){
                i++;
            }
            while(Arre[j]>P){
                j--;
            }
            if(i<j){
                aux = Arre[i];                 
                Arre[i] = Arre[j];
                Arre[j] = aux;
            }
        }
        Arre[I]=Arre[j];
        Arre[j]=P;
        if (I < j-1) {
            quickSort(Arre, j-1, I);
            
        }
        if (j+1<D) {
            quickSort(Arre, D ,j+1);
        }
        
    }
    public static int LineS(int[] Arre,int ValB){
        int R = -1;
        for (int i = 0; i < Arre.length; i++) {
            if (ValB == Arre[i]) {
                R = i;
                break;
            }
        }
        return R;
    }
    public static int binaS(int Arre[], int vS) {
        return binS(Arre, vS, 0, Arre.length - 1);
    }

    private static int binS(int Arre[], int vS, int vL, int vH) {
        //count++;
        int pos = -1;
        int mid = vL + ((vH - vL) / 2);//Calcula la mitad del arreglo
        if (vL <= vH) {
            if (vS == Arre[mid]) {
                pos = mid;
            } else if (vS > Arre[mid]) {
                pos = binS(Arre, vS, mid + 1, vH);
            } else if (vS < Arre[mid]) {
                pos = binS(Arre, vS, vL, mid - 1);
            }
        }
        return pos;
    }

   
    
}
