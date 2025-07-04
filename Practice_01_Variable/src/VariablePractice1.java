import java.util.Scanner;

public class VariablePractice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        System.out.print("이름을 입력하세요 : ");
        String name = scanner.nextLine();

        System.out.print("성별을 입력하세요(남/여) : ");
        String gender = scanner.nextLine();

        System.out.print("나이를 입력하세요 : ");
        int age = scanner.nextInt();

        System.out.print("키를 입력하세요(cm) : ");
        double height = scanner.nextDouble();

        // 출력
        System.out.printf("키 %.2fcm인 %d살 %s자 %s님 반갑습니다!\n", height, age, gender, name);

        scanner.close();
    }
}
