package non_input_aply_for;

public class Main {
    static int[] makeArray() {  // 정수형 배열을 리턴하는 메소드 선언
        int temp[] = new int[4];    // 4열짜리 배열 선언
        for (int i = 0; i < temp.length; i++) {  // 열의 크기만큼 반복
            temp[i] = i;   //각 원소를 0, 1, 2, 3으로 채움
        }
        return temp;    // temp[i] 배열을 리턴함
    }

    public static void main (String []args) {
        int intArray[];
        intArray = makeArray(); //makeArray() 메소드를 호출하여 intArray에 저장
        for(int i=0; i<intArray.length; i++) {  // intArray 배열의 길이 만큼 반복
            System.out.print(intArray[i] + " ");
        }
    }
}