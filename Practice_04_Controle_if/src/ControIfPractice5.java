import java.util.Scanner;

public class ControIfPractice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호를 입력하세요 : ");
        String num = sc.next();

        //주민번호 검증
        if(num.contains("-")){
            if(num.length() != 14) System.out.println("올바른 주민번호를 입력해주세요");
            String[] parts = num.split("-");
            String last = parts[1];

            String message = last.charAt(0) == '1' ? "남자" : "여자";
            System.out.println(message);

        }
        else{
            System.out.println("- 를 포함해서 입력해주세요");
        }


    }
}
