package com.emirsafayavuz.todoapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.emirsafayavuz.todoapp.ui.theme.TodoAppTheme

@Composable
fun TodoScreen() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        TodoInputField()
        Spacer(modifier = Modifier.padding(8.dp))
        TodoItem()
        Spacer(modifier = Modifier.padding(16.dp))
        AddButton()
    }
}

@Preview(showBackground = true)
@Composable
fun TodoScreenPreview() {
    TodoAppTheme {
        TodoScreen()
    }
}