import com.mailBox.Box3
import com.mailBox.Box5
import java.util.*

fun main() {
    var scanner = Scanner(System.`in`)
    var length: Float
    var width: Float
    var height: Int
    var select: Int
    var box: String
    val box3 = Box3()
    val box5 = Box5()

    while (true) {
        println("Please Select item:\n 1. mailBox\n 2. End") //詢問選擇項目
        select = scanner.nextInt()
        if (select == 1) {
            scanner = Scanner(System.`in`)
            println("Please enter object's length:")
            length = scanner.nextFloat()
            println("Please enter object's width:")
            width = scanner.nextFloat()
            println("Please enter object's height:")
            height = scanner.nextInt()
            box = scanner.next()
            if (box == "Box3") {
                println(box3.validate(length, width, height)) //印出box是否符合
            } else if (box == "Box5") {
                println(box5.validate(length, width, height)) //印出box是否符合
            } else {
                println("No this Box.") //輸入非Box3和Box5的箱子的處裡
            }
        } else if (select == 2) {
            break
        } else {
            println("No this item.")
        }
    }
}

class Box3(var length : Float, var width : Float, var height : Int){
    private val l = 23
    private val w = 14
    private val h = 13

    fun validate(length: Float,width: Float,height: Int) : Boolean = l < length || w < width || h < height
}

class Box5(var length : Float, var width : Float, var height : Int){
    private val l = 23
    private val w = 14
    private val h = 13
    fun validate(length: Float,width: Float,height: Int) : Boolean = l < length || w< width || h < height
}