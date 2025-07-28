package Topshiriq3

class Company {
    private val workers = mutableListOf<Worker>()

    fun addWorker(worker: Worker) {
        workers.add(worker)
    }

    fun findWorkersOlderThan(age: Int): List<Worker> {
        return workers.filter { it.age > age }
    }
}