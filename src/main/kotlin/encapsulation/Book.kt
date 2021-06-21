package encapsulation

class Book(val name:String,val author:String) {
    var price = 0
    set(value) {
        if (value>=5)
            field = value
        else
            println("Price can't be less than 5")
    }
    get() = field

}