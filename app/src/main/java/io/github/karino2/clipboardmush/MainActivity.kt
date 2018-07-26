package io.github.karino2.clipboardmush

import android.app.Activity
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.content.Intent



class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val result = clipboard.primaryClip?.getItemAt(0)?.coerceToText(this)?: ""

        val data = Intent()
        data.putExtra("replace_key", result)
        setResult(Activity.RESULT_OK, data)

        finish()


    }
}
