package non_input_apply_for2;

public class Main {

    static int[] makeArray() {
        int temp[] = new int[5];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = i * 100;
        }
        return temp;
    }

    public static void main(String[] args) {
        int intArray[] = makeArray();
        intArray[0] = 10000;
        for (int x : intArray) {
            System.out.println(x);
        }
        int intArray2[] = makeArray();
        intArray2[0] = 2000000;

        for (int x : intArray) {
            System.out.print(x + " ");
        }

        for (int x : intArray2) {
            System.out.println(x);
        }

        for (String s : args) {
            System.out.println(s);
        }

        double sum = 0;
        for (String s : args) {     // 명령행인자 전달을 통해 합산 가능
            try {
                sum += Double.parseDouble(s);   // 자료형 변환 String to Double
            } catch (NumberFormatException e) {    // 예외처리}
            }
        }
        System.out.println("총합: " + sum);
    }
}
