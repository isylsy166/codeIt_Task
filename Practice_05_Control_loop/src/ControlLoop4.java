import java.util.Scanner;

public class ControlLoop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("첫 번째 숫자 : ");
            int first = sc.nextInt();

            if(first < 1){
                System.out.println("1 이상의 숫자를 입력해주세요");
                continue;
            }

            System.out.print("두 번째 숫자 : ");
            int last = sc.nextInt();

            if(last < 1){
                System.out.println("1 이상의 숫자를 입력해주세요");
                continue;
            }


            for(int i = first; i <= last; i++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
