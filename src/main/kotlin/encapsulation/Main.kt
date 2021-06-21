package encapsulation

fun main(){
    val book = Book("abc","Mr.xyz")
    println("Name of the book is ${book.name}")
    println("Author of the book is ${book.author}")
    println("Price of the book is ${book.price}")
    //    book.name = "abcd" // name is constant
    //    book.author = "Mr.wxyz" // author is constant
    book.price = 50
    println("Price of the book is ${book.price}")

    book.price = 3
    println("Price of the book is ${book.price}")
}