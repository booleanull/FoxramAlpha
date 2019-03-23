package managers.solution.zmodule

import java.math.BigInteger

/**
@author boolenull on 21.03.2019
 */

class Whole(var value: BigInteger) {

    constructor(value: String): this(BigInteger(value))
}