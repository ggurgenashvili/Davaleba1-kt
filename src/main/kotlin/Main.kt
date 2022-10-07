import java.util.Scanner


fun main(args: Array<String>) {
    println("enter text:")
    val firstText = Scanner(System.`in`).nextLine()

    //სტატიკურად მინიჭებული ცვლადი შემთხვევაში
//    val firstText = "ana"

    var reverseText = ""
    var length = firstText.length
    for (i in (length - 1) downTo 0){
        reverseText = reverseText + firstText[i]
    }
    if (firstText.equals(reverseText, ignoreCase = true)){
        println("True")
    }else {
        println("False")
    }




    fun arraySum (){
        val num : Array<Int> = arrayOf(3,4,6,5,10)

        val sum  = num.sum()
        println("whole value is $sum")
    }

}




