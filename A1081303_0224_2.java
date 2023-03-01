package 物件導向程式設計.HW;
//10. 請撰寫程式,讓使用者輸入代表攝氏溫度的值,用程式換算成華氏溫度並顯示結果（提示：攝氏溫度等於華氏溫度減32度再乘上5/9）
import java.util.Scanner;

public class A1081303_0224_2 {
    public static void main(String[] args) {
        float degree_c, degree_f;
        System.out.print("請輸入攝氏溫度");
        Scanner SC =new Scanner(System.in);
        degree_c = SC.nextInt();
        degree_f = degree_c*9/5+32;

        System.out.println("攝氏溫度=" +degree_c);
        System.out.println("華氏溫度=" +degree_f);
        SC.close();
    }
}
