package org.lessons.java;

public class CibiPreferiti {
	  public static void main(String[] args) {
	        // list
	        String[] classificaCibi = {"Pizza", "Panino", "Sushi", "Carbonara", "Gelato", "Antonio", "Cavolfiore"};

	        // Class
	        System.out.println("La classifica è: " + classificaCibi.length);

	        // top
	        System.out.println("Il mio cibo top è: " + classificaCibi[0]);

	        // last
	        System.out.println("Il mio cibo preferito ma non troppo è: " + classificaCibi[classificaCibi.length - 1]);

	        // middle (check if 'odd') 
	        if (classificaCibi.length % 2 != 0) {
	            int middle = classificaCibi.length / 2;
	            System.out.println("Il cibo di mezza classifica è: " + classificaCibi[middle]);
	        }
	    }
}
