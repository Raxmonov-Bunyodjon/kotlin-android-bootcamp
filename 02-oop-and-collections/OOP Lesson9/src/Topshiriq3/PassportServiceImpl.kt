package Topshiriq3

import java.util.Scanner

class PassportServiceImpl : PassportService {


    private val passportSet = HashSet<Passport>()

    override fun addInfo(passport: Passport) {
        if (passportSet.contains(passport)) {
            println("❗ Passport with serial '${passport.passportNumberSerial}' already exists.")
        } else {
            passportSet.add(passport)
            println("✅ Passport added successfully.")
        }
    }

    override fun showAll() {
        if (passportSet.isEmpty()) {
            println("📭 No passport data available.")
        } else {
            println("📘 All passports:")
            passportSet.forEach { println(it) }
        }
    }
}

