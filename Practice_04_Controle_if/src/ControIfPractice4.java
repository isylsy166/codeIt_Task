import java.util.Scanner;

public class ControIfPractice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int number = sc.nextInt();

        if(number > 0 && number % 2 == 0){
            System.out.println("짝수다");
        }
        else if(number % 2 != 0){
            System.out.println("홀수다");
        }
        else if(number < 0){
            System.out.println("양수만 입력해주세요");
        }
    }
}
