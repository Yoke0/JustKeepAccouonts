package com.yoke.justkeepaccounts.commom.utils

import android.content.Context
import android.graphics.Bitmap
import android.os.Environment
import android.util.Log
import java.io.File
import java.io.FileOutputStream

class FileUtils {

    companion object {

        private const val TAG = "FileUtils"

        fun getImage(context: Context, name: String): File {
            val file = File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), name)
            if (!file.mkdirs()) {
                Log.e(TAG, "The picture with the name $name image does not exist!")
            }
            return file
        }

        fun saveImage(context: Context, name: String, bitmap: Bitmap): Boolean {
            return try {
                val file = File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), name)
                val fos = FileOutputStream(file)
                if (bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fos)) {
                    fos.flush()
                    fos.close()
                }

                true
            } catch (e: Exception) {
                Log.e(TAG, e.message.toString())
                false
            }
        }
    }
}