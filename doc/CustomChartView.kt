package com.example.justkeepaccounts.ui

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.justkeepaccounts.core.model.Constant.padding

@Composable
fun CustomChartView() {

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CostSheetView(costSheet: CostSheet) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        Column(
            modifier = Modifier
                .padding(padding)
        ) {
            Text(
                text = "预算",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(padding / 2))
            CostSheetCanvas(costSheet = costSheet)
        }
    }
}

@Composable
fun CostSheetCanvas(costSheet: CostSheet) {
    val sweepAngle = costSheet.cost / costSheet.total * 360
    Canvas(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1f)
    ) {
        val canvasWidth = size.width
        val canvasHeight = size.height
        drawCircle(
            color = Color.Green,
            center = Offset(x = canvasWidth / 2, y = canvasWidth / 2),
            radius = size.minDimension / 2
        )
        drawArc(
            color = Color.Red,
            startAngle = -90f,
            sweepAngle = sweepAngle,
            useCenter = true,
            size = Size(canvasWidth, canvasWidth)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    val costSheet = CostSheet(1500f, 2000f)
    LazyVerticalGrid(
        modifier = Modifier.fillMaxSize(),
        columns = GridCells.Adaptive(minSize = 128.dp),
        contentPadding = PaddingValues(horizontal = padding),
        horizontalArrangement = Arrangement.spacedBy(padding),
        verticalArrangement = Arrangement.spacedBy(padding)
    ) {
        items(10) {
            CostSheetView(costSheet = costSheet)
        }
    }
}

data class CostSheet(
    val cost: Float,
    val total: Float,
)