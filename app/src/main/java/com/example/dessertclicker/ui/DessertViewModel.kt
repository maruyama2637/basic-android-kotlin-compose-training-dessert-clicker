package com.example.dessertclicker.ui

import androidx.lifecycle.ViewModel
import com.example.dessertclicker.data.DessertUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DessertViewModel {
    private val _uiState = MutableStateFlow(DessertUiState())
    val uiState: StateFlow<DessertUiState> = _uiState.asStateFlow()

    /**
     *  Update the revenue and desserts sold and then advance
     *  the UI element to the next dessert
     *
     *  Essentially, this is the function of the DessertUiViewModel class
     *  that my UI will call to go to the next dessert after the user
     *  clicks on a dessert
     */
}