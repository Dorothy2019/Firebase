package hu.bme.aut.android.bmeforumQBV1MO.extension

import android.widget.EditText

fun EditText.validateNonEmpty(): Boolean {
    if (text.isEmpty()) {
        error = "Required"
        return false
    }
    return true
}