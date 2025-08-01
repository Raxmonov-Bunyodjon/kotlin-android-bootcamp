package Topshiriq3

class Student : Person {
    private var program: String = ""
    private var year: Int = 0
    private var fee: Double = 0.0

    constructor() : super()
    constructor(program: String, year: Int, fee: Double) : super() {
        this.program = program
        this.year = year
        this.fee = fee
    }

    constructor(name: String, address: String, program: String, year: Int, fee: Double) : super(name, address) {
        this.program = program
        this.year = year
        this.fee = fee
    }

    fun getProgram(): String = program
    fun setProgram(program: String) {
        this.program = program
    }

    fun getYear(): Int = year
    fun setYear(year: Int) {
        this.year = year
    }

    fun getFee(): Double = fee
    fun setFee(fee: Double) {
        this.fee = fee
    }

    override fun toString(): String {
        return "Student(Person:(name='${getName()}',address='${getAddress()}') program='$program', year=$year, fee=$fee)"
    }
}