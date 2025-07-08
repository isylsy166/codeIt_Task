import java.util.Arrays;

public class Array10 {
    public static void main(String[] args) {

        int[] arr = new int[10];


        int i = 0;

        while(i < 10){
            int num =  (int)(Math.random() * 100 + 1);
            boolean dupl = false;

            for(int j = 0; j < i; j++){
                if(arr[j] == num){
                    dupl = true;
                    break;
                }
            }

            if(dupl) continue;
            arr[i] = num; // 첫번 째 숫자는 무조건 값 넣기
            i++;

        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


}

