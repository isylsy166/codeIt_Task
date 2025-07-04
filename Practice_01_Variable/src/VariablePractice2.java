import java.util.Scanner;

public class VariablePractice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수 : ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수 : ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;


        System.out.println("더하기 결과 : " + sum);
        System.out.println("빼기 결과 : " + diff);
        System.out.println("곱하기 결과 : " + product);
        System.out.println("나누기 몫 결과 : " + quotient);

        scanner.close();
    }
}
