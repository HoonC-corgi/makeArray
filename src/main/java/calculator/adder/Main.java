package calculator.adder;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 개의 정수를 입력하시겠습니까?");
        int n = scanner.nextInt();
        int array[] = new int[n];

        for(int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;  // n 배열의 합을 구할 변수 선언
        for (int k : array) {   // 배열 array의 값들을 k에 각각 담음
            System.out.print(k + "");  // k를 각각 프린트함
            sum += k;  // sum에 k를 반복으로 쌓아 합을 구함
        }
        System.out.println("합은" + sum);  // 합 출력
    }
}
