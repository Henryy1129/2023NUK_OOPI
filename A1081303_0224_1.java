package 物件導向程式設計.HW;
//9. 請撰寫程式,讓使用者輸入任意整數,程式則檢查其為奇數或偶數,並顯示判斷結果
import java.util.Scanner;

public class A1081303_0224_1 {
    public static void main(String[] args) {
        int num, i=2;
        System.out.print("請輸入任意整數");
        Scanner SC =new Scanner(System.in);
        num = SC.nextInt();
        i = num % 2;

        System.out.println("num/2的餘數=" +i);
        System.out.println(num+ "是奇數" +(i!=0));
        System.out.println(num+ "是偶數" +(i==0));
        SC.close();
    }
}
