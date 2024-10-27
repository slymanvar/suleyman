package day01_array_arrayList2;

public class C06 {
    public static void main(String[] args) {
       /*
        Verilen String bir array’deki en uzun ve en kisa
         kelimeleri yazdiran bir method olusturun
        */
        String[] isimler = {"Ali","Veli","Osman","Süleyman","Cem","Rıdvan","Furkan","Su"};

        enUzunVeEnKisaIsim(isimler);

    }
    public static void enUzunVeEnKisaIsim(String[] arr){

        String enUzunIsim=arr[0];
        String enKisaIsim=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()>enUzunIsim.length()){
                enUzunIsim=arr[i];
            }
            if (arr[i].length()<enKisaIsim.length()){
                enKisaIsim=arr[i];
            }
        }
        System.out.println("Arraydeki en uzun Isim: "+enUzunIsim);
        System.out.println("Arraydeki en kisa Isim: "+enKisaIsim);



    }
}
