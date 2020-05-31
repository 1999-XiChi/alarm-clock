package Game;

import java.util.Scanner;

public class PersonMachine {

    public int startGame(){
        String[] choice = {"剪刀", "石头", "布"};
        String[][] arr = {{"平", "赢", "输"}, {"输", "平", "赢"}, {"赢", "输", "平"}};
        System.out.println("请输入你的选择：0. 剪刀   1.石头   2.布 ");
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        int ran = (int) (Math.random() * 10 % 3);
        System.out.println("你出的是：" + choice[input]);
        System.out.println("电脑出的是：" + choice[ran]);
        System.out.println("你" + arr[ran][input] + "了");

        int winner;  // 人1， 机2， 平0
        if(arr[ran][input] == "赢"){
            winner = 1;
        }else if(arr[ran][input] == "输"){
            winner = 2;
        }else{
            winner = 0;
        }
        return winner;
    }

}
