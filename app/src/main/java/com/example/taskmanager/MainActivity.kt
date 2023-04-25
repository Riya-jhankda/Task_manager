package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TaskApp(text1 = stringResource(R.string.task_done),text2= stringResource(R.string.noti))
                }
            }
        }
    }
}

@Composable
fun TaskApp(text1:String,text2:String,modifier: Modifier=Modifier){
    val img = painterResource(R.drawable.task_completed)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement =  Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
       Image(painter = img, contentDescription = null)
        Text(
            text = text1,
            fontSize = 24.sp,
            fontWeight= FontWeight.Bold,modifier= Modifier
                .padding(top = 24.dp, start = 8.dp,)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text=text2,
            fontSize = 16.sp)}
}
@Preview(showBackground = true)
@Composable
fun ManagerPreview() {
    TaskManagerTheme {
        TaskApp(text1 = stringResource(R.string.task_done),text2= stringResource(R.string.noti))

    }
}