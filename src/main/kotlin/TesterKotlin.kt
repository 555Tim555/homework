import java.util.*

fun main() {
    val scanner =Scanner(System.`in`)

    var ticket = 0
    var rTicket = 0
    var Ticket = Train_Ticket(ticket,rTicket)            //建立Train_Ticket變數，並給於初始值
    while(true){
        print("Please enter number of tickets:")
        ticket = readLine()!!.toInt()                       //輸入購買張數
        if(ticket == -1)break                               //判斷是否結束訂票
        print("How many round-trip tickets:")
        rTicket = readLine()!!.toInt()                      //輸入來回票的張數
        Ticket = Train_Ticket(ticket,rTicket)
        Ticket.total_monly()                                //呼叫改買的總金額並印出
    }
    println("End")



}

class Train_Ticket(var ticket : Int,var rt_ticket : Int){
    fun total_monly(){
        var monly = ((ticket-rt_ticket)*1000+(rt_ticket*2000*0.9)).toInt()
        println("Total tickets:$ticket")       //印出購買的總張數
        println("Round-trip:$rt_ticket")        //印出來回票張數
        println("Total: $monly")  //印出總金額
    }
}