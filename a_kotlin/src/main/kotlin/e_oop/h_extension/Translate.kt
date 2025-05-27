package e_oop.h_extension

// 확장함수와 확장속성
private val Payment.chinaPrice:String
    get() = "${this.payPrice / 200} wian"

fun main(){
    val payment = Payment("아메리카노", 3, 9000)
    println(payment.chinaPrice)
}