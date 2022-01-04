package com.educationperfect.pds_library.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.educationperfect.pds_library.ui.*

/**
 * Created by george on 25/08/2021
 */

enum class EdsTagType(val textColor: Color, val backgroundColor: Color) {
    Basic(Neutral800, Neutral200),
    Alert(Red500, Red300)
}

@Composable
fun EdsTag(
    title: String,
    type: EdsTagType = EdsTagType.Basic
) {
    Text(text = title,
        style = MaterialTheme.typography.body2,
        color = type.textColor,
        modifier = Modifier
            .background(
                color = type.backgroundColor,
                shape = RoundedCornerShape(3.dp)
            )
            .padding(horizontal = 8.dp, vertical = 2.dp)
    )
}
