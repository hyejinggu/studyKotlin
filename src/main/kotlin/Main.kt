package org.example

import org.example.Person.Person

fun main() {
    // 바꿀 수 있는 변수
    // 타입 작성 하지 않아도 되지만 작성해야 할 때는 : 뒤에 붙여줌
    // 초기화하지 않고 선언만 할 경우 타입 명시해야 함
    var num1 = 10L
    var num2: Long = 10L
    var num3: Long

    // 바꿀 수 없는 변수 ( = final)
    // val 컬렉션에는 element를 추가할 수 있음
    val num4 = 10L

    // Tip: 모든 변수는 우선 val로 만들고 필요한 경우 var로 변경한
    // Primitive Type, Reference Type 구분이 없고 연산을 할 경우 primitive type으로 내부에서 알아서 처리함.


    // Null
    // 기본 설계가 변수에는 null이 들어갈 수 없게 설계해 놓음 하지만 필요한 경우 타입에 ?를 붙여줌
    var num5: Long? = 1000L
    num5 = null


    // 객체 타입 인스턴스
    var person = Person("hyejin")


    println("Hello World!")
    println(num2)
}