fun main(args: Array<String>) {

    var map = HashMap<String, String>()
    map.put("Toshkent","O'zbekiston")
    map.put("London","Engliya")
    map.put("Rim","Italiya")
    map.put("Parij","Fransiya")

    println(map)

    map.remove("Rim")

    println(map)

    map.replace("Parij", "Turkiya")

    println(map)
}