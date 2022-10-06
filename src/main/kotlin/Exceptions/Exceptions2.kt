package Exceptions

import Packages.atomictest.*
fun main(){
    capture { "1$".toInt()
    }eq "NumberFormatExeption: " +
            """ For input string:" 1$""""

}