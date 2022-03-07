package ss14_sort_algorithm.exercise;

public class InsertSort {
    static int[] list1 = {3,0,19,-4,2,21,15,12};

    public static void insertSort1(int[] list){
        int pos,x;
        for (int i=1; i<list.length; i++){
            x=list[i];
            pos = i;
            while (pos>0&&x<list[pos-1]){
                list[pos]=list[pos-1];
                pos--;
            }
            list[pos]=x;
        }
    }

    public static void main(String[] args) {
        insertSort1(list1);
        for (int i=0; i<list1.length; i++){
            System.out.print(list1[i]+" ");
        }
    }
}
