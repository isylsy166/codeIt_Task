import java.util.Scanner;

public class VariablePractice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 실수 입력 받기
        System.out.print("가로 : ");
        double width = scanner.nextDouble();

        System.out.print("세로 : ");
        double height = scanner.nextDouble();

        // 계산
        double area = width * height;
        double perimeter = (width + height) * 2;

        // 출력
        System.out.printf("면적 : %.2f\n", area);
        System.out.printf("둘레 : %.1f\n", perimeter);

        scanner.close();
    }
}
