package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ticket = 0;
        int rTicket = 0;
        Train Ticket = new Train(ticket,rTicket);

        while(true)
        {
            System.out.println("Please enter number of tickets:");
            ticket = scanner.nextInt();                            //輸入購買張數
            if(ticket == -1)break;                                 //判斷是否結束訂票
            System.out.println("How many round-trip tickets:");
            rTicket = scanner.nextInt();                           //輸入來回票的張數
            Ticket = new Train(ticket,rTicket);         //建立train_ticket的類別物件，並設初始值
            Ticket.total_monly();                               //呼叫購買的總金額並印出

        }
        System.out.println("End");
    }
}
