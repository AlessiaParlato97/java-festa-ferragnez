/*creare e inizializzare l’array contenente i nomi degli invitati
chiedere all’utente come si chiama
verificare che il nome sia presente nella lista lasciarlo entrare
o rispedirlo cortesemente da dove è venuto


Bonus
se avete usato il ciclo for per cercare il nome nella lista nella consegna base, implementare lo stesso programma usando il ciclo while, e viceversa.


ARRAY: Lista invitati: Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, Ilary Blasi, Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, Rachel Zeilic
*/

package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
	
	public static void main(String[] args) {
		
		// Creare l'array contenente i nomi degli invitati
		String[] guestList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		// Chiedere all'utente il suo nome
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi il tuo nome.");
        String userName = scanner.nextLine();
        
        // Variabile per tenere traccia se l'utente è nella lista
        boolean isInvited = false;
        
        // Verifica con ciclo for se l'userName è tra gli invitati
        for (int i = 0; i < guestList.length; i++) {
            if (guestList[i].equalsIgnoreCase(userName)) {
                isInvited = true;
                break;
            }
            scan.close();

        }
             // Verifica con ciclo while (bonus)
               /* int i = 0;
                while (i < guestList.length) {
                    if (guestList[i].equalsIgnoreCase(userName)) {
                       isInvited = true;
                break;
                }
                 i++;
                } */
                
         // Risultato: verificare se l'utente può entrare o meno
            if (isInvited) {
               System.out.println("Benvenuto/a alla festa, " + userName + "!");
               } else {
               System.out.println("Spiacente " + userName + ", non sei nella lista degli invitati.");
               }
             }
           }

