package org.example

class StudyNull {
    // kotlin에서는 null이 가능한 타입을 완전히 다르게 취급한다.
    fun startsWithA1(str: String?):Boolean {
        return str?.startsWith("A")
            ?: throw IllegalArgumentException("null!!")

        /*if (str == null) {
            throw IllegalArgumentException("null!!")
        }
        return str.startsWith("A")*/
    }

    fun startsWithA2(str: String?): Boolean? {
        return str?.startsWith("A")
        /*if (str == null) return null
        return str.startsWith("A")*/
    }

    fun startsWithA3(str: String?) : Boolean {
        return str?.startsWith("A") ?: false
        /*if(str == null) return false
        return str.startsWith("A")*/
    }

    // Safe Call: null이 아니면 실행하고 null이면 실행하지 않는다.
    fun SafeCall() {
        var str: String? = "ABC"
        str?.length
    }

    // Elvis: 앞의 연산 결과가 null이면 뒤의 값을 사용
    fun Elvis() {
        var str: String? = "ABC"
        str?.length ?: 0
    }

    // null이 아닐 경우를 단언하는 경우: nullable 타입이지만 null이 되면 안되는 경우 !! 을 붙여줌
    fun startsWith(str: String?) : Boolean {
        return str!!.startsWith("A")
    }

    // 플랫폼 타입: 코틀린이 null 관련 정보를 알 수 없는 타입 - 런타임 시 exception이 날 수 있음



}