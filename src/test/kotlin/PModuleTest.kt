import controllers.solution.models.Solution
import managers.solution.pmodule.P17Solution
import org.junit.Assert.assertEquals
import org.junit.Test

/**
@author boolenull on 23.03.2019
 */

class PModuleTest {

    @Test
    fun P15SolutionTest() {
        val solution = P17Solution()
        //assertEquals(solution.convertToOlderFormat("x^10 + 1/2x^9"), 1)
        //assertEquals(solution.convertToNewFormat("1/1 1/2 0/1 0/1 0/1 0/1 0/1 0/1 0/1 0/1 0/1"), 1)
        //assertEquals(solution.makeResult(Solution("P-11", "2", "5", "4", 0)), "")
        //assertEquals(solution.convertToNewFormat("5/6"), "1/1 1/2")
        assertEquals(solution.makeResult(Solution("P-17", "5;1;2", "x+2;x;x+1", "x^2-2x+1", 0)), "")
        //assertEquals(solution.makeResult(Solution("P-17", "x^2", "x", "x^2-2x+1", 0)), "")
    }
}