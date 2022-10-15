package Section_3.Chapter_6_Data_Classes

import atomictest.eq
import kotlin.contracts.contract

data class DetailedContact(
    val name: String,
    val surname: String,
    val number: String,
    val address: String
)

fun main() {
    val contact = DetailedContact(
        "Miffy",
        "Miller",
        "1810-2029",
        "Seoul Seokye 127"
    )
    val newcontact = contact.copy(
        number = "010-7754-5525",
        address = "Kangnam yeoksamg station 20"
    )
    newcontact eq DetailedContact(
        "Miffy",
        "Miller",
        "010-7754-5525",
        "Kangnam yeoksamg station 20"
    )
}