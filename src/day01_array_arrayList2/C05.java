package day01_array_arrayList2;

import java.util.Arrays;
import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
        /*
        Kullanicidan array’in boyutunu ve elementlerini
         alip array’i olusturan ve bize donduren bir
         method olusturun.
         */
        System.out.println("Isimler = " + Arrays.toString(arrayYap()));
    }
    public static String[] arrayYap (){
        Scanner scanner = new Scanner(System.in);
        String girilenIsim = "";
        System.out.println("oluşturmak istediğiniz Arrayin boyutunu giriniz");
        int boyut = scanner.nextInt();
        scanner.nextLine();
        String[] isimler = new String[boyut];
        for (int i = 0; i < boyut; i++) {
            System.out.println("lütfen "+ i +". indexdeki elemanı giriniz");
            girilenIsim = scanner.nextLine();
            isimler[i] = girilenIsim;
        }
        return isimler;
    }
}
