package Game;

import java.util.Scanner;

public class PersonPerson {
    public int startGame(){
        String[] choice = {"剪刀", "石头", "布"};
        String[][] arr = {{"平", "赢", "输"}, {"输", "平", "赢"}, {"赢", "输", "平"}};
        System.out.println("请玩家A输入你的选择：0. 剪刀   1.石头   2.布 ");
        System.out.println("请玩家B输入你的选择：A. 剪刀   S.石头   D.布 ");
        Scanner scanner = new Scanner(System.in);

        int inputA = scanner.nextInt();

        String origin_inputB = scanner.next();
        int inputB = 0;
        switch (origin_inputB){
            case "a":
                inputB = 0;
                break;
            case "s":
                inputB = 1;
                break;
            case "d":
                inputB = 2;
                break;
            default:
                System.out.println("输入错误");
        }

        System.out.println("玩家A出的是：" + choice[inputA]);
        System.out.println("玩家B出的是：" + choice[inputB]);
        System.out.println("玩家A" + arr[inputB][inputA] + "了");

        int winner;  // A1， B2， 平0
        if(arr[inputB][inputA] == "赢"){
            winner = 1;
        }else if(arr[inputB][inputA] == "输"){
            winner = 2;
        }else{
            winner = 0;
        }
        return winner;
    }
}
