import java.util.Scanner;

public class OperatorPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원 수 : ");

        int pNum = sc.nextInt();

        System.out.print("사탕 개수 : ");
        int candyNum = sc.nextInt();



        System.out.printf("1인 당 사탕 개수: %d \n", candyNum / pNum );
        System.out.printf("남은 사탕 개수: %d \n", candyNum % pNum );
    }
}
