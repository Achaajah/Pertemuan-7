/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

import java.util.Scanner;

/**
 *
 * @author ANONYMOUS
 */
public class kota {
        public static void main(String[]args){
            String[]kota = new String[20];
            Scanner input = new Scanner(System.in);
            int i;
            
            System.out.println("Masukan Jumlah Data : ");
            int jml = input.nextInt();
            for(i=0;i<jml;i++){
                System.out.println("Data ke "+(i+1));
                System.out.println("Maasukan Nama Kota : ");
                kota[i]=input.next();
            }
            System.out.println("\nNama - nama kota");
            for(i=0;i<jml;i++){
                System.out.print(i+".");
                System.out.println("Nama Kota : "+kota[i]);
            }
        }
    }

