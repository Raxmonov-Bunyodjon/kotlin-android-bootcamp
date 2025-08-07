class Driver {

    var count: Int = 0
}

fun Driver.addCar(newCount: Int): Int{
    var driver = this
    driver.count += newCount
    return driver.count
}