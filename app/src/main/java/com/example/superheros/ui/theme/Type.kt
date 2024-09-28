package com.example.superheros.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.googlefonts.Font
import com.example.superheros.R

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)


val displayFontFamily = FontFamily(
    Font(
        googleFont = GoogleFont("Cabin"),
        fontProvider = provider,
    )
)

// Default Material 3 typography values
val baseline = Typography()

val AppTypography = Typography(
    bodyLarge = TextStyle(
        fontFamily = displayFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    displayLarge = TextStyle(
        fontFamily = displayFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp
    ),
    displayMedium = TextStyle(
        fontFamily = displayFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    displaySmall = TextStyle(
        fontFamily = displayFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    )
)

