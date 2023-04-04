/*
1. 請建立一動物類別 (animal), 成員包会雪寶與驢子, 内容包話:
    A. 設定項目姓名, 身高, 體重, 速度等屬性.
    B. 請建立建構式以建構物件.
    C. 設計 show() 方法, 可以顯示項目性名, 身高, 體重, 速度等性質.
    D. 設計一個有回傳值的 distance(x, y) 方法(計算跑步距離), x為時間(分鐘), y為加速度(double值).
        計算公式為 (x * y * 速度), x 和 y 請讓使用者输入.
    E. 承D小題, 請考慮方法多載化, 讓使用者僅輸入 x 時間也可以計算.
        計算公式為(x * 速度) (輸入為0則默認為不輸入).
    F. 設計一個static 方法 showinfo(), 主要目的在主程式開使執行時就可以產生歡迎進入系統的訊息, 訊息為 "歡迎進入冰雪奇缘系统".

2. 請建立一人類類列（human) 繼承動物類别, 成員包含阿克, 漢斯, 安那, 內容包含:
    A. 新增性別數性値.
    B. 改寫建構式, 可以在產生物件實體時就可以設定性別.
    C. 改寫 show() 方法, 增加顯示性別屬性值.

3. 請建立一冰雪女王類別 (snow), 變承人類類別, 內容包含:
    A. 新增冰凍技能屬性値 (YES/NO).
    B. 改寫建構式, 可以在產生物件實體時就可以設定是否具有冰凍技能.
    C. 改寫 show() 方法, 增加顯示冰凍技能屬性值.
    D. 改寫 distance() 方法, 讓冰雪女王的奔跑距雄在原公式下 *2, 一樣讓使用者输入, 並考慮方法的多載化.
    
4. 再建立一個執行用的類別 (含main方法), 内容包含:
    A. 透過 static 方法顯示系統歡迎訊息.
    B. 產生所有物件實體並設定屬性值.
    C. 執行所有 show() 方法.
    D. 讓使月者針對每個成員輸入x, y (或只有x), 並執行 distance() 方法, 且印出每個成員奔跑的距離 (輸入為0則默認為不输入).

項目性名        身高(公尺)      體重(公斤)      性別        冰凍技能        速度（公尺/分鐘）
雪寶            1.1            52            Ｘ           X              100
驢子            1.5            99            Ｘ           X              200
阿克            1.9            80            男           X              150
漢斯            1.8            78            男           X              130
安那            1.7            48            女           X              120
艾莎            1.7            50            女           Yes            120
 */


package HW;
import java.util.Scanner;

public class A1081303_0331 {
    public static void main(String[] args){
        
        animal.showinfo();      // 透過 static 方法顯示系統歡迎訊息.
        
        // 產生所有物件實體並設定屬性值.
        animal animal1 = new animal("雪寶", 1.1, 52, 100);
        animal animal2 = new animal("驢子", 1.5, 99, 200);
        human human1 = new human("阿克", 1.9, 80, 150, "男");
        human human2 = new human("漢斯", 1.8, 78, 130, "男");
        human human3 = new human("安那", 1.7, 48, 120, "女");
        snow snow1 = new snow("艾莎", 1.7, 50, 120, "女", "Yes");

        // 執行所有 show() 方法.
        animal1.show();
        System.out.println(" ");
        animal2.show();
        System.out.println(" ");
        human1.show();
        System.out.println(" ");
        human2.show();
        System.out.println(" ");
        human3.show();
        System.out.println(" ");
        snow1.show();
        System.out.println(" ");


        // 讓使月者針對每個成員輸入x, y (或只有x), 並執行 distance() 方法, 且印出每個成員奔跑的距離 (輸入為0則默認為不输入).
        double x, y, d;
        Scanner SC =new Scanner(System.in);

        System.out.println(" ");
        System.out.println("請輸入各個成員的時間(x) 和加速度(y), 若不輸入加速度請於y輸入 0 表示不輸入");

        System.out.println("請輸入" + animal1.name + "的數據 (x=時間, y=加速度)");     // animal1: 雪寶
        System.out.print("x:");
        x = SC.nextInt();
        System.out.print("y:");
        y = SC.nextInt();
        d = animal1.distance(x, y);
        System.out.println(animal1.name + "的奔跑距離為: " + d + ".");
        System.out.println("----------------");
    
        System.out.println("請輸入" + animal2.name + "的數據 (x=時間, y=加速度)");     // animal2: 驢子
        System.out.print("x:");
        x = SC.nextInt();
        System.out.print("y:");
        y = SC.nextInt();
        d = animal2.distance(x, y);
        System.out.println(animal2.name + "的奔跑距離為: " + d + ".");
        System.out.println("----------------");

        System.out.println("請輸入" + human1.name + "的數據 (x=時間, y=加速度)");     // human1: 阿克
        System.out.print("x:");
        x = SC.nextInt();
        System.out.print("y:");
        y = SC.nextInt();
        d = human1.distance(x, y);
        System.out.println(human1.name + "的奔跑距離為: " + d + ".");
        System.out.println("----------------");

        System.out.println("請輸入" + human2.name + "的數據 (x=時間, y=加速度)");     // human2: 漢斯
        System.out.print("x:");
        x = SC.nextInt();
        System.out.print("y:");
        y = SC.nextInt();
        d = human2.distance(x, y);
        System.out.println(human2.name + "的奔跑距離為: " + d + ".");
        System.out.println("----------------");

        System.out.println("請輸入" + human3.name + "的數據 (x=時間, y=加速度)");     // human3: 安那
        System.out.print("x:");
        x = SC.nextInt();
        System.out.print("y:");
        y = SC.nextInt();
        d = human3.distance(x, y);
        System.out.println(human3.name + "的奔跑距離為: " + d + ".");
        System.out.println("----------------");

        System.out.println("請輸入" + snow1.name + "的數據 (x=時間, y=加速度)");     // snow1: 艾莎
        System.out.print("x:");
        x = SC.nextInt();
        System.out.print("y:");
        y = SC.nextInt();
        d = snow1.newdistance(x, y);
        System.out.println(snow1.name + "的奔跑距離為: " + d + ".");
        System.out.println("----------------");

        SC.close();
    }
}

