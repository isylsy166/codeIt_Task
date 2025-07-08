import java.util.Scanner;

public class ControlLoop2 {
    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("1 이상의 숫자를 입력하세요 : ");
            int num = sc.nextInt();

            if(num < 1) System.out.println("1 이상의 숫자를 입력해주세요");

            for(int i = num; i >= 1; i--){
                System.out.printf("%d ", i);
            }
            System.out.println();
        }
    }
}
