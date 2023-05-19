import java.util.Random;
import java.util.Scanner;

public class A1081303_0512 {
    private static final int PORK_DUMPLINGS = 5000;
    private static final int BEEF_DUMPLINGS = 3000;
    private static final int VEGETABLE_DUMPLINGS = 1000;

    private static int porkDumplingsRemaining = PORK_DUMPLINGS;
    private static int beefDumplingsRemaining = BEEF_DUMPLINGS;
    private static int vegetableDumplingsRemaining = VEGETABLE_DUMPLINGS;

    // main
    public static void main(String[] args) {

        int numCustomers = getNumCustomers();
        Thread[] threads = new Thread[numCustomers];

        for (int i = 0; i < numCustomers; i++) {
            int j = i + 1;
            threads[i] = new Thread(() -> {
                int numDumplings = generateRandomDumplingCount();
                String dumplingType = getRandomDumplingType();
                System.out.print("第" + j + "位客人買了");
                if (dumplingType.equals("Pork")) {
                    orderPorkDumplings(numDumplings);
                } else if (dumplingType.equals("Beef")) {
                    orderBeefDumplings(numDumplings);
                } else {
                    orderVegetableDumplings(numDumplings);
                }
            });
            threads[i].start();

            try {
                Thread.sleep(3000); // 等待服務生的時間
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < numCustomers; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("完售～");
        System.out.println("程式結束！");
    }

    // 顧客數量
    private static int getNumCustomers() {
        // 使用者輸入同時光顧的顧客數目
        Scanner SC = new Scanner(System.in);
        System.out.println("請輸入同時光顧的客人數目：");
        int cus_num = SC.nextInt();
        return cus_num; // 回傳顧客數量
    }

    // 產生水餃數量
    private static int generateRandomDumplingCount() {
        // 產生一個介於10到50之間的亂數
        return new Random().nextInt(41) + 10;
    }

    // 產生水餃種類
    private static String getRandomDumplingType() {
        // 亂數選取水餃種類
        String[] dumplingTypes = { "Pork", "Beef", "Vegetable" };
        int randomIndex = new Random().nextInt(dumplingTypes.length);
        return dumplingTypes[randomIndex];
    }

    // 計算售出之豬肉水餃
    private static synchronized void orderPorkDumplings(int count) {
        if (porkDumplingsRemaining >= count) {
            porkDumplingsRemaining -= count;
            System.out.println(count + "顆豬肉水餃已出售" + "豬肉水餃還剩餘" + porkDumplingsRemaining);
        } else {
            System.out.println("豬肉水餃不足");
        }
    }

    // 計算售出之牛肉水餃
    private static synchronized void orderBeefDumplings(int count) {
        if (beefDumplingsRemaining >= count) {
            beefDumplingsRemaining -= count;
            System.out.println(count + "顆牛肉水餃已出售" + "牛肉水餃還剩餘" + beefDumplingsRemaining);
        } else {
            System.out.println("牛肉水餃不足");
        }
    }

    // 計算售出之蔬菜水餃
    private static synchronized void orderVegetableDumplings(int count) {
        if (vegetableDumplingsRemaining >= count) {
            vegetableDumplingsRemaining -= count;
            System.out.println(count + "顆蔬菜水餃已出售" + "蔬菜水餃還剩餘" + vegetableDumplingsRemaining);
        } else {
            System.out.println("蔬菜水餃不足");
        }
    }
}