import java.util.*

fun main() {
    val scanner =Scanner(System.`in`)
    print("Please enter number of tickets:")
    var ticket = scanner.nextInt()              //輸入購買張數
    print("How many round-trip tickets:")
    var rt_ticket = scanner.nextInt()           //輸入來回票的張數

    val Ticket = Train_Ticket(ticket,rt_ticket) //建立Train_Ticket變數，並給於初始值
    Ticket.total_monly()                        //呼叫改買的總金額並印出
}

class Train_Ticket(var ticket : Int,var rt_ticket : Int){
    fun total_monly(){
        println("Total tickets:$ticket")/       //印出購買的總張數
        println("Round-trip:$rt_ticket")        //印出來回票張數
        println("Total:" + ((ticket-rt_ticket)*1000+(rt_ticket*2000*0.9)).toInt())  //印出總金額
    }
}