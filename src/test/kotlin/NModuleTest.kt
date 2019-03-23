import controllers.solution.models.Solution
import managers.solution.nmodule.*
import org.junit.Assert.assertEquals
import org.junit.Test

/**
@author boolenull on 23.03.2019
 */

class NModuleTest {

    @Test
    fun N1SolutionTest() {
        val solution = N1Solution()
        assertEquals(solution.makeResult(Solution("N-1", "200", "100", 0)), "2")
        assertEquals(solution.makeResult(Solution("N-1", "100", "200", 0)), "1")
        assertEquals(solution.makeResult(Solution("N-1", "0", "0", 0)), "0")
    }

    @Test
    fun N2SolutionTest() {
        val solution = N2Solution()
        assertEquals(solution.makeResult(Solution("N-2", "0", "100", 0)), "нет")
        assertEquals(solution.makeResult(Solution("N-2", "10564654654654650", "200", 0)), "да")
    }

    @Test
    fun N3SolutionTest() {
        val solution = N3Solution()
        assertEquals(solution.makeResult(Solution("N-3", "1", "100", 0)), "2")
        assertEquals(solution.makeResult(Solution("N-3", "12321312312312312", "200", 0)), "12321312312312313")
        assertEquals(solution.makeResult(Solution("N-3", "10564654654654650", "200", 0)), "10564654654654651")
    }

    @Test
    fun N4SolutionTest() {
        val solution = N4Solution()
        assertEquals(solution.makeResult(Solution("N-4", "1", "2", 0)), "3")
        assertEquals(solution.makeResult(Solution("N-4", "12321312312312312", "200", 0)), "12321312312312512")
        assertEquals(solution.makeResult(Solution("N-4", "10564654654654650", "200", 0)), "10564654654654850")
    }

    @Test
    fun N5SolutionTest() {
        val solution = N5Solution()
        assertEquals(solution.makeResult(Solution("N-5", "100", "100", 0)), "0")
        assertEquals(solution.makeResult(Solution("N-5", "12321312312312312", "200", 0)), "12321312312312112")
        assertEquals(solution.makeResult(Solution("N-5", "10564654654654650", "200", 0)), "10564654654654450")
    }

    @Test
    fun N6SolutionTest() {
        val solution = N6Solution()
        assertEquals(solution.makeResult(Solution("N-6", "100", "100", 1)), "100")
        assertEquals(solution.makeResult(Solution("N-6", "0", "200", 100)), "0")
        assertEquals(solution.makeResult(Solution("N-6", "10", "200", 10)), "100")
    }

    @Test
    fun N7SolutionTest() {
        val solution = N7Solution()
        assertEquals(solution.makeResult(Solution("N-7", "100", "100", 2)), "10000")
        assertEquals(solution.makeResult(Solution("N-7", "12321312312312312", "200", 1)), "123213123123123120")
        assertEquals(solution.makeResult(Solution("N-7", "0", "200", 3)), "0")
    }

    @Test
    fun N8SolutionTest() {
        val solution = N8Solution()
        assertEquals(solution.makeResult(Solution("N-8", "100", "100", 2)), "10000")
        assertEquals(solution.makeResult(Solution("N-8", "12321312312312312", "100", 1)), "1232131231231231200")
        assertEquals(solution.makeResult(Solution("N-8", "2", "2", 3)), "4")
    }

    @Test
    fun N9SolutionTest() {
        val solution = N9Solution()
        assertEquals(solution.makeResult(Solution("N-9", "100", "5", 2)), "90")
    }

    @Test
    fun N11SolutionTest() {
        val solution = N11Solution()
        assertEquals(solution.makeResult(Solution("N-11", "100", "10", 2)), "10")
    }

    @Test
    fun N12SolutionTest() {
        val solution = N12Solution()
        assertEquals(solution.makeResult(Solution("N-12", "5", "3", 2)), "2")
    }

    @Test
    fun N13SolutionTest() {
        val solution = N13Solution()
        assertEquals(solution.makeResult(Solution("N-13", "6", "3", 2)), "3")
    }

    @Test
    fun N14SolutionTest() {
        val solution = N14Solution()
        assertEquals(solution.makeResult(Solution("N-14", "5", "3", 2)), "15")
    }
}