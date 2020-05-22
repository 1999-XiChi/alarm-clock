package Game;

import java.util.Scanner;

public class FingerGame {

    public static void main(String[] args) {

        String[] choice = {"剪刀", "石头", "布"};
        String[][] arr = {{"平", "赢", "输"}, {"输", "平", "赢"}, {"赢", "输", "平"}};
        System.out.println("请输入你的选择：0. 剪刀   1.石头   2.布 ");
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        int ran = (int) (Math.random() * 10 % 3);
        System.out.println("你出的是：" + choice[input]);
        System.out.println("电脑出的是：" + choice[ran]);
        System.out.println("你" + arr[ran][input] + "了");


    }
}