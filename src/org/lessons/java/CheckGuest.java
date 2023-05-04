package org.lessons.java;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        String[] invitati = {
        		"Dua Lipa", 
        		"Paris Hilton", 
        		"Manuel Agnelli", 
        		"J-Ax", 
        		"Francesco Totti",
                "Ilary Blasi", 
                "Bebe Vio", 
                "Luis", 
                "Pardis Zarei", 
                "Martina Maccherone", 
                "Rachel Zeilic",
                "Antonio Novelli"
                };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

//        Non so ancora se l'utente è invitato alla festa
        boolean presente = false;
//        faccio partire il tutto da 0 (perchè è un arrey di nomi)
        int i = 0;
//        Verifico se il nome è presente, (controllato su intenet il metodo, in modo da converire automaticamente la stringa)
        while (!presente && i < invitati.length) {
            if (invitati[i].equalsIgnoreCase(nome)) {
                presente = true;
            }
            i++;
        }

        if (presente) {
            System.out.println("Benvenuto al Party!");
        } else {
            System.out.println("Mi dispiace! Vattene.");
        }
        scanner.close();
    }
}
