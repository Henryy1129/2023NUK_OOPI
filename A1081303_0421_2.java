// 6. 請撰寫一個程式，讓使用者可以 YYYY/MM/DD 或是 MM/DDNYNY 的格式輸人日期，並顯示使用者所輸入的年月日。

import java.util.Scanner;

public class A1081303_0421_2 {
    public static void main(String[] args) {
        Scanner SC =new Scanner(System.in);

        System.out.println("請輸入日期 (YYYY/MM/DD 或是 MM/DD/YYYY) : ");
        String date = SC.nextLine();
        String[] dateArray = date.split("/");

        if (date.matches("(^\\d{4})/\\d{1,2}/\\d{1,2}")) {      // YYYY/MM/DD
            System.out.println("日期格式輸入正確");
            System.out.println(dateArray[0] + "年 " + dateArray[1] + "月 " + dateArray[2] + "日 ");

        }else if(date.matches("(^\\d{1,2}/\\d{1,2}/\\d{4})")){      // MM/DD/YYYY
            System.out.println("日期格式輸入正確");
            System.out.println(dateArray[2] + "年 " + dateArray[0] + "月 " + dateArray[1] + "日 ");

        }else {
            System.out.println("格式輸入錯誤");
        }
        System.out.println("程式結束!");
    }
}
