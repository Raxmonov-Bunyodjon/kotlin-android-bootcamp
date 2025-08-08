package Topshiriq4

fun main(args: Array<String>) {

    println("Android development online in PDP".reverseWord())
    println(3.myPow(3))

    println(7.tubSon())

    println(Int.MAX_VALUE.returnInString())

    var a = arrayListOf<Int>(5,6,8,9,6)

    a.sort()

    println(a)

}

fun String.reverseWord():String{
    var countEmpty = 0
    for(element in this){
        if (element == ' '){
            countEmpty++
        }
    }
    var word = arrayOfNulls<String>(countEmpty+1)
    var index = 0
    var count = 0
    var str = ""
    loop@for (i in index until this.length){
        if (this[i] != ' '){
            str += this[i]
            index++
        } else {
            word[count++] = str
            str = ""
            index++
            continue@loop
        }
    }
    word[count] = str
    str = ""
    for (i in countEmpty downTo 0){
        str += word[i]
        if (i != 0){
            str += " "
        }
    }
    return str
}

fun Int.myPow(n:Int):Int{
    var sum = 1
    for (i in 0 until n){
        sum *= this
    }
    return sum
}

fun Int.tubSon():Boolean{
    var tub = false
    for (i in 2 until this){
        tub = this%i != 0
    }
    return tub
}

fun Int.returnInString():String{
    var son = ""
    var m = this
    var xona = 0
    while (m>0){
        xona++
        m = (m-m%10)/10
    }
    m = xona
    var m1 = xona
    for (i in xona-1 downTo 0){
        var x = 10.myPow(i)
        if (i!=1 && i!=4 && i!=7 && i!=10){
            when(this/x%10){
                1-> son += " bir"
                2-> son += " ikki"
                3-> son += " uch"
                4-> son += " to'rt"
                5-> son += " besh"
                6-> son += " olti"
                7-> son += " yetti"
                8-> son += " sakkiz"
                9-> son += " to'qqiz"
            }
        } else if (i==1 || i==4 || i==7 || i==10){
            when(this/x%10){
                1-> son += " o'n"
                2-> son += " yigirma"
                3-> son += " o'ttiz"
                4-> son += " qirq"
                5-> son += " ellik"
                6-> son += " oltmish"
                7-> son += " yetmish"
                8-> son += " sakson"
                9-> son += " to'qson"
            }
        }
        when(m){
            3,6,9 -> son += " yuz"
            4-> son += " ming"
            7-> son += " million"
            10-> son += " milliard"
        }
        m--
    }
    return son.substring(1,son.length)
}

fun Array<Int>.sort(){
    for (i in this.indices){
        for (j in i+1 until this.size){
            if (this[i] <= this[j]){
                var c = this[i]
                this[i] = this[j]
                this[j] = c
            }
        }
    }
}
