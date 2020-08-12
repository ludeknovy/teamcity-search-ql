package jetbrains.buildServer.server.querylang.autocompl

import jetbrains.buildServer.server.querylang.ast_old.FilterTypeRegistration

internal fun String.escape(): String {
    if (this.startsWith("\"") && this.endsWith("\"")) {
        return this
    }
    val str = if (this.startsWith("\"")) this.drop(1) else this
    if (FilterTypeRegistration.isKeyWord(str)) {
        return "\"" + str + "\""
    }
    if (str.all {it.isLetter() || it.isDigit() || it in "_.-"}) {
        return str
    }
    else {
        return "\"$str\""
    }
}

internal fun String.removeQuotationMarks(): String {
    var res = this
    if (res.startsWith('\"')) {
        res = res.drop(1)
    }
    if (res.endsWith('\"')) {
        res = res.dropLast(1)
    }
    return res
}