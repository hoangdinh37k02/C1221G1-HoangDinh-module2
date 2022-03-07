package ss14_sort_algorithm.practice;

public class BubbleSort {
    static int[] list = {2,3,1,-14,-4,19,2,0,10};

    public static void bubbleSort(int[] list){
        boolean flag = true;

        for (int i=0; i<list.length-1&&flag; i++){
            flag=false;
            for (int j=list.length-1; j>i; j--){
                if (list[j]<list[j-1]){
                    int temp = list[j];
                    list[j]=list[j-1];
                    list[j-1]=temp;
                    flag=true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int e: list) {
            System.out.print(e + ", ");
        }
    }
}
