import java.util.Scanner;
public class OperatorAritmatika{
    public static void main(String[]args){
        int angka1;
        int angka2;
        int hasil = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("input angka-1:");
        angka1 = keyboard.nextInt();
        System.out.print("input angka-2:");
        angka2 = keyboard.nextInt();
        //penjumlahan hasil = angka1 + angka2;
        System.out.println("Hasil ="+ hasil);
    }
}