package Topshiriq7

data class Book(
    var title: String,
    var author: String,
    var category: BookCategory,
    var status: BookStatus,
) {

    fun borrow(): String {
        return if (status == BookStatus.AVAILABLE) {
            status = BookStatus.BORROWED
            "Kitob olindi: $title"
        } else {
            "Kitob band qilingan: $title"
        }
    }


    fun returnBook(): String {
        return if (status == BookStatus.BORROWED) {
            status = BookStatus.AVAILABLE
            "Kitob muvaffaqiyatli qaytarildi: $title"
        } else {
            "Bu kitob hozircha olinmagan: $title"
        }
    }
}



