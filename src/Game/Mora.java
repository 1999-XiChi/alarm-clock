package Game;
import java.util.Scanner;
public class Mora {
    public String playerName;     // 玩家姓名
    int playerScore;              // 玩家分数
    int computerScore;            // 电脑分数
    int playerWinNum = 0;
    int comWinNum = 0;

    public void startplay() {

        System.out.print("请出拳：1.剪刀   2.石头   3.布（输入相应数字）：");
        Scanner scanner = new Scanner(System.in);
        int playernumber = scanner.nextInt();

        while(playernumber !=1 && playernumber !=2 && playernumber !=3 && playernumber !=0) {
            System.out.println("您的输入有误,重新输入：（1.剪刀   2.石头   3.布    0.退出游戏）");
            playernumber = scanner.nextInt();
        }
        switch (playernumber){
            case 1:
                System.out.println("你出拳：剪刀");
                break;
            case 2:
                System.out.println("你出拳：石头");
                break;
            case 3:
                System.out.println("你出拳：布");
                break;
            case 0:
                System.out.println("游戏已结束，记得回来哦");
                System.exit(0);
        }

        int computernumber = (int)( (Math.random()*10)%3+1);
        switch (computernumber){
            case 1:
                System.out.println("电脑出拳：剪刀");
                break;
            case 2:
                System.out.println("电脑出拳：石头");
                break;
            case 3:
                System.out.println("电脑出拳：布");
                break;
        }


        if ( playernumber == computernumber) {

            System.out.println("啊，平局！");

        } else if ((playernumber == 1 && computernumber != 2) || (playernumber == 2 &&  computernumber != 3)
                || (playernumber == 3 && computernumber != 1)) {
            playerWinNum ++;
            System.out.println("哇，你赢了，好厉害！");

        } else {
            comWinNum++;
            System.out.println("^_^!!!你输了，真笨！");

        }

        System.out.println("当前比分：\t用户：电脑 = "+playerWinNum + "："+comWinNum);
        //scanner.close();

    }

    public static void main(String[] args) {


        Mora mora = new Mora();
        Scanner aaa = new Scanner( System.in);
        boolean  flag =true;
        int i;

        while(flag) {
            mora.startplay();

            System.out.println("1. 继续游戏      0. 退出游戏");


            // System.out.println(input);
            i = aaa.nextInt();

            while( i!=1  && i!=0) {
                System.out.println("输入有误，请重新输入：");
                i = aaa.nextInt();
            }
            if(i == 0) {
                System.exit(0);
            }
        }

        aaa.close();
    }

}
