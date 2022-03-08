package ss15_exception.practice;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfException {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfException arrayExample = new ArrayIndexOutOfException();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập chỉ số bất kì: ");
        int x = Integer.parseInt(scanner.nextLine());
        try {
            System.out.println("Giá trị của phần tử có chỉ số" + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
