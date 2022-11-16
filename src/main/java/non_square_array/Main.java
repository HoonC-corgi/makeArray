package non_square_array;

public class Main {
    public static void main(String[] args) {
        int intArray[][] = new int[4][];    // 배열의 행만 지정하여 선언
        intArray[0] = new int[3];
        intArray[1] = new int[2];
        intArray[2] = new int[3];
        intArray[3] = new int[2];

        for(int i=0; i<intArray.length; i++) {   // 행의 수 만큼 반복
            for(int j=0; j<intArray[i].length; j++) {   // 설정된 각 열의 길이 만큼 반복
                intArray[i][j] = (i+1)*10+j;    // 행렬의 원소 서렂ㅇ
            }
        }

        for(int i=0; i<intArray.length; i++) {
            for(int j=0; j<intArray[i].length; j++) {
                System.out.print(intArray[i][j] + " ");     // 각 행렬 출력
            }
            System.out.println();
        }
    }
}
