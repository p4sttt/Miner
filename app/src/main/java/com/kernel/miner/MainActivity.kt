package com.kernel.miner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kernel.miner.ui.theme.MinerTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			MinerTheme {
				Surface(
					modifier = Modifier.fillMaxSize(),
					color = MaterialTheme.colorScheme.background
				) {
					Column(
						modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp),
						verticalArrangement = Arrangement.Top,
						horizontalAlignment = Alignment.Start
					) {
						SearchBar()
					}
				}
			}
		}
	}
}


@Composable
fun SearchBar(){
	Row(
		horizontalArrangement = Arrangement.SpaceBetween,
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier
			.background(color = Color(0xFFF2F2F2), shape = RoundedCornerShape(size = 999.dp))
			.padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
			.fillMaxWidth()
	) {
		Text(
			text = "Enter tracking number...",
			style = TextStyle(
				fontSize = 16.sp,
				fontWeight = FontWeight(400),
				color = Color(0x8F000000),
			),

			)
		Image(
			painter = painterResource(id = R.drawable.search_outline),
			contentDescription = "search description"
		)
	}
}
