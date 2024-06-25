package com.example.jetpackselfstudy.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.jetpackselfstudy.R

//HelloWorld
/*@Composable
fun HelloWorld(name: String) {
    Text(text = "Hello $name")
}*/

//MyComposable
/*@Composable
fun MyComposable() {
    Column {
        Text(text = "Hello World")
    }
}*/

//ArtistCard
/*@Composable
fun ArtistCard() {
    Column {
        Text(text = "Alfred Sisley")
        Text(text = "3 minutes ago")
    }
}*/

//ArtistCardRow 이미지가 보이지 않는 이유?
/*@Composable
fun ArtistCardRow(
    artist: Artist
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(bitmap = artist.image, contentDescription = "Artist image")
        Column {
            Text(artist.name)
            Text(artist.lastSeenOnline)
        }
    }
}*/

// ArtistAvatar
/*@Composable
fun ArtistAvatar(artist: Artist) {
    Box {
        Image(
            bitmap = artist.image,
            contentDescription = null
        )
        Icon(
            Icons.Filled.Check,
            contentDescription = "Check mark"
        )
    }
}*/

//ArtistCardArrangement
/*@Composable
fun ArtistCardArrangement(artist: Artist) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.End
    ) {
        Image(bitmap = artist.image, contentDescription = "Artist image")
        Column {
            
        }
    }
}*/

// SearchResult
@Composable
fun SearchResult() {
    Row {
        Image(
            painter = rememberImagePainter("https://search.pstatic.net/sunny/?src=https%3A%2F%2Fi.pinimg.com%2F736x%2F1d%2F0f%2F4a%2F1d0f4a8bea85da5580ce4adbd7941c78.jpg&type=a340"),
            contentDescription = "Online Dog Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.Crop
        )
        Column {
            Text(
                text = "Hello"
            )
            Text(
                text = "World!!"
            )
        }
    }
}

class Artist {
    val image: ImageBitmap = ImageBitmap(100, 100)
    val name = ""
    val lastSeenOnline = ""
}

/*@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier
            .padding(24.dp)
            .fillMaxWidth()
    ) {
        Text(text = "Hello, ")
        Text(text = "$name")
    }
}*/

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    /* 레이아웃 기본사항
    HelloWorld("ParkJooHo")
    MyComposable()
    ArtistCard()
    ArtistCardRow(artist = Artist())
    ArtistAvatar(artist = Artist())
    ArtistCardArrangement(artist = Artist())
    */
    SearchResult()

    //수정자
    /*Greeting(name = "ParkJooHo")*/


}
