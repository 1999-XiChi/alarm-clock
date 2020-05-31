package Game;

import java.util.Scanner;

public class main {
    public static void countDown(){
        System.out.println("游戏即将开始");
        int time = 3;
        while (time > 0) {
            try {
                Thread.sleep(1000);
                System.out.println(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            time--;
        }
    }
    public static void games(int total_counts, int gameChoice){
        countDown();
        int AWinCounts = 0;
        int BWinCounts = 0;
        int i = 0;
        int win_counts = (total_counts + 1) / 2 ;
        while (true){
            System.out.println("第" + (i + 1) + "轮：");
            int winner = 0;
            switch (gameChoice){
                case 1:
                    PersonPerson game_one = new PersonPerson();
                    winner = game_one.startGame();
                    break;
                case 2:
                    PersonMachine game_two = new PersonMachine();
                    winner = game_two.startGame();
                    break;
                default:
                    System.out.println("请输入正确的游戏类型。");
            }
            if(winner == 1){
                AWinCounts++;
            }else if(winner == 2){
                BWinCounts++;
            }
            // 判断是否有人取得胜利
            if (AWinCounts == win_counts || BWinCounts == win_counts) {
                break;
            }
            i++;
        }
        if (AWinCounts > BWinCounts) {
            System.out.println("最终胜利者：" + (gameChoice == 2? "你":"A"));
        } else {
            System.out.println("最终胜利者：" + (gameChoice == 2? "电脑":"B"));
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入游戏模式：1. 人人对战  2. 人机对战");
        Scanner scanner = new Scanner(System.in);
        int gameChoice = scanner.nextInt();
        System.out.println("请输入回合类型：1. 一局定胜负  2. 三局两胜  3. 五局三胜");
        int origin_gameTimes = scanner.nextInt();
        int gameTimes = 1;
        switch (origin_gameTimes){
            case 1:
                gameTimes = 1;
                break;
            case 2:
                gameTimes = 3;
                break;
            case 3:
                gameTimes = 5;
                break;
            default:
                System.out.println("请输入正确的回合类型。");
        }
        games(gameTimes,gameChoice);
    }
}
