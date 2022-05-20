import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("마지막 날짜를 출력할 년도, 월을 입력하세요.");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day;

        switch (month) {
            case 2:
                day = year % 4 == 0 && year % 100 !=0 || year % 400 == 0 ? 29 : 28;
                break;
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;
            default:
                day = 0;
                break;
        }

        if (day == 0) {
            System.out.println(month + "월은 존재하지 않는 달입니다.");
        } else {
            System.out.println(year + "년 " +month+ "월의 마지막 날짜는" +day+ "일입니다.");
        }
    }
}
