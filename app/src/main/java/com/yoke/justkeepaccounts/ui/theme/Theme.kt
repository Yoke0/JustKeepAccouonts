package com.yoke.justkeepaccounts.ui.theme

import android.os.Build
import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.yoke.justkeepaccounts.ui.theme.*
import com.yoke.justkeepaccounts.ui.theme.Blue10
import com.yoke.justkeepaccounts.ui.theme.Blue20
import com.yoke.justkeepaccounts.ui.theme.Blue30
import com.yoke.justkeepaccounts.ui.theme.Blue40
import com.yoke.justkeepaccounts.ui.theme.Blue80
import com.yoke.justkeepaccounts.ui.theme.Blue90
import com.yoke.justkeepaccounts.ui.theme.Blue95
import com.yoke.justkeepaccounts.ui.theme.DarkGreen10
import com.yoke.justkeepaccounts.ui.theme.DarkGreen20
import com.yoke.justkeepaccounts.ui.theme.DarkGreen30
import com.yoke.justkeepaccounts.ui.theme.DarkGreen40
import com.yoke.justkeepaccounts.ui.theme.DarkGreen80
import com.yoke.justkeepaccounts.ui.theme.DarkGreen90
import com.yoke.justkeepaccounts.ui.theme.DarkGreenGray10
import com.yoke.justkeepaccounts.ui.theme.DarkGreenGray90
import com.yoke.justkeepaccounts.ui.theme.DarkGreenGray95
import com.yoke.justkeepaccounts.ui.theme.DarkGreenGray99
import com.yoke.justkeepaccounts.ui.theme.DarkPurpleGray10
import com.yoke.justkeepaccounts.ui.theme.DarkPurpleGray90
import com.yoke.justkeepaccounts.ui.theme.DarkPurpleGray95
import com.yoke.justkeepaccounts.ui.theme.DarkPurpleGray99
import com.yoke.justkeepaccounts.ui.theme.Green10
import com.yoke.justkeepaccounts.ui.theme.Green20
import com.yoke.justkeepaccounts.ui.theme.Green30
import com.yoke.justkeepaccounts.ui.theme.Green40
import com.yoke.justkeepaccounts.ui.theme.Green80
import com.yoke.justkeepaccounts.ui.theme.Green90
import com.yoke.justkeepaccounts.ui.theme.GreenGray30
import com.yoke.justkeepaccounts.ui.theme.GreenGray50
import com.yoke.justkeepaccounts.ui.theme.GreenGray60
import com.yoke.justkeepaccounts.ui.theme.GreenGray80
import com.yoke.justkeepaccounts.ui.theme.GreenGray90
import com.yoke.justkeepaccounts.ui.theme.Orange10
import com.yoke.justkeepaccounts.ui.theme.Orange20
import com.yoke.justkeepaccounts.ui.theme.Orange30
import com.yoke.justkeepaccounts.ui.theme.Orange40
import com.yoke.justkeepaccounts.ui.theme.Orange80
import com.yoke.justkeepaccounts.ui.theme.Orange90
import com.yoke.justkeepaccounts.ui.theme.Orange95
import com.yoke.justkeepaccounts.ui.theme.Purple10
import com.yoke.justkeepaccounts.ui.theme.Purple20
import com.yoke.justkeepaccounts.ui.theme.Purple30
import com.yoke.justkeepaccounts.ui.theme.Purple40
import com.yoke.justkeepaccounts.ui.theme.Purple80
import com.yoke.justkeepaccounts.ui.theme.Purple90
import com.yoke.justkeepaccounts.ui.theme.Purple95
import com.yoke.justkeepaccounts.ui.theme.PurpleGray30
import com.yoke.justkeepaccounts.ui.theme.PurpleGray50
import com.yoke.justkeepaccounts.ui.theme.PurpleGray60
import com.yoke.justkeepaccounts.ui.theme.PurpleGray80
import com.yoke.justkeepaccounts.ui.theme.PurpleGray90
import com.yoke.justkeepaccounts.ui.theme.Red10
import com.yoke.justkeepaccounts.ui.theme.Red20
import com.yoke.justkeepaccounts.ui.theme.Red30
import com.yoke.justkeepaccounts.ui.theme.Red40
import com.yoke.justkeepaccounts.ui.theme.Red80
import com.yoke.justkeepaccounts.ui.theme.Red90
import com.yoke.justkeepaccounts.ui.theme.Teal10
import com.yoke.justkeepaccounts.ui.theme.Teal20
import com.yoke.justkeepaccounts.ui.theme.Teal30
import com.yoke.justkeepaccounts.ui.theme.Teal40
import com.yoke.justkeepaccounts.ui.theme.Teal80
import com.yoke.justkeepaccounts.ui.theme.Teal90

@VisibleForTesting
val LightDefaultColorScheme = lightColorScheme(
    primary = Purple40,
    onPrimary = Color.White,
    primaryContainer = Purple90,
    onPrimaryContainer = Purple10,
    secondary = Orange40,
    onSecondary = Color.White,
    secondaryContainer = Orange90,
    onSecondaryContainer = Orange10,
    tertiary = Blue40,
    onTertiary = Color.White,
    tertiaryContainer = Blue90,
    onTertiaryContainer = Blue10,
    error = Red40,
    onError = Color.White,
    errorContainer = Red90,
    onErrorContainer = Red10,
    background = DarkPurpleGray99,
    onBackground = DarkPurpleGray10,
    surface = DarkPurpleGray99,
    onSurface = DarkPurpleGray10,
    surfaceVariant = PurpleGray90,
    onSurfaceVariant = PurpleGray30,
    outline = PurpleGray50
)

