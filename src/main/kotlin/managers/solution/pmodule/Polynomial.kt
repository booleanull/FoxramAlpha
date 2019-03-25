package managers.solution.pmodule

import java.math.BigInteger

/**
@author boolenull on 25.03.2019
 */

class Polynomial(var value: BigInteger) {

    constructor(value: String): this(BigInteger(value))
}