package Topshiriq2

fun main(args: Array<String>) {

    var bought_sold_process1 = Car("Chevrolet","Naxia 3",2023, "Oq", "Yaxshi kraska sepilmagan urilmagan pitnosi yo`q","Bezin va Gaz(Metan)","Mexanik").Carmarket("Abduhoshim","Bunyodjon",11000.0)
    var bought_sold_process2 = Car("Chevrolet","Cobalt",2024, "Qora", "Yaxshi kraska sepilmagan urilmagan pitnosi yo`q","Bezin va Gaz(Metan)","Avtomat").Carmarket("Salon dan Oybek","Asilbek",12000.0)
    var bought_sold_process3 = Car("Chevrolet","Matiz",2017, "Oq", "Yaxshi kraska sepilmagan urilmagan pitnosi yo`q","Bezin va Gaz(Metan)", "Mexanika").Carmarket("Xurshid","Bektemir",4000.0)


    println("<<<<<<<<<<<<<<<<<<<<<<<Avtomabil oldi savdo jarayoni>>>>>>>>>>>>>>>>>>>>>>>>>>>")
    println("Birinchi jarayon: \n${bought_sold_process1.formalizationProcess()}\nIkkinchi jarayon: \n${bought_sold_process2.formalizationProcess()}\nUchinchi jarayon: ${bought_sold_process3.formalizationProcess()}.")

}