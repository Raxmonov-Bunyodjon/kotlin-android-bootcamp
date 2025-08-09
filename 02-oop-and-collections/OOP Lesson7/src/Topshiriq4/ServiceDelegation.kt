package Topshiriq4

class ServiceDelegation(private val serviceCourseWorkImpl: ServiceCourseWork): ServiceCourseWork by serviceCourseWorkImpl {
}