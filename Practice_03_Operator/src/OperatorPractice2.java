import java.util.Scanner;

public class OperatorPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int number = sc.nextInt();

        String message = number > 0 ? "양수다" : "양수가 아니다";
        System.out.println(message);
    }
}
