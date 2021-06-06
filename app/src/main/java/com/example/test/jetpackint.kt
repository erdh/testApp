package com.example.test
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.ui.core.Text
    @Composable
    fun SimpleComposable() {
        Text("Hello World")
    }
    @Preview
    @Composable
    fun ComposablePreview() {
        SimpleComposable()
    }
