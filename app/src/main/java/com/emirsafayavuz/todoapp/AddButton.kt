package com.emirsafayavuz.todoapp

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AddButton() {
    Button(onClick = { /*TODO*/ }) {
        Text("Add")
    }
}

@Composable
@Preview
fun AddButtonPreview() {
    AddButton()
}