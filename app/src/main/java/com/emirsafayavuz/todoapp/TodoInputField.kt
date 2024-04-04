package com.emirsafayavuz.todoapp

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.emirsafayavuz.todoapp.ui.theme.TodoAppTheme

@Composable
fun TodoInputField() {
    TextField(
        modifier = Modifier.fillMaxWidth(),
        value = "",
        onValueChange = { },
        label = { Text("Enter a task") },
        singleLine = true,
    )
}

@Composable
@Preview
fun TodoInputFieldPreview() {
    TodoAppTheme {
        TodoInputField()
    }
}
