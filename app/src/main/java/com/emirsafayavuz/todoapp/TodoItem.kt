package com.emirsafayavuz.todoapp

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.emirsafayavuz.todoapp.ui.theme.TodoAppTheme

@Composable
fun TodoItem() {
    var isChecked by remember { mutableStateOf(false) }

    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(checked = isChecked, onCheckedChange = {
            isChecked = it
        })
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = "Todo Item",
            textDecoration = if (isChecked) TextDecoration.combine(
                listOf(
                    TextDecoration.LineThrough,
                    TextDecoration.Underline
                )
            ) else TextDecoration.None
        )
    }
}

@Composable
@Preview
fun TodoItemPreview() {
    TodoAppTheme {
        TodoItem()
    }
}
