package apply_forEach;

import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        int intArray [] = new int[5];
        for(int x: intArray) {
            System.out.print(x);
        }

        int max = intArray[0];
        for(int x: intArray) {
            if(x>max) {
                max = x;
            }
        }
        System.out.println("최댓값 : " + max);
    }
}
