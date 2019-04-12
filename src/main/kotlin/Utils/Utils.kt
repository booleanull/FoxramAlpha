package Utils

fun <T> List<T>.toStringList(): String {
    return this.toString()
            .replace("[", "")
            .replace("]", "")
            .replace(",", "")
}