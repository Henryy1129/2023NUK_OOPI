// 試寫一查的樂透對獎程式,程式中存有當期中獎碼,使用者可輸入任一組六個整數(1〜49), 程式即檢查是否中獎。
// 但當輸入1~49以外的數時, 則以例外的方式結束程式, 並顯示相關訊息。

// package HW;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A1081303_0505 {
  public static void main(String[] args) throws Exception {

    // 中獎號碼
    int[] winningNumber = { 2, 8, 14, 23, 35, 48 };

    Scanner SC = new Scanner(System.in);
    System.out.println("請輸入樂透號碼(請輸入六個整數, 每個整數在1~49之間");
    int[] userNumbers = new int[6];

    // 比對輸入的數字是否在1~49之間
    for (int i = 0; i < 6; i++) {
      try {
        int input = SC.nextInt();
        if (input < 1 || input > 49) {
          throw new InputMismatchException();
        }
        userNumbers[i] = input;
      } catch (InputMismatchException e) {
        System.out.println("請輸入1-49之間的數字!");
        System.out.println("程式結束");
        return;
      }
    }

    // 對比是否中獎
    int matchNumber = 0;
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        if (winningNumber[i] == userNumbers[j]) {
          matchNumber++;
          break;
        }
      }
    }

    // 結果
    System.out.println("中獎號碼為" + Arrays.toString(winningNumber));
    System.out.println("您輸入的號碼為：" + Arrays.toString(userNumbers));

    if (matchNumber == 0) {
      System.out.println("很抱歉, 您未中獎QQ");
    } else if (matchNumber == 6) {
      System.out.println("恭喜您中頭獎!!!!!");
    } else {
      System.out.println("恭喜您中了" + matchNumber + "個號碼!");
    }
  }
}