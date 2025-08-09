package Topshiriq4

class ServiceCourseWorkImpl : ServiceCourseWork {
    override fun courseTopicInfo(topicName: String, receiverName: String, deadline: String) {
        println("Kurs ishi mavzusi: ${topicName},\nQabul qiluvchini ismi: ${receiverName},\nQabul qilish yakuniy kuni: ${deadline}")
    }

    override fun minCondition(pageCount: String, pageSize: String) {
        println("Kurs ishiga ketadiga varoqlar soni: ${pageCount},\nKurs ishining varoqg'ining hajmi: ${pageSize} ")
    }
}