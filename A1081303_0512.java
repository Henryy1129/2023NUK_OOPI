// 丁丁退休之後打算開一間水餃店, 店裡每天預計準備5000顆豬肉水餃, 3000顆牛肉水餃以及1000顆蔬菜水餃, 請您幫丁丁的水餃店設計一個銷售的模擬器。
// (1) 請使用多執行緒來設計此模擬器, 並考慮同步的問題。
// (2) 使用者可以輸入同時光顧的顧客數目。
// (3) 每位顧客每次可同時點10到50顆水餃, 模擬點水餃數請以亂數產生。
// (4) 請亂數選取顧客點餐的水餃種類(豬肉水餃, 牛肉水餃或蔬菜水餃)。
// (5) 水餃售完為止。
// (6) 當顧客點餐後, 在下一位顧客開始點餐前必須有等待服務生的時間, 此等待的暫停時間為3秒。

package HW;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import java.util.Scanner;

class DumplingShop extends Thread {

    // 每天預計準備5000顆豬肉水餃, 3000顆牛肉水餃以及1000顆蔬菜水餃
    private int PORK = 5000;
    private int BEEF = 3000;
    private int VEGETABLE = 1000;

    public DumplingShop() {
        this.PORK=PORK;
        this.BEEF=BEEF;
        this.VEGETABLE=VEGETABLE;
    }
    public void run() {
        System.out.println("");
        

    }
}

class pork extends DumplingShop {

    public synchronized void pork_count(int PORK, int pork_order_num) {
        PORK -= pork_order_num;
        if (PORK == 0) {
            System.out.println("豬肉水餃已售完");
        } else if (PORK < 0) {
            System.out.println("只剩" + PORK * -1 + "個豬肉水餃了，不夠您要的" + pork_order_num + "顆");
        }
    }
}

class beef extends DumplingShop {

    public synchronized void beef_count(int BEEF, int beef_order_num) {
        BEEF -= beef_order_num;
        if (BEEF == 0) {
            System.out.println("牛肉水餃已售完");
        } else if (BEEF < 0) {
            System.out.println("只剩" + BEEF * -1 + "個牛肉水餃了，不夠您要的" + beef_order_num + "顆");
        }
    }
}

class vegetable extends DumplingShop {

    public synchronized void vegetable_count(int VEGETABLE, int vegetable_order_num) {
        VEGETABLE -= vegetable_order_num;
        if (VEGETABLE == 0) {
            System.out.println("蔬菜水餃已售完");
        } else if (VEGETABLE < 0) {
            System.out.println("只剩" + VEGETABLE * -1 + "個蔬菜水餃了，不夠您要的" + vegetable_order_num + "顆");
        }
    }
}

public class A1081303_0512 {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);

        // 使用者可以輸入同時光顧的顧客數目。
        System.out.println("請輸入同時光顧的客人數目：");
        int cus_num = SC.nextInt();

        // 每位顧客每次可同時點10到50顆水餃, 模擬點水餃數請以亂數產生。
        int randomNumber = ThreadLocalRandom.current().nextInt(10, 51);
        int[] order_num = { cus_num };

        // 請亂數選取顧客點餐的水餃種類(豬肉水餃, 牛肉水餃或蔬菜水餃)。
        String[] foods = { "牛肉", "豬肉", "蔬菜" };
        String[] order_type = {};
        Random random = new Random();

        int i, j;
        for (i = 0; i < order_num.length; i++) {
            order_num[i] = randomNumber; // 產生 10 到 50 之間的整數亂數
            int randomIndex = random.nextInt(foods.length); // 產生 0 到 2 的亂數索引
            order_type[i] = foods[randomIndex];
        }

        DumplingShop dumpling = new DumplingShop();
        for (j=0 ; j<order_num.length ; j++) {
            dumpling.run();
        }


    }
}
