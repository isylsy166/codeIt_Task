import java.util.Scanner;

public class ControlLoop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("숫자 : ");
            int num = sc.nextInt();

            if(num < 1){
                System.out.println("1 이상의 숫자를 입력해주세요");
                continue;
            }

            for(int i = 1; i <= 9; i++){
                System.out.printf("%d * %d = %d \n", num, i, num *i);
            }
            System.out.println();
        }
    }
}
