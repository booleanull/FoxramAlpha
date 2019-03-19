package solution.nmodule

import javafx.util.converter.BigIntegerStringConverter
import java.math.BigInteger

/**
@author boolenull on 19.03.2019
 */

class Natural(var value: BigInteger) {

    constructor(value: String): this(BigIntegerStringConverter().fromString(value))
}