import java.util.Scanner;

public class OperatorPractice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int number = sc.nextInt();

        String message = number % 2 == 0 ? "짝수다" : "홀수다";
        System.out.println(message);
    }
}
