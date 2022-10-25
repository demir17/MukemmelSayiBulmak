import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , temp= 0;

        System.out.println("Bir sayı giriniz.");
        n = sc.nextInt();



            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    temp = temp + i;
                }


            }
            if(temp == (n * 2)){
                System.out.println( n + " Bir mükemmel sayıdır.");
            }
            else {
                System.out.println(n + " Bir mükemmel sayı değildir.");
            }





    }
}
