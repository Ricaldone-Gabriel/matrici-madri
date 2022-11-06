/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progmatrici;

/**
 *
 * @author gigga
 */

/*Definisci una classe gestmatrici per l'elaborazione di matrici (rettangolari o quadrate)
di dimensione massima 10x10 composte da numeri interi. Tale classe deve includere almeno i seguenti metodi

lettura() Riceve una matrice di interi A e ene legge il contenuto da tastiera per righe, partendo dall'ultima
riga sino alla prima; il metodo restituisce la matrice letta;

scrittura() riceve una matrice di interi A e ne scrive il suo contenuto su output;

cePalindrome() riceva una matrice di interi A e ne restituisce true se il contenuto di A è palindrome, false altrimenti

prodottoScalare() riceva una matrice di interi A e due indici di rage r1 e r2 e calcolato e ritorna il prodotto scalare
tra la riga r1 e la riga r2.
*/
public class ProgMatrici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestMatrici matrice = new GestMatrici();
        
        matrice.lettura();
        matrice.scrittura();
    }
    
}
