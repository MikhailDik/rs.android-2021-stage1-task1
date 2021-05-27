package subtask3

import java.util.*

class StringParser {

    fun findExp(str: String, b: Char, e: Char): String {
        val s: Stack<Int> = Stack()
        for (i in str.indices) {
            if (str[i] == b) s.push(i)
            if ((str[i] == e) and !s.empty()) {
                s.pop()
                if (s.empty()) return str.substring(1, i)
            }
        }
        return "0"
    }

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {

        val stringList: MutableList<String> = mutableListOf()

        for (i in inputString.indices) {
            if (inputString[i] == '<')  stringList.add(findExp(inputString.substring(i),'<','>'))
            if (inputString[i] == '(')  stringList.add(findExp(inputString.substring(i),'(',')'))
            if (inputString[i] == '[')  stringList.add(findExp(inputString.substring(i),'[',']'))
        }

        return stringList.toTypedArray()

    }

}

/*fun main() {

    val parser = StringParser()

    val str: String = "<A(B)>(<C[D])E>"
    val tA = parser.getResult(str)

    val a = 10


}*/