
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter current time:");
        int currentHour = scan.nextInt();
        System.out.println("Enter current minute");
        int currentMinute = scan.nextInt();
        System.out.println("Enter current second");
        int currentSecond = scan.nextInt();

        System.out.println("Enter hour to move forward:");
        int forwardHour = scan.nextInt();
        System.out.println("Enter minute to move forward");
        int forwardMinute = scan.nextInt();
        System.out.println("Enter secound to move forward");
        int forwardSecond = scan.nextInt();

        boolean isNextDay = false;
        int answerHour =0, answerMinute=0, answerSecond=0;
        int carryMinute =0, carrySecond =0;

        answerSecond = currentSecond + forwardSecond;
        if(answerSecond >= 60){
            answerSecond -= 60;
            carrySecond = 1;
        }

        answerMinute = currentMinute + forwardMinute + carrySecond;
        if(answerMinute >= 0){
            answerMinute  -= 60;
            carryMinute =1;
        }

        answerHour = currentHour + forwardHour + carryMinute;
        if(answerHour >= 24){
            answerHour -= 24;
            isNextDay = true;
        }

        if(isNextDay){
            System.out.println("The answer is "+ answerHour+ ":"+
                    answerMinute +":" + answerSecond+ " on the next day");
        }
        else {
            System.out.println("The answer is "+ answerHour+ ":"+
                    answerMinute +":" + answerSecond);
        }

        scan.close();
    }
}