package ss13_search_algorithm.practice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {1,3,4,10,19,23,34,51,55,70,77,92,100};
        System.out.println(binarySearch(list, 1));
    }

    static int binarySearch(int[] list, int value){
        int indexLeft = 0;
        int indexRight = list.length-1;
        while (indexLeft<=indexRight){
            int indexMid = (indexLeft+indexRight)/2;
            if (value==list[indexMid]){
                return indexMid;
            } else if (value>list[indexMid]){
                indexLeft=indexMid+1;
            } else {
                indexRight=indexMid-1;
            }
        }
        return -1;
    }
}
