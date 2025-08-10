package Topshiriq3

import java.util.Scanner

class SocialNetwork {
    private val users = mutableListOf<User>()
    private val posts = mutableListOf<Post>()
    private var currentUser: User? = null
    private var userIdCounter = 1
    private var postIdCounter = 1
    private val scanner = Scanner(System.`in`)

    fun start() {
        while (true) {
            println("\n===== Ijtimoiy Tarmoq =====")
            println("1. Register")
            println("2. Login")
            println("3. Post yaratish")
            println("4. Postlarni ko‘rish")
            println("5. Like qo‘yish")
            println("6. Status o‘zgartirish")
            println("0. Chiqish")
            print("Tanlang: ")

            when (scanner.nextInt()) {
                1 -> register()
                2 -> login()
                3 -> createPost()
                4 -> viewPosts()
                5 -> likePost()
                6 -> changeStatus()
                0 -> return
                else -> println("❌ Noto‘g‘ri tanlov!")
            }
        }
    }

    private fun register() {
        print("Yangi username kiriting: ")
        val username = readLine()!!
        print("Parol kiriting: ")
        val password = readLine()!!
        users.add(User(userIdCounter++, username, password))
        println("✅ Ro‘yxatdan o‘tdingiz!")
    }

    private fun login() {
        print("Username: ")
        val username = readLine()!!
        print("Parol: ")
        val password = readLine()!!

        val user = users.find { it.username == username && it.password == password }
        if (user != null) {
            currentUser = user
            println("✅ Xush kelibsiz, ${user.username}!")
        } else {
            println("❌ Login yoki parol noto‘g‘ri!")
        }
    }

    private fun createPost() {
        if (currentUser == null) {
            println("❌ Avval tizimga kiring!")
            return
        }
        print("Post matnini kiriting: ")
        val content = readLine()!!
        posts.add(Post(postIdCounter++, currentUser!!, content))
        println("✅ Post yaratildi!")
    }

    private fun viewPosts() {
        if (posts.isEmpty()) {
            println("📭 Hali post yo‘q.")
            return
        }
        println("\n===== Barcha postlar =====")
        for (post in posts) {
            println("#${post.id} | ${post.author.username} (${post.author.status}): ${post.content} ❤️ ${post.likes}")
        }
    }

    private fun likePost() {
        print("Like qo‘ymoqchi bo‘lgan post ID sini kiriting: ")
        val id = readLine()!!.toInt()
        val post = posts.find { it.id == id }
        if (post != null) {
            post.addLike()
            println("❤️ Like qo‘yildi!")
        } else {
            println("❌ Post topilmadi!")
        }
    }

    private fun changeStatus() {
        if (currentUser == null) {
            println("❌ Avval tizimga kiring!")
            return
        }
        print("Yangi status kiriting: ")
        val status = readLine()!!
        currentUser!!.changeStatus(status)
    }
}