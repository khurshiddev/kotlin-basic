package Section_2.Exceptions

import Packages.atomictest.*
import atomictest.capture

fun main(){
    capture { "1$".toInt()
    }eq "NumberFormatExeption: " +
            """ For input string:" 1$""""

}