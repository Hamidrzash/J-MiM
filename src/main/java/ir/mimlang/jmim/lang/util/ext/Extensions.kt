package ir.mimlang.jmim.lang.util.ext

fun Int.toCharOrNull(): Char? = if (this != -1) this.toChar() else null

operator fun Regex.contains(char: Char?): Boolean = matches(char.toString())

fun Char.builder(): StringBuilder = StringBuilder(this.toString())

infix fun <T> T.equals(other: T): Boolean = this == other

inline infix fun Boolean.then(block: () -> Unit) {
	if (this) block()
}
