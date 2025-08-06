package Topshiriq6

import java.util.Random
import java.util.Scanner

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    var random = Random()

    var info = Download.Info()
    var success = Download.Success()
    var failure = Download.Failure()
    var loading = Download.Loading()

    info.createInfo()
    println("=============")
    info.showInfo()

    when(random.nextInt(3)){
        1->{
            success.showStatusDownlod()
        }
        2->{
            failure.showStatusDownlod()
        }
        3->{
            loading.showStatusDownlod()
        }
    }

}