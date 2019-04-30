import controllers.solution.models.Solution
import managers.solution.pmodule.*
import org.junit.Assert.assertEquals
import org.junit.Test

/**
@author boolenull on 23.03.2019
 */

class PModuleTest {

    @Test
    fun P1SolutionTest() {
        val solution = P1Solution()
        assertEquals(solution.convertToNewFormat("1/1 0/1 0/1 0/1 0/1"), "1/1x^4")
        assertEquals(solution.makeResult(Solution("P-1", "3/1x 1/2", "1/2x^2 7/1x 1/2", 2)), "1/2x^2 10/1x 1/1")
        assertEquals(solution.makeResult(Solution("P-1", "1/2x^2 7/1x 1/2", "3/1x 1/2", 2)), "1/2x^2 10/1x 1/1")
        assertEquals(solution.makeResult(Solution("P-1", "4/1x^3 3/1x^2 2/1x 1/1", "1/1x^3 2/1x^2 3/1x 4/1", 0)), "5/1x^3 5/1x^2 5/1x 5/1")
        assertEquals(solution.makeResult(Solution("P-1", "1/2x^3 1/1", "1/1x^4 -1/2x^3 2/1x", 0)), "1/1x^4 2/1x 1/1")
        assertEquals(solution.makeResult(Solution("P-1", "0/1", "-1/1x", 0)), "-1/1x")
    }

    @Test
    fun P2SolutionTest() {
        val solution = P2Solution()
        assertEquals(solution.makeResult(Solution("P-2", "3/1x 1/2", "1/2x^2 7/1x 1/2", 2)), "-1/2x^2 -4/1x")
        assertEquals(solution.makeResult(Solution("P-2", "3/1x^3 2/1x 1/1", "3/1x^3 2/1x 1/1", 0)), "0/1")
        assertEquals(solution.makeResult(Solution("P-2", "2/4x^2 2/2x 2/1", "1/1x^2 1/1x 1/1", 0)), "-1/2x^2 1/1")
        assertEquals(solution.makeResult(Solution("P-2", "0/1", "-4/2x 4/1", 0)), "2/1x -4/1")
    }

    @Test
    fun P3SolutionTest() {
        val solution = P3Solution()
        assertEquals(solution.makeResult(Solution("P-3", "0/1", "1/1", 0)), "0/1")
        assertEquals(solution.makeResult(Solution("P-3", "3/4 4/3 1/12", "12/1", 0)), "9/1 16/1 1/1")
        assertEquals(solution.makeResult(Solution("P-3", "4/1 0/1 0/1 1/2", "2/1", 0)), "8/1 0/1 0/1 1/1")
    }

    @Test
    fun P4SolutionTest() {
        val solution = P4Solution()
        assertEquals(solution.makeResult(Solution("P-4", "0/1", "", 1)), "0/1 0/1")
        assertEquals(solution.makeResult(Solution("P-4", "1/1 2/1 3/1", "", 3)), "1/1 2/1 3/1 0/1 0/1 0/1")
        assertEquals(solution.makeResult(Solution("P-4", "1/2 1/3 1/4", "", 0)), "1/2 1/3 1/4")
    }

    @Test
    fun P5SolutionTest() {
        val solution = P5Solution()
        assertEquals(solution.makeResult(Solution("P-5", "1/1 2/1 1/1", "", 0)), "1/1")
        assertEquals(solution.makeResult(Solution("P-5", "9/99", "", 0)), "9/99")
        assertEquals(solution.makeResult(Solution("P-5", "0/4 1/4 2/4 3/4", "", 0)), "0/4")
    }

    @Test
    fun P6SolutionTest() {
        val solution = P6Solution()
        assertEquals(solution.makeResult(Solution("P-6", "1/1 2/2 3/3 4/4 5/5", "", 0)), "4")
        assertEquals(solution.makeResult(Solution("P-6", "20/1", "", 0)), "0")
        assertEquals(solution.makeResult(Solution("P-6", "0/4 1/4 2/4 3/4", "", 0)), "3")
    }

    @Test
    fun P7SolutionTest() {
        val solution = P7Solution()
        assertEquals(solution.makeResult(Solution("P-7", "1/1 2/1 3/1", "", 0)), "1/1")
    }

    @Test
    fun P8SolutionTest() {
        val solution = P8Solution()
        assertEquals(solution.makeResult(Solution("P-8", "1/2 3/2 9/2", "2/1", 0)), "1/1 3/1 9/1")
        //assertEquals(solution.makeResult(Solution("P-8", "1/1 3/1 9/1", "2/1 1/1", 0)), "1/1 3/1 9/1")
    }

    @Test
    fun P9SolutionTest() {
        val solution = P9Solution()
        assertEquals(solution.makeResult(Solution("P-9", "1/1 -12/1 0/1 -42/1", "1/1 -3/1", 0)), "1/1 -9/1 -27/1")
    }

    @Test
    fun P10SolutionTest() {
        val solution = P10Solution()
        assertEquals(solution.makeResult(Solution("P-10", "1/1 -12/1 0/1 -42/1", "1/1 -3/1", 0)), "-123/1")
    }

    @Test
    fun P11SolutionTest() {
        val solution = P11Solution()
        assertEquals(solution.makeResult(Solution("P-11", "1/1 2/1 1/1", "1/1 1/1", 0)), "1/1 1/1")
    }

    @Test
    fun P12SolutionTest() {
        val solution = P12Solution()
        assertEquals(solution.makeResult(Solution("P-12", "1/3 1/2 1/1 1/1", "", 0)), "1/1 1/1 1/1")
        assertEquals(solution.makeResult(Solution("P-12", "1/2 1/2 1/1 0/1", "", 0)), "3/2 1/1 1/1")
    }
}