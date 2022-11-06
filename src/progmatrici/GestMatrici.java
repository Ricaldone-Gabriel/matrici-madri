/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progmatrici;
import java.util.Scanner;
/*Definisci una classe gestmatrici per l'elaborazione di matrici (rettangolari o quadrate)
di dimensione massima 10x10 composte da numeri interi. Tale classe deve includere almeno i seguenti metodi

lettura() Riceve una matrice di interi A e ene legge il contenuto da tastiera per righe, partendo dall'ultima
riga sino alla prima; il metodo restituisce la matrice letta;

scrittura() riceve una matrice di interi A e ne scrive il suo contenuto su output;

cePalindrome() riceva una matrice di interi A e ne restituisce true se il contenuto di A è palindrome, false altrimenti

prodottoScalare() riceva una matrice di interi A e due indici di rage r1 e r2 e calcolato e ritorna il prodotto scalare
tra la riga r1 e la riga r2.
*/
/**
 *
 * @author gigga
 */
public class GestMatrici {
    private int[][] matrice = new int[10][10];
    private int grandezzaX,grandezzaY;
    private Scanner in = new Scanner(System.in);
    
    public void lettura() {
        /*lettura() Riceve una matrice di interi A e ene legge il contenuto da tastiera per righe, 
          partendo dall'ultima riga sino alla prima; il metodo restituisce la matrice letta;*/
        do {
        grandezzaX = in.nextInt();
        } while (grandezzaX < 0 || grandezzaX > 10); 
        do {
        grandezzaY = in.nextInt();
        } while (grandezzaY < 0 || grandezzaY > 10); 
        
        for (int i = grandezzaY; i > 0; i--) {
            for (int j = grandezzaX; j > 0; j--) {
                matrice[i-1][j-1] = in.nextInt();
            }
        }
        
    }
    
    public void scrittura() {
        for (int i = 0; i < grandezzaY; i++) {
            for (int j = 0; j < grandezzaX; j++) {
                System.out.print(matrice[i][j]);
            }
            System.out.println("");
        }
    }
}