/**
 * Dark default theme color scheme
 */
@VisibleForTesting
val DarkDefaultColorScheme = darkColorScheme(
    primary = Purple80,
    onPrimary = Purple20,
    primaryContainer = Purple30,
    onPrimaryContainer = Purple90,
    secondary = Orange80,
    onSecondary = Orange20,
    secondaryContainer = Orange30,
    onSecondaryContainer = Orange90,
    tertiary = Blue80,
    onTertiary = Blue20,
    tertiaryContainer = Blue30,
    onTertiaryContainer = Blue90,
    error = Red80,
    onError = Red20,
    errorContainer = Red30,
    onErrorContainer = Red90,
    background = DarkPurpleGray10,
    onBackground = DarkPurpleGray90,
    surface = DarkPurpleGray10,
    onSurface = DarkPurpleGray90,
    surfaceVariant = PurpleGray30,
    onSurfaceVariant = PurpleGray80,
    outline = PurpleGray60
)

/**
 * Light Android theme color scheme
 */
@VisibleForTesting
val LightAndroidColorScheme = lightColorScheme(
    primary = Green40,
    onPrimary = Color.White,
    primaryContainer = Green90,
    onPrimaryContainer = Green10,
    secondary = DarkGreen40,
    onSecondary = Color.White,
    secondaryContainer = DarkGreen90,
    onSecondaryContainer = DarkGreen10,
    tertiary = Teal40,
    onTertiary = Color.White,
    tertiaryContainer = Teal90,
    onTertiaryContainer = Teal10,
    error = Red40,
    onError = Color.White,
    errorContainer = Red90,
    onErrorContainer = Red10,
    background = DarkGreenGray99,
    onBackground = DarkGreenGray10,
    surface = DarkGreenGray99,
    onSurface = DarkGreenGray10,
    surfaceVariant = GreenGray90,
    onSurfaceVariant = GreenGray30,
    outline = GreenGray50
)

/**
 * Dark Android theme color scheme
 */
@VisibleForTesting
val DarkAndroidColorScheme = darkColorScheme(
    primary = Green80,
    onPrimary = Green20,
    primaryContainer = Green30,
    onPrimaryContainer = Green90,
    secondary = DarkGreen80,
    onSecondary = DarkGreen20,
    secondaryContainer = DarkGreen30,
    onSecondaryContainer = DarkGreen90,
    tertiary = Teal80,
    onTertiary = Teal20,
    tertiaryContainer = Teal30,
    onTertiaryContainer = Teal90,
    error = Red80,
    onError = Red20,
    errorContainer = Red30,
    onErrorContainer = Red90,
    background = DarkGreenGray10,
    onBackground = DarkGreenGray90,
    surface = DarkGreenGray10,
    onSurface = DarkGreenGray90,
    surfaceVariant = GreenGray30,
    onSurfaceVariant = GreenGray80,
    outline = GreenGray60
)

/**
 * Light default gradient colors
 */
val LightDefaultGradientColors = GradientColors(
    primary = Purple95,
    secondary = Orange95,
    tertiary = Blue95,
    neutral = DarkPurpleGray95
)

/**
 * Light Android background theme
 */
val LightAndroidBackgroundTheme = BackgroundTheme(color = DarkGreenGray95)

/**
 * Dark Android background theme
 */
val DarkAndroidBackgroundTheme = BackgroundTheme(color = Color.Black)

/**
 * Now in Android theme.
 *
 * The order of precedence for the color scheme is: Dynamic color > Android theme > Default theme.
 * Dark theme is independent as all the aforementioned color schemes have light and dark versions.
 * The default theme color scheme is used by default.
 *
 * @param darkTheme Whether the theme should use a dark color scheme (follows system by default).
 * @param dynamicColor Whether the theme should use a dynamic color scheme (Android 12+ only).
 * @param androidTheme Whether the theme should use the Android theme color scheme.
 */
@Composable
fun MyTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    androidTheme: Boolean = false,
    content: @Composable() () -> Unit
) {
    val colorScheme = when {
        dynamicColor -> {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                val context = LocalContext.current
                if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
            } else {
                if (darkTheme) DarkDefaultColorScheme else LightDefaultColorScheme
            }
        }
        androidTheme -> if (darkTheme) DarkAndroidColorScheme else LightAndroidColorScheme
        else -> if (darkTheme) DarkDefaultColorScheme else LightDefaultColorScheme
    }

    val defaultGradientColors = GradientColors()
    val gradientColors = when {
        dynamicColor -> {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                defaultGradientColors
            } else {
                if (darkTheme) defaultGradientColors else LightDefaultGradientColors
            }
        }
        androidTheme -> defaultGradientColors
        else -> if (darkTheme) defaultGradientColors else LightDefaultGradientColors
    }

    val defaultBackgroundTheme = BackgroundTheme(
        color = colorScheme.surface,
        tonalElevation = 2.dp
    )
    val backgroundTheme = when {
        dynamicColor -> defaultBackgroundTheme
        androidTheme -> if (darkTheme) DarkAndroidBackgroundTheme else LightAndroidBackgroundTheme
        else -> defaultBackgroundTheme
    }

    CompositionLocalProvider(
        LocalGradientColors provides gradientColors,
        LocalBackgroundTheme provides backgroundTheme
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = MyTypography,
            content = content
        )
    }
}
