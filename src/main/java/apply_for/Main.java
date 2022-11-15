package apply_for;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int intArray[];
        intArray = new int[5];

        for(int i=0; i<intArray.length; i++) {
            System.out.print(i + "번째 숫자를 입력하세요: ");
            intArray[i] = scanner.nextInt();
        }

        int max = intArray[0];
        for(int i=0; i<intArray.length; i++) {
            if(intArray[i]>max) {
                max = intArray[i];
            }
        }

        System.out.println("최댓값 :" + max);
    }
}