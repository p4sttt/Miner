package com.kernel.miner.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

@Composable
fun MinerTheme(
	darkTheme: Boolean = isSystemInDarkTheme(),
	dynamicColor: Boolean = true,
	content: @Composable () -> Unit
) {
	MaterialTheme(
		colorScheme = darkColorScheme(
			background = White,
			onBackground = White10,
			primary = Dark
		),
		typography = Typography,
		content = content
	)
}