package Topshiriq4

fun main(args: Array<String>) {

    var report = ServiceDelegation(ServiceCourseWorkImpl())

    report.courseTopicInfo("Matritsa", "Olim Domila","25-08-2025-yil")
    report.minCondition("30 varoq", "A4 farmatda")
}