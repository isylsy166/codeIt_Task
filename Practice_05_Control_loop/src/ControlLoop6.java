import java.util.Scanner;

public class ControlLoop6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("숫자 : ");
            int num = sc.nextInt();

            if(num < 1){
                System.out.println("1 이상의 숫자를 입력해주세요");
                continue;
            }
            else if(num > 9){
                System.out.println("9 이하의 숫자를 입력해주세요");
                continue;
            }

            for(int i = num; i <= 9; i++){
                System.out.printf("===== %d단 =====\n", i);
                for(int j = 1; j <= 9; j++){
                    System.out.printf("%d * %d = %d \n", i, j, i * j);
                }
                System.out.println();
            }

        }
    }
}
