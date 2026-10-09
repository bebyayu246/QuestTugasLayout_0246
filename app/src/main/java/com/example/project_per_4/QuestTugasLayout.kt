package com.example.project_per_4

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import java.lang.reflect.Modifier

data class ProfileData(
    val nameRes: Int,
    val phoneRes: Int?,
    val detailRes: Int,
    val bgColorRes: Int,
    val nameColorRes: Int
)

@Composable
fun MainScreen(fillMaxSize: Unit.() -> androidx.compose.ui.Modifier) {
    val profiles = listOf(
        ProfileData(R.string.name_beby, R.string.phone_beby, R.string.detail_beby, R.color.card_pink, R.color.text_dark),
        ProfileData(R.string.name_nurul, R.string.phone_nurul, R.string.detail_nurul, R.color.card_coklat, R.color.text_dark),
        ProfileData(R.string.name_rara, R.string.phone_rara, R.string.detail_rara, R.color.card_blue, R.color.text_dark),
        ProfileData(R.string.name_putri, R.string.phone_putri, R.string.detail_putri, R.color.card_purple, R.color.text_dark)
    )

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {}
}
