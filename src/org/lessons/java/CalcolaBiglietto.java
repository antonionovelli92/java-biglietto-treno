package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Quanti km devi percorrere: ");
        int km = scanner.nextInt();

        
        System.out.print("Inidica la tua età: ");
        int eta = scanner.nextInt();

       
        double prezzo = km * 0.21;

        // 20% under 18
        
        if (eta < 18) {
        	prezzo = prezzo - (prezzo * 20 / 100);
        }

        // 40% over 65
        
        if (eta >= 65) {
        	prezzo = prezzo - (prezzo * 40 / 100);
        }

        //  Arrotorndo leggermente il prezzo
        
        String prezzoFormat = String.format("%.2f", prezzo);
       
        System.out.println("Il prezzo del biglietto è: " + prezzoFormat + " euro");

       
        scanner.close();
    }
}

