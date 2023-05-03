// 5. 更改上一題的程式，改成使用規則表示法來檢查，要求使用者輪人正確格式的電子郵件信箱(假設使用者名稱及網域中都只有小寫英文字母)。

import java.util.Scanner;

public class A1081303_0421_1 {

    public static void main(String[] args){
        Scanner SC =new Scanner(System.in);

        System.out.println("請輸入電子郵件信箱(名稱及網域中都只有小寫英文字母) : ");
        String email = SC.nextLine();

        int i=0;
        while (i == 0){
            if (!email.matches("^[a-zA-Z_.-]+@([a-zA-Z+\\.])+[a-zA-Z]{2,}$")) {
                System.out.println("電子郵件信箱地址不正確");
                System.out.println("請再次輸入電子郵件信箱：");
                email = SC.nextLine();
                
            } else {
                System.out.println("電子郵件信箱格式正確");
                i++;
            }
        }
        System.out.println("程式結束!");
    }
}