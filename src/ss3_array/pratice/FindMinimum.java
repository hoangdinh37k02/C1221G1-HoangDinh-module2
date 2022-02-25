package ss3_array.pratice;

public class FindMinimum {
    public static void main(String[] args) {
        int[] array = {1,-3,4,2,3,12,3};
        int index = minValue(array);
        System.out.println("Minimum element of the array is: "+ array[index]);
    }

    public static int minValue(int[] array){
        int index = 0;
        for (int i=1; i<array.length; i++){
            if (array[i]<array[0]){
                index=i;
            }
        }
        return index;
    }
}
