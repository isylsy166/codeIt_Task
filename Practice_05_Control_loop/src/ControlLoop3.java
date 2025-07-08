import java.util.Scanner;

public class ControlLoop3 {
    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("1 이상의 숫자를 입력하세요 : ");
            int num = sc.nextInt();
            int sum = 0;

            if(num < 1) System.out.println("1 이상의 숫자를 입력해주세요");

            for(int i = 1; i <= num; i++){
                sum += i;
                if(num == i){
                    System.out.printf("%d = %d \n", i, sum);
                    break;
                }
                System.out.printf("%d + ", i);
            }
            System.out.println();
        }
    }
}
