package com.example.pertemuan_4

import androidx.activity.result.ActivityResultCaller
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActivitasPertama(modifier: modifier) {
    Column(
        modiifier = Modifier.padding(top = 100.dp)
            .fillMaxSizee(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text (
            stringResource(R.string.Prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            stringResource(R.string.univ),
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(25.dp))
        Card(

        )
    }
}