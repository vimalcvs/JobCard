package com.vimalcvs.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.vimalcvs.myapplication.model.Organization
import com.vimalcvs.myapplication.model.organizations
import com.vimalcvs.myapplication.ui.theme.MyApplicationTheme
import com.vimalcvs.myapplication.ui.theme.backgroundSecondary
import com.vimalcvs.myapplication.ui.theme.blue
import com.vimalcvs.myapplication.ui.theme.border
import com.vimalcvs.myapplication.ui.theme.green
import com.vimalcvs.myapplication.ui.theme.red
import com.vimalcvs.myapplication.ui.theme.textHint
import com.vimalcvs.myapplication.ui.theme.textPrimary
import com.vimalcvs.myapplication.ui.theme.textSecondary
import com.vimalcvs.myapplication.ui.theme.textTertiary
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                MainScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val listState = rememberLazyListState()
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = backgroundSecondary,
        topBar = {
            TopAppBar(modifier = Modifier.fillMaxWidth(),
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.White,
                    titleContentColor = Color.Black,
                    navigationIconContentColor = Color.Black,
                    actionIconContentColor = Color.Black,
                ),
                title = {
                    Text(text = "Ktor")
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Outlined.Search, contentDescription = "More")
                    }
                })
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LazyColumn(
                state = listState,
            ) {
                items(organizations) { organization ->
                    OrganizationItem(organization = organization)
                }
            }
        }
    }
}

@Composable
fun OrganizationItem(organization: Organization) {
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 6.dp)
            .fillMaxWidth()
            .shadow(
                elevation = 4.dp,
                shape = RoundedCornerShape(14.dp),
                clip = false,
                ambientColor = blue,
                spotColor = blue
            ),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )

    ) {
        Spacer(modifier = Modifier.height(6.dp))
        Box(
            modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopEnd
        ) {
            Row(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(topStart = 76.dp, bottomStart = 76.dp))
                    .background(red.copy(alpha = 0.1f)),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(modifier = Modifier.width(6.dp))
                Icon(
                    Icons.Default.ShoppingCart,
                    contentDescription = null,
                    tint = red,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))

                Text(
                    modifier = Modifier.padding(start = 1.dp, end = 12.dp),
                    color = red,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.End,
                    text = organization.hiringType.uppercase(),
                )
            }

        }
        Column(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 2.dp, bottom = 8.dp)
                .fillMaxWidth()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(45.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .border(1.dp, border, shape = RoundedCornerShape(10.dp))
                ) {
                    Image(
                        painter = rememberAsyncImagePainter(model = organization.img),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(2.dp)
                            .clip(shape = RoundedCornerShape(8.dp))
                            .align(Alignment.Center)

                    )

                }
                Spacer(modifier = Modifier.width(16.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = organization.title,
                        color = textPrimary,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(1.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = organization.salary,
                            color = textPrimary,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = "/Month",
                            color = textPrimary,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(6.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Outlined.ShoppingCart,
                    contentDescription = null,
                    tint = textSecondary,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = organization.company,
                    color = textSecondary,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal
                )
            }


            Spacer(modifier = Modifier.height(2.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Outlined.LocationOn,
                    contentDescription = null,
                    tint = textSecondary,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = organization.location,
                    color = textSecondary,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal
                )
            }

            Spacer(modifier = Modifier.height(6.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(5.dp))
                        .background(green.copy(alpha = 0.1f))
                ) {
                    Text(
                        modifier = Modifier.padding(start = 8.dp, end = 8.dp),
                        text = organization.application,
                        fontSize = 12.sp,
                        color = green,
                        fontWeight = FontWeight.Bold
                    )
                }
                Spacer(modifier = Modifier.width(6.dp))
                Box(
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(5.dp))
                        .border(1.dp, border, shape = RoundedCornerShape(5.dp))
                ) {
                    Text(
                        modifier = Modifier.padding(start = 8.dp, end = 8.dp),
                        text = organization.skills[0],
                        color = textTertiary,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))
            HorizontalDivider(
                color = border,
                thickness = 1.dp,
            )
            Spacer(modifier = Modifier.height(6.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier.weight(1f),
                    text = "Insurance provided",
                    color = textTertiary,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Outlined.Star,
                        contentDescription = null,
                        tint = blue,
                        modifier = Modifier.size(14.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "Verified",
                        color = textHint,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold
                    )

                    VerticalDivider(
                        color = border,
                        thickness = 1.dp,
                        modifier = Modifier
                            .padding(horizontal = 2.dp)
                            .height(10.dp)
                    )
                    Text(
                        text = "Safe Job Hai",
                        color = textHint,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontStyle = FontStyle.Italic
                    )
                }
            }
        }
    }
}


@Preview
@Composable
fun MainScreenPreview() {
    MyApplicationTheme {
        OrganizationItem(organization = organizations[0])
    }
}