package AddAvrCalc.average;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 개의 정수를 입력하시겠습니까?");
        int n = scanner.nextInt();
        int intArray[] = new int[n];
        int sum = 0;

        System.out.print(intArray.length + "개의 정수를 입력하세요 : ");
        for(int i=0; i<intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }
        //  intArray의 크기만큼 수를 입력 받아 배열에 채움
        for(int i=0; i<intArray.length; i++) {
            sum += intArray[i];
            // 배열의 각 값을 Sum 변수에 반복 저장하여 합을 구함
        }

        System.out.println("평균은 " + (double)sum/intArray.length);   // 평균
        scanner.close();
    }
}
