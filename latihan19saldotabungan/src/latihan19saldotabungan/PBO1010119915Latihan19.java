/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan19saldotabungan;
import java.util.Scanner;

/**
 *
 *  * @author M Hongki Alfikram
 * Kelas : IF10-K
 * NIM :10119915
 */
public class PBO1010119915Latihan19 {
static int saldoAkhir;
 static void hitung(int a, int b){
  saldoAkhir = (a + (a*b/100));
 }

 public static void main(String[] args) {
   
  int saldo_awal;
  int bunga;
  int lama_menabung;
  int banyak_bulan;
  
  
  Scanner in = new Scanner(System.in);
  
  System.out.print("Saldo awal: ");
  saldo_awal = in.nextInt();
  System.out.print("Bunga/Bulan(%): ");
  bunga = in.nextInt();
  System.out.print("Lama Bulan: ");
  banyak_bulan = in.nextInt();
  System.out.println("");
  System.out.println("------------------------------------------------------------------------");

  
  
  for (lama_menabung=1; lama_menabung<=banyak_bulan; lama_menabung++) {
   hitung(saldo_awal,bunga);
   
     
   System.out.println("Bulan ke-"+lama_menabung+ " Rp. "+saldoAkhir);

   saldo_awal = saldoAkhir;
  }
  
  
   
 }
    
}