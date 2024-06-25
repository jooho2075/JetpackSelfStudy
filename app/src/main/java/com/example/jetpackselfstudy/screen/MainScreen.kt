package com.example.jetpackselfstudy.screen

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

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

@Composable
fun ArtistCardArrangement(artist: Artist) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.End
    ) {
        Image(bitmap = artist.image, contentDescription = "Artist image")
        Column {
            
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
    */
    ArtistCardArrangement(artist = Artist())
    //수정자
    /*Greeting(name = "ParkJooHo")*/


}
