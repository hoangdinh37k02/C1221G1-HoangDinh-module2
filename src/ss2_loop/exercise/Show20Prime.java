package ss2_loop.exercise;

public class Show20Prime {
    public static void main(String[] args) {
        int count=1,n=2;
        System.out.print("2  ");
        while (count <20) {
            n++;
            boolean isPrime = true;
            for (int i=2; i<n; i++){
                if (n%i==0){
                    isPrime=false;
                }
            }
            if (isPrime){
                System.out.print(n+"  ");
                count++;
            }
        }
    }
}
