package PropertyAccessors


/*fun main() {
    val summary = 25
    val weektime = 40
    val bonussumtime = 50
    val overworktime = 5

    if (weektime < 45) {
        println("Haftasiga 40 soat ishlagan oyliginigz ${weektime * summary}" )
        println("Qo'shimcha bonus oylik ${bonussumtime* overworktime}")

    } else (weektime <= 40)
    println("${weektime*summary}")

}

 */

fun main () {
    var hourWorked = 45
    var fee = 0
    if(hourWorked>40){
        val hourOverWorked = hourWorked - 40
        fee+=hourOverWorked * 50
    }
    fee+= 40 * 25
    println(fee)
}


