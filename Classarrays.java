package classarrays;	
import java.util.Arrays; 
public class Classarrays { 
    public static void main (String args []){ 
        int [] angka1 = {2, 1, 9, 5, 6, 12};
        int [] angka2 = {3, 2, 5, 8, 6, 9};
        Arrays.sort(angka1);
        Arrays.sort(angka2);
        for (int i = 0; i < angka1.length; i++){ 
        System.out.print(angka1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < angka2.length; i++){ 
        System.out.print(angka2[i] + " ");
        } 
        System.out.println();
         if(Arrays.equals(angka1,angka2))
             System.out.print("angka sama");
        else
             System.out.print("angka tidak sama");
    } 
}