package com.yoke.justkeepaccounts.ui.icon

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.vector.ImageVector
import com.yoke.justkeepaccounts.R

object MyIcons {
    val Bill = R.drawable.ic_bill
    val Chart = R.drawable.ic_chart
    val Gallery = R.drawable.ic_picture
    val Mine = R.drawable.ic_mine
}

sealed class Icon {
    data class ImageVectorIcon(val imageVector: ImageVector) : Icon()
    data class DrawableResourceIcon(@DrawableRes val id: Int) : Icon()
}