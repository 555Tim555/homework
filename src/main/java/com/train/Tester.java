package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of tickets:");
        int ticket = scanner.nextInt();                             //輸入購買張數
        System.out.println("How many round-trip tickets:");
        int rt_ticket = scanner.nextInt();                          //輸入來回票的張數

        train Ticket = new train(ticket,rt_ticket);   //建立train_ticket的類別物件，並設初始值
        Ticket.total_monly();                                       //呼叫改買的總金額並印出

    }
}
