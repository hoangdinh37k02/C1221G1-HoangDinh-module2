package ss2_loop.exercise;

public class ShowPrime {
    public static void main(String[] args) {
        System.out.print("2  ");
        for (int i=3; i<=100; i++){
            boolean isPrime = true;
            for (int j=2; j<i; j++){
                if (i%j==0){
                    isPrime = false;
                }
            }
            if (isPrime){
                System.out.print(i + "  ");
            }
            isPrime = true;
        }
    }
}