class animal {      // 動物類別 (animal), 成員包会雪寶與驢子
    String name;        // 設定項目姓名, 身高, 體重, 速度等屬性.
    double height;
    int weight, speed;
    
    animal(String n, double h, int w, int s) {          // 建立建構式以建構物件.
        this.name = n;
        this.height = h;
        this.weight = w;
        this.speed = s;
    }
    
    void show() {       // show() 方法, 可以顯示項目性名, 身高, 體重, 速度等性質.
        System.out.print("name:" + name + "   height:" + height + "   weight:" + weight + "   speed:" + speed);
    }

    double distance(double x, double y) {     // 設計一個有回傳值的 distance(x, y) 方法(計算跑步距離), x為時間(分鐘), y為加速度(double值).
        if (y != 0) {
            double distance = x * y * speed;        // 計算公式為 (x * y * 速度), x 和 y 請讓使用者输入.
            return distance;
        }else {
            double distance = x * speed;        // 方法多載化, 讓使用者僅輸入 x 時間也可以計算, 計算公式為(x * 速度) (輸入為0則默認為不輸入).
            return distance;
        }
    }

    // 設計一個static 方法 showinfo(), 主要目的在主程式開使執行時就可以產生歡迎進入系統的訊息, 訊息為 "歡迎進入冰雪奇缘系统".
    public static void showinfo(){
        System.out.println("歡迎進入冰雪奇缘系统"); 
        System.out.println(" "); 
    }
}

class human extends animal{         // 人類類列 (human) 繼承動物類别, , 成員包含阿克, 漢斯, 安那
    String gender;     //男&女
    
    human(String n, double h, int w, int s, String g) {       // 改寫建構式, 可以在產生物件實體時就可以設定性別.
        super(n, h, w, s);     // 呼叫父類別之建構式
        this.gender = g;        
    }

    void show() {       // 改寫 show() 方法, 增加顯示性別屬性值.
        super.show();       // 調用父類別的 show() 方法
        System.out.print("  gender:" + gender);
    }

}

class snow extends human{        // 冰雪女王類別 (snow), 變承人類類別
    String snow;

    snow(String n, double h, int w, int s, String g, String sn) {        // 改寫建構式, 可以在產生物件實體時就可以設定是否具有冰凍技能.
        super(n, h, w, s, g);
        this.snow = sn;
    }

    void show() {       // 改寫 show() 方法, 增加顯示冰凍技能屬性值.
        super.show();
        System.out.print("  snow:" + snow);
    }

    // 改寫 distance() 方法, 讓冰雪女王的奔跑距雄在原公式下 *2, 一樣讓使用者输入, 並考慮方法的多載化.
    double newdistance(double x, double y) {
        if (y != 0) {
            double distance = x * y * speed * 2;        // 計算公式為 (x * y * 速度), x 和 y 請讓使用者输入.
            return distance;
        }else {
            double distance = x * speed * 2;        // 方法多載化, 讓使用者僅輸入 x 時間也可以計算, 計算公式為(x * 速度) (輸入為0則默認為不輸入).
            return distance;
        }
    }
}



