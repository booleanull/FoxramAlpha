import controllers.solution.models.Solution
import managers.solution.qmodule.*
import org.junit.Assert.assertEquals
import org.junit.Test

/**
@author boolenull on 23.03.2019
 */

class QModuleTest {

    @Test
    fun Q1SolutionTest() {
        val solution = Q1Solution()
        assertEquals(solution.makeResult(Solution("Q-1", "2/4", "3", 2)), "1/2")
    }

    @Test
    fun Q2SolutionTest() {
        val solution = Q2Solution()
        assertEquals(solution.makeResult(Solution("Q-2", "-100", "3", 2)), "да")
    }

    @Test
    fun Q3SolutionTest() {
        val solution = Q3Solution()
        assertEquals(solution.makeResult(Solution("Q-3", "-100", "3", 2)), "-100/1")
    }

    @Test
    fun Q4SolutionTest() {
        val solution = Q4Solution()
        assertEquals(solution.makeResult(Solution("Q-4", "100/1", "3", 2)), "100")
    }

    @Test
    fun Q5SolutionTest() {
        val solution = Q5Solution()
        assertEquals(solution.makeResult(Solution("Q-5", "1/2", "1/2", 2)), "1")
    }

    @Test
    fun Q6SolutionTest() {
        val solution = Q6Solution()
        assertEquals(solution.makeResult(Solution("Q-6", "1/2", "1/3", 2)), "1/6")
    }

    @Test
    fun Q7SolutionTest() {
        val solution = Q7Solution()
        assertEquals(solution.makeResult(Solution("Q-7", "1/2", "1/2", 2)), "1/4")
    }

    @Test
    fun Q8SolutionTest() {
        val solution = Q8Solution()
        assertEquals(solution.makeResult(Solution("Q-8", "1/3", "1/2", 2)), "2/3")
    }
}