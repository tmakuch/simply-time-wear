package dev.makuch.simplyTime.data.watchface

import android.content.Context
import androidx.annotation.DrawableRes
import androidx.wear.watchface.complications.rendering.ComplicationDrawable
import dev.makuch.simplyTime.R

data class WatchFaceColorPalette(
    val backgroundColor: Int,
    val activeFrontendColor: Int,
    val ambientFrontendColor: Int,
    @DrawableRes val complicationStyleDrawableId: Int,
) {
    companion object {
        fun getWatchFaceColorPalette(
            context: Context,
        ): WatchFaceColorPalette {
            return WatchFaceColorPalette(
                backgroundColor = context.getColor(R.color.background_color),
                activeFrontendColor = context.getColor(R.color.white_primary_color),
                ambientFrontendColor = context.getColor(R.color.ambient_primary_color),

                complicationStyleDrawableId = R.drawable.complication_white_style,
            )
        }
    }
}
