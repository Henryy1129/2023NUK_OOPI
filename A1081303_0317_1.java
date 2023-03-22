// 請數用者輸入n, m
// 1. 請用二維陣列儲存產生n*m的值.
// 2. 請用二維陣列讀出n*m的值.
// 3. 請用for迴圈儲存資料, 並用for each 讀出資料.

package HW;
import java.util.Scanner;

public class A1081303_0317_1 {
    public static void main(String argv[]){
        int n, m, i, j;
        System.out.print("請輸入n");
        Scanner SC =new Scanner(System.in);
        n = SC.nextInt();
        System.out.print("請輸入m");
        m = SC.nextInt();
        System.out.println("此為" + n + "*" + m + "陣列");
        
        int [][] array=new int[n][m];

        System.out.println("用二維陣列儲存產生"+n+"*"+m+"的值, 並用二維陣列讀出"+n+"*"+m+"的值:");
        for(i=1 ; i<=n ; i++){
            for(j=1 ; j<=m ; j++){
                array[i-1][j-1]=i*j;
                System.out.print(array[i-1][j-1] + " ");
            }
            System.out.println();
        }

        System.out.println("用for each讀出資料:");

        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
}
