package com.soywiz.korui.native.util

import com.soywiz.korim.awt.*
import com.soywiz.korim.bitmap.*
import javax.swing.*

fun Bitmap.toAwtIcon() = javax.swing.ImageIcon(this.toAwt())
