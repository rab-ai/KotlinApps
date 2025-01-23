package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color =MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}
/*
@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
    val icon = painterResource(R.drawable.call)
    Column(modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFB7EEb7)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(80.dp)
                .background(color = Color(0xFF006161))
                .padding(top = 10.dp, bottom = 10.dp, start = 10.dp, end = 10.dp)
        )
        Text(
            text = stringResource(R.string.name_for_card),
            modifier = Modifier,
            fontSize = 24.sp
        )
        Text(
            text = stringResource(R.string.context),
            modifier = Modifier,
            fontSize = 12.sp,
            color = Color(0xFF008b8b),
            fontWeight = FontWeight.Bold
        )
        //Spacer(Modifier.weight(1f))
        Text(
            text = stringResource(R.string.name_for_card),
            modifier = Modifier,
            fontSize = 12.sp
        )
        /*
        Row{
            Icon(
                painter = icon,
                contentDescription = null,
                modifier = Modifier
                    .size(15.dp)
                    .padding(vertical = 2.dp)
            )
            Text(
                text = stringResource(R.string.name_for_card),
                modifier = Modifier,
                fontSize = 12.sp
            )
        }*/

    }
}*/
@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
    val icon = painterResource(R.drawable.call)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFB7EEb7)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.weight(1.2f))

        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(80.dp)
                .background(color = Color(0xFF006161))
                .padding(10.dp)
        )

        Text(
            text = stringResource(R.string.name_for_card),
            fontSize = 24.sp
        )

        Text(
            text = stringResource(R.string.context),
            fontSize = 12.sp,
            color = Color(0xFF008b8b),
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.weight(1f))

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                painter = icon,
                contentDescription = null,
                modifier = Modifier
                    .size(15.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = stringResource(R.string.name_for_card),
                modifier = Modifier,
                fontSize = 15.sp
            )
        }
        Spacer(modifier = Modifier.weight(0.2f))
    }
}



@Preview(
    showBackground = true
)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}