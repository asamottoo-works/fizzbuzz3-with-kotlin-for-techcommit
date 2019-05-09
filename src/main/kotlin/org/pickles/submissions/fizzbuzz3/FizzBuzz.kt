package org.pickles.submissions.fizzbuzz3

fun printFizzBuzz() {
    for (number in 1..150) {
        println(convert(number))
    }
}

fun convert(number: Int): String {

    var numberWord: String = number.toString()

    // 3桁以上の時はそのまま返す
    if (numberWord.length > 2) {
        return numberWord
    }

    // 2桁以下の時
    // 3の倍数と3がつく数字の時は末尾に「!」を付ける
    if(number % 10 == 3 || number % 3 == 0) {
        numberWord = "${numberWord}!"
    }

    while (numberWord.length < 3) {
        numberWord = "0${numberWord}"
    }

    return numberWord
}