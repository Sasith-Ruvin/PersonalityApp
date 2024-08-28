package com.example.personality

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.personality.Data.DataSource
import com.example.personality.model.Personality
import com.example.personality.ui.theme.PersonalityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PersonalityApp()
        }
    }
}
@Composable
fun PersonalityCard(picture:Personality, modifier: Modifier = Modifier){
    Card(modifier = modifier) {
        Column {
            Text(text = stringResource(picture.stringResourceId),
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(15.dp).fillMaxWidth()
            )
            Image(painter = painterResource(picture.imageResourceId),
                contentDescription = stringResource(picture.stringResourceId),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(130.dp)
            )
            Text(text = stringResource(picture.descriptionResourceId),
                fontSize = 20.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(12.dp).fillMaxWidth()
            )


        }

    }
}

@Composable
fun PersonalityList(personalityList: List<Personality>, modifier: Modifier = Modifier){
    LazyColumn (modifier = modifier) {
        items(personalityList){ personality-> PersonalityCard(picture = personality, modifier = Modifier.padding(10.dp))
        }
    }
}

@Composable
fun PersonalityApp(){
    PersonalityList(personalityList = DataSource().loadPersonality())
}
