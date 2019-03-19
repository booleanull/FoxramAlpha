package solution.nmodule

import java.math.BigInteger

/**
@author boolenull on 19.03.2019
 */

class Natural(var value: BigInteger) {

    constructor(value: String): this(BigInteger(value))
}