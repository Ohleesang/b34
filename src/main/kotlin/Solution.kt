/**
 * l ~ r    정수 중에 순사 0과 5로만 이루어진 모든 정수를 오름차순으로 저장
 */

class Solution {
    fun solution(l: Int, r: Int): IntArray {
        var answer: IntArray = intArrayOf()

        val range = (l..r)

        answer = range.filter{
            it.toString().contains(Regex("^[05]+$"))
        }.toIntArray()
        if(answer.isEmpty()) answer = intArrayOf(-1)
        return answer
    }
}

fun main() {
    var a = Solution()
    a.solution(5, 555)//5,50,55,500,505,550,555
    a.solution(10, 20)//-1

}