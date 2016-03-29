/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;

/**
 *
 * @author Praktikum
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0, b=1, hasil =0, c, jumlah;
        Scanner input = new Scanner(System.in);
         System.out.print("input : ");
         c = input.nextInt();
         for(int i = 1; i <= c; i++){
             a = b;
             b = hasil;
             System.out.print(hasil + " ");
             hasil = a+b;
         }
         jumlah = +hasil;
         System.out.println("jumlah : "+hasil);
    }
    
}
