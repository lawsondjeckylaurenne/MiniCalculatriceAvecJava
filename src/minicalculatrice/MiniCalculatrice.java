/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minicalculatrice;

import java.util.Scanner;

/**
 *
 * @author laure
 */
public class MiniCalculatrice {

    public static void main(String[] args) {
         Scanner scanner;
        scanner = new Scanner(System.in);
        

        // Entrée du premier nombre
        System.out.print("Entrez le premier nombre : ");
        double num1 = scanner.nextDouble();

        // Entrée de l'opérateur
        System.out.print("Entrez l'opérateur (+, -, *, /) : ");
        char operateur = scanner.next().charAt(0);

        // Entrée du second nombre
        System.out.print("Entrez le second nombre : ");
        double num2 = scanner.nextDouble();

        double resultat = 0;

        // Calcul selon l'opérateur
        switch (operateur) {
            case '+':
                resultat = num1 + num2;
                break;
            case '-':
                resultat = num1 - num2;
                break;
            case '*':
                resultat = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultat = num1 / num2;
                } else {
                    System.out.println("Erreur : Division par zéro");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Opérateur invalide.");
                scanner.close();
                return;
        }

        // Affichage du résultat
        System.out.println("Le résultat est : " + resultat);

        scanner.close();
    }
    
}
