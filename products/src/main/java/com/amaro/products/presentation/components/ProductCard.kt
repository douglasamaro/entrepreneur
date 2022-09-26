package com.amaro.products.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.amaro.products.R

@Composable
fun ProductCard(
    image: Int,
    name: String,
    costs: Double,
    value: Double,
    quantity: Int,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 24.dp, end = 24.dp)
    ) {
        Row(
            modifier = Modifier.padding(start = 10.dp, end = 10.dp)
        ) {
            painterResource(id = image)
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {

            }
        }
    }
}

@Preview
@Composable
fun MPreview() {
    ProductCard(
        image = R.drawable.ic_launcher_background,
        name = "Product Teste",
        costs = 12.3,
        value = 59.90,
        5
    )
}