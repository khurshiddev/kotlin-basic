package Section_2.Chapter_2_Exceptions

import atomictest.capture

fun main(){
    capture { "1$".toInt()
    }eq "NumberFormatExeption: " +
            """ For input string:" 1$""""

}