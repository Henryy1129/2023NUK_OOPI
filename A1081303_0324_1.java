/*
1.請依照以下需求設計 Java 物件導向程式.
    (1)請建立一動物類別(animal), 內容包括:
        A. 設定項目姓名, 身高, 體重, 速度等屬性.
        B. 設計show() 方法, 可以顯示項目姓名, 身高, 體重, 速度等屬性值.
        C. 設計一個有回傳值的 distance(x, y) 方法 (計算跑步距離), × 為時間(分鐘), y 為加速度(double 值).
            計算公式為 x * y * 速度, x 與 y 請讓使用者輸入
        D. 承D小題, 請考慮方法多載化, 讓使用者僅輸入 x 時間也可以計算, 計算公式為 x * 速度.
    (2)再建立一個執行用的類別(含main 方法), 内容包含:
        A. 產生所有物件實體並設定屬性值.
        B. 執行所有show() 方法.
        C. 讓使用者針對每個成員輸人x, y (或只有x), 並執行 distance 方法 , 且印出每個成員奔跑的距離.
            
            項目姓名    身高(公尺)  體重(公斤)  速度(公尺/分鐘)
            雪寶        1.1       52         100
            驢子        1.5       99         200
            安那        1.7       48         120
            艾莎        1.7       50         120
 */ 
 
package HW;
import java.util.Scanner;

class animal {
    String name;        //宣告屬性
    double height, weight, speed;

    void show() {       //印出基本資訊
        System.out.println("Information:");
        System.out.println("Name:" + name);
        System.out.println("Height:" + height);
        System.out.println("Weight:" + weight);
        System.out.println("Speed::" + speed);
        System.out.println(" ");
    }

    double distance(double x, double y) {       //距離=時間*加速度*速度
        double i = x*y*speed;
        return i;
    }

    double distance(double x) {                 //距離=時間*速度 (不輸入加速度)
        double i = x*speed;
        return i;
    }
}

public class A1081303_0324_1 {
    public static void main(String[] argv) {

        animal[] animals = new animal[4];       //宣告基本資訊
        for(int i=0 ; i<animals.length ; i++){
            animals[i] = new animal();
        }

        animals[0].name="Olaf";
        animals[0].height=1.1;
        animals[0].weight=52;
        animals[0].speed=100;

        animals[1].name="Donkey";
        animals[1].height=1.5;
        animals[1].weight=99;
        animals[1].speed=200;

        animals[2].name="Anna";
        animals[2].height=1.7;
        animals[2].weight=48;
        animals[2].speed=120;

        animals[3].name="Elsa";
        animals[3].height=1.7;
        animals[3].weight=50;
        animals[3].speed=120;

        for(int i=0 ; i<animals.length ; i++) {         //呼叫show(), 印出基本資訊
            animals[i].show();
        }

        double x, y, D;         //輸入x, y 或只輸入x, 並印出距離計算結果
        int T;
        System.out.println("Input the number: Time(x) and Acceleration(y)" );
        System.out.println("x:" );
        Scanner SC =new Scanner(System.in);
        x = SC.nextInt();           //輸入x
        
        System.out.println("Do you know the Acceleration? (yes=1, no=0)" );     //決定是否輸入y, 1=輸入, 0=不輸入
        T = SC.nextInt();
        if (T == 1){                //輸入y, 呼叫distance(x, y), 並印出結果
            System.out.println("y:" );
            y = SC.nextInt();
            for(int j=0 ; j<animals.length ; j++) {
                D = animals[j].distance(x, y);
                System.out.println("The distance of " + animals[j].name + " : " + D);   
            }
        } else {                    //不輸入y, 呼叫distance(x), 並印出結果
            for(int k=0 ; k<animals.length ; k++) {
                D = animals[k].distance(x);
                System.out.println("The distance of " + animals[k].name + " : " + D);   
            }
        }
        SC.close();
    }
}
