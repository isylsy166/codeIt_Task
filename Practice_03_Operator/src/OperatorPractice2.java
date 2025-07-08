import java.util.Scanner;

public class OperatorPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("양수다");
        }
        else if (number == 0) {
            System.out.println("양수가 아니다");
        }
        else{
            System.out.println("양수가 아니다");
        }
    }
}
