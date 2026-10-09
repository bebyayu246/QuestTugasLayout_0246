package com.example.project_per_4

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_umy),
            contentDescription = stringResource(id = R.string.desc_bg_logo),
            modifier = androidx.compose.ui.Modifier.size(280.dp),
            alpha = 0.15f
        )
        Column(
            modifier = androidx.compose.ui.Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(id = R.string.title_tekinfo),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(id = R.string.subtitle_umy),
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = androidx.compose.ui.Modifier.height(24.dp))

            LazyColumn(
                modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                items(profiles) { profile ->
                    ProfileCard(profile)
                }
            }
            Spacer(modifier = androidx.compose.ui.Modifier.height(24.dp))

            Text(
                text = stringResource(id = R.string.copyright_text),
                fontSize = 12.sp,
                modifier = androidx.compose.ui.Modifier.padding(vertical = 8.dp)
            )
        }
    }
}

@Composable
fun ProfileCard(profile: ProfileData) {
    // Komponen Card
    Card(
        modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = colorResource(id = profile.bgColorRes))
    ) {
        Row(
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // Gambar Logo Kiri
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = stringResource(id = R.string.desc_left_logo),
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(48.dp)
            )

            // Gambar Logo Kanan
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = stringResource(id = R.string.desc_right_logo),
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(48.dp)
            )
        }
    }
}

