import controllers.solution.models.Solution
import managers.solution.zmodule.*
import org.junit.Assert.assertEquals
import org.junit.Test

/**
@author boolenull on 23.03.2019
 */

class ZModuleTest {

    @Test
    fun Z1SolutionTest() {
        val solution = Z1Solution()
        assertEquals(solution.makeResult(Solution("Z-1", "-100", "3", 2)), "100")
    }

    @Test
    fun Z2SolutionTest() {
        val solution = Z2Solution()
        assertEquals(solution.makeResult(Solution("Z-2", "-100", "3", 2)), "1")
    }

    @Test
    fun Z3SolutionTest() {
        val solution = Z3Solution()
        assertEquals(solution.makeResult(Solution("Z-3", "-100", "3", 2)), "100")
    }

    @Test
    fun Z4SolutionTest() {
        val solution = Z4Solution()
        assertEquals(solution.makeResult(Solution("Z-4", "100", "3", 2)), "100")
    }

    @Test
    fun Z5SolutionTest() {
        val solution = Z5Solution()
        assertEquals(solution.makeResult(Solution("Z-5", "100", "3", 2)), "100")
    }

    @Test
    fun Z6SolutionTest() {
        val solution = Z6Solution()
        assertEquals(solution.makeResult(Solution("Z-6", "-100", "3", 2)), "-97")
    }

    @Test
    fun Z7SolutionTest() {
        val solution = Z7Solution()
        assertEquals(solution.makeResult(Solution("Z-7", "-100", "3", 2)), "-103")
    }

    @Test
    fun Z8SolutionTest() {
        val solution = Z8Solution()
        assertEquals(solution.makeResult(Solution("Z-8", "-10", "3", 2)), "-30")
    }

    @Test
    fun Z9SolutionTest() {
        val solution = Z9Solution()
        assertEquals(solution.makeResult(Solution("Z-9", "-10", "3", 2)), "-3")
    }

    @Test
    fun Z10SolutionTest() {
        val solution = Z10Solution()
        assertEquals(solution.makeResult(Solution("Z-10", "-10", "3", 2)), "-1")
    }
}