package com.example.dessertclicker.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
fun DessertScreen(
    dessertViewModel: DessertViewModel = viewModel(),
) {
    //create a val that gives me access to the public uiState
    //in the viewModel
    val dessertUiState by dessertViewModel.uiState.collectAsState()
}