package ss14_sort_algorithm.exercise;

import java.util.Arrays;

public class InsertSortDescription {
    static int[] list = {12,3,0,19,10,-4,7};

    public static void insertSort(int[] list){
        int pos, x;
        for (int i = 1; i<list.length; i++){
            x=list[i];
            pos=i;
            while (pos>0&&x<list[pos-1]){
                list[pos]=list[pos-1];
                pos--;
                System.out.println("Lần thứ "+i+ "- "+ pos+ " "+ Arrays.toString(list));
            }
            list[pos]=x;
            System.out.println("Sau lần thứ "+i+ ": "+Arrays.toString(list));
        }
    }

    public static void main(String[] args) {
        insertSort(list);
        for (int i=0; i<list.length; i++){
            System.out.print(list[i]+" ");
        }
    }
}
