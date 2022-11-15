package string_typeArray_Enum;

public class Main {
    enum Week {월, 화, 수, 목, 금, 토, 일}

    public static void main(String[] args) {

        for(Week day : Week.values())
            System.out.print(day + "요일");
        System.out.println();

        String names[] = {"사과", "배", "바나나", "체리", "체리", "딸기", "포도"};
        // 스트링 배열 선언
        for(String s: names)
            System.out.print(s + " ");
        System.out.println();
    }
}