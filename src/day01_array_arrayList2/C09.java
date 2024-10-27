package day01_array_arrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09 {
    public static void main(String[] args) {
      /*
        Verilen bir array’de tekrar eden elementler icin,
         mukerrer olanlari silip, tum elemanlardan
         sadece 1 tane yapip bize dondurecek
         bir method olusturun.
       */

        int[] arr={2,3,3,6,5,23,1,4,2,3,5,82,2,2,2,232,3};
        System.out.println(Arrays.toString(arr));
        int[] uniqueArr= tekrarsizArray(arr);
        System.out.println(Arrays.toString(uniqueArr));


    }
    public static int[] tekrarsizArray (int[] arr){
        List<Integer> tekrarsizList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!tekrarsizList.contains(arr[i])){
                tekrarsizList.add(arr[i]);
            }
        }
        arr = new int[tekrarsizList.size()];

        for (int i = 0; i < tekrarsizList.size(); i++) {
            arr[i] = tekrarsizList.get(i);
        }
        return arr;




    }



}
