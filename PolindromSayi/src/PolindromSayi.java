import java.util.Scanner;

public class PolindromSayi {
    static boolean palindrom(int num){
        int temp=num,lastNum=0,reverseNum = 0;
        
        while (temp!=0){
            lastNum =(lastNum*10) +temp%10;
            reverseNum=lastNum;
            temp /= 10;        
        }
        if(reverseNum == num){
            return true;
        }
        else 
        return false;
    }
    public static void main(String[] args) {
        System.out.println(palindrom(272));
        
    }

}
