package penjumlahanarray;
import java.util.Scanner;
public class Penjumlahanarray {
    private static Scanner input;
    public static void main(String[] args) {
        int i,n,sum=0;
        int[]nilai;
        nilai=new int[10];
 
        input=new Scanner(System.in);
           System.out.print("Masukkan banyak data =  ");
           n=input.nextInt();
           System.out.println(" ");
        for(i=0;i<n;i++){
            System.out.print("Masukkan array ke"+i+" = ");
            nilai[i]=input.nextInt();}
 
        System.out.println("\nData yang diinputkan ke elemen array");
        for(i=0;i<n;i++){
            System.out.print("\nNilai ke - "+i);
            System.out.print(" = "+nilai[i]);
            sum=sum+nilai[i];
            }
        System.out.println();
        System.out.println("Jumlah array nilai "+sum);
    }
}