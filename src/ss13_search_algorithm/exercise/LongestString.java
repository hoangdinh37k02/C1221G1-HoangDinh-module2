package ss13_search_algorithm.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string by english that not same character:");
        String inputString = input.nextLine();
        String subString = null;
        List<String> arrayList = new ArrayList(10000);
        List<Integer> arrayLength = new ArrayList(10000);
        for (int j=0; j<inputString.length()-1; j++){
            subString ="" + inputString.charAt(j);
            for (int i=j; i<inputString.length()-1; i++) {
                if ((int) inputString.charAt(i) < (int) inputString.charAt(i + 1)) {
                    subString +=inputString.charAt(i + 1);
                } else {
                    break;
                }
            }
            arrayList.add(subString);
            arrayLength.add(subString.length());
        }
        for (String st: arrayList) {
            System.out.print(st+ " ");
        }
        for (int st: arrayLength) {
            System.out.print(st+ " ");
        }

//            System.out.println((int) inputString.charAt(i));
        int index = 0;
        int max = arrayLength.get(0);
        for (int i=1; i<arrayLength.size(); i++){
            if (arrayLength.get(i)>max){
                max = arrayLength.get(i);
                index=i;
            }
        }
        System.out.println("Chuỗi dài nhất: "+ arrayList.get(index));
    }
}
