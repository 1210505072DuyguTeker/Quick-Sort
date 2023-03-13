
import java.util.Random;


public class QuickSort {
   
    public static void main(String[] args) {
        int[] dizi= new int[1000]; 
        Random r =new Random();
        
        
        for(int i=0;i<1000;i++){
            dizi[i]=r.nextInt(1000);
        }
        
        System.out.println("Sirali olmayan dizi: ");
        
        for(int i : dizi){
            System.out.println(i+ " ");
        }
        System.out.println("\n");
        
        quickSort(dizi,0,dizi.length-1);
        
        System.out.print("Sirali dizi: ");
        
        for(int i : dizi){
            System.out.println(i+" ");
        }
        System.out.println("\n");
        
        System.out.println("En buyuk sayi: " + dizi[dizi.length-1]);
    }
    
    public static void quickSort(int[] dizi,int baş,int son){
        if(baş<son){
            int pivot=sınıflama(dizi,baş,son);
            quickSort(dizi,baş,pivot-1);
            quickSort(dizi,pivot+1,son);
        }
    }
    public static int sınıflama(int[] dizi,int baş,int son){
        int Pivot=dizi[son];
        int i=baş-1;
        for(int j=baş;j<son;j++){
            if(dizi[j]<Pivot){
                i++;
                int temp=dizi[i];
                dizi[i]=dizi[j];
                dizi[j]=temp;
            }
        }
        int temp=dizi[i+1];
        dizi[i+1] = dizi[son];
        dizi[son]=temp;
        return i+1;
    }

   
    
}
