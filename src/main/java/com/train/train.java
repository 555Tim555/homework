package com.train;

public class train {
    int total_ticket;//購買的總張數
    int rt_ticket;//來回票的張數

    public train(int ticket,int rt_ticket){         //設定購買的總張數和來匯票張數
        this.total_ticket = ticket;
        this.rt_ticket = rt_ticket;
    }
    public void total_monly(){
        System.out.println("Total tickets:" + total_ticket);        //印出購買的總張數
        System.out.println("Round-trip:" + rt_ticket);              //印出來回票張數
        System.out.println("Total:" + (int)((total_ticket-rt_ticket)*1000+(rt_ticket*2000*0.9)));   //印出總金額
    }
}
