import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Player{
    private String initNumber;
    private List<String> list = new LinkedList<>();
    private Boolean isEnd;

    public Player(String initNumber) {
        this.initNumber = initNumber;
        this.isEnd = false;
    }

    public Boolean getIsEnd() {
        return isEnd;
    }

    public void setIsEnd(Boolean isEnd) {
        this.isEnd = isEnd;
    }

    public String getInitNumber() {
        return initNumber;
    }

    public void play(String number) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < 3; i++) {
            if (number.charAt(i) == getInitNumber().charAt(i)) {
                strike += 1;
            } else {
                if (number.indexOf(getInitNumber().charAt(i)) != -1) {
                    ball += 1;
                } else {
                    strike = 0;
                    ball = 0;
                }
            }
        }

        if (strike == 3) {
            System.out.println("Congratulation!");
            setIsEnd(true);
        } else {
            System.out.println(number + " " + strike + " " + ball);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player player = new Player("489");

        while (true) {
            if (player.getIsEnd() == false) {
                String number = sc.nextLine();
                player.play(number);
            } else {
                break;
            }
        }
    }
}