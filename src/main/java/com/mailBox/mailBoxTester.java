package com.mailBox;

import java.sql.SQLOutput;
import java.util.Scanner;

public class mailBoxTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float length;
        float width;
        int height;
        int Select;
        String box;
        Box3 box3 = new Box3();
        Box5 box5 = new Box5();

        while(true){
            System.out.println("Please Select item:\n 1. mailBox\n 2. End");  //詢問選擇項目
            Select = scanner.nextInt();
            if(Select == 1){
                scanner = new Scanner(System.in);
                System.out.println("Please enter object's length:");
                length = scanner.nextFloat();
                System.out.println("Please enter object's width:");
                width = scanner.nextFloat();
                System.out.println("Please enter object's height:");
                height = scanner.nextInt();
                box = scanner.next();

                if(box.equals("Box3")) {
                    System.out.println(box3.validate(length,width,height));    //印出box是否符合
                }
                else if(box.equals("Box5")){
                    System.out.println(box5.validate(length,width,height));    //印出box是否符合
                }
                else{
                    System.out.println("No this Box.");  //輸入非Box3和Box5的箱子的處裡
                }
            }
            else if(Select == 2)
            {
                break;
            }
            else{
                System.out.println("No this item.");
            }
        }

    }
}
