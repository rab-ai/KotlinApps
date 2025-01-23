package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
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
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard(
                        name = stringResource(R.string.name_for_card),
                        title = stringResource(R.string.context),
                        phone = stringResource(R.string.phone_number),
                        profileImage = R.drawable.android_logo,
                        contactIcon = R.drawable.call
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(
    name: String,
    title: String,
    phone: String,
    profileImage: Int,
    contactIcon: Int,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.primaryContainer),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.weight(1.2f))
        ProfileImage(imageRes = profileImage)

        Text(
            text = name,
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onPrimaryContainer
        )

        Text(
            text = title,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onPrimaryContainer
        )

        Spacer(modifier = Modifier.weight(1f))

        ContactInfo(phone = phone, iconRes = contactIcon)
        Spacer(modifier = Modifier.weight(0.2f))
    }
}

@Composable
fun ProfileImage(imageRes: Int, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = imageRes),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .size(100.dp)
            .background(MaterialTheme.colorScheme.secondary, shape = MaterialTheme.shapes.medium)
            .padding(8.dp)
    )
}

@Composable
fun ContactInfo(phone: String, iconRes: Int, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = iconRes),
            contentDescription = null,
            tint = MaterialTheme.colorScheme.primary
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = phone,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onPrimaryContainer
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard(
            name = "John Doe",
            title = "Android Developer",
            phone = stringResource(R.string.phone_number),
            profileImage = R.drawable.android_logo,
            contactIcon = R.drawable.call
        )
    }
}
