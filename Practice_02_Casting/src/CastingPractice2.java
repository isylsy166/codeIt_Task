import java.util.Scanner;

public class CastingPractice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 점수 입력 (실수형)
        System.out.print("국어 : ");
        double korean = scanner.nextDouble();

        System.out.print("영어 : ");
        double english = scanner.nextDouble();

        System.out.print("수학 : ");
        double math = scanner.nextDouble();

        // 총점과 평균 (정수형으로 변환)
        int total = (int)(korean + english + math);
        int average = total / 3;

        // 결과 출력
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + average);

        scanner.close();
    }
}
