package com.yoke.justkeepaccounts.feature.bill

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.yoke.justkeepaccounts.core.model.Bill

@Composable
fun BillRoute(
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: BillViewModel = hiltViewModel(),
) {
    BillScreen(

    )
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun BillScreen(
    modifier: Modifier = Modifier,
) {
    Scaffold(
        topBar = {

        },
        containerColor = Color.Transparent
    ) { innerPadding ->
        BoxWithConstraints(
            modifier = modifier
                .padding(innerPadding)
                .consumedWindowInsets(innerPadding)
        ) {
//            val numberOfColumns = when (windowSizeClass.widthSizeClass) {
//                WindowWidthSizeClass.Compact, WindowWidthSizeClass.Medium -> 1
//                else -> floor(maxWidth / 300.dp).toInt().coerceAtLeast(1)
//            }
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BillView(bills: List<Bill>) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(padding)
    ) {
        Column {
            BillTitle()
            BillContent(bills = bills)
            BillFooter(bills = bills)
        }
    }
}

@Composable
fun BillTitle() {
    Column(
        modifier = Modifier.padding(padding, padding, padding, 0.dp),
    ) {
        Row(
            modifier = Modifier.height(IntrinsicSize.Max)
        ) {
            Text(
                text = "名称",
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.width(padding / 2))
            Text(
                text = "数量",
                modifier = Modifier
                    .widthIn(64.dp),
                textAlign = TextAlign.End
            )
            Spacer(modifier = Modifier.width(padding / 2))
            Text(
                text = "价格",
                modifier = Modifier
                    .widthIn(64.dp),
                textAlign = TextAlign.End
            )
        }
        Spacer(modifier = Modifier.height(padding / 2))
        Spacer(
            modifier = Modifier
                .height(1.dp)
                .fillMaxWidth()
                .background(color = Color.Black)
        )
    }
}

@Composable
fun BillContent(bills: List<Bill>) {
    LazyColumn {
        items(bills) { bill ->
            BillItem(bill = bill)
        }
    }
}

@Composable
fun BillFooter(bills: List<Bill>) {
    var totalCost = 0f
    bills.forEach {
        totalCost = totalCost.plus(it.price)
    }
    Column(
        modifier = Modifier.padding(padding, padding / 2, padding, padding),
    ) {
        Spacer(
            modifier = Modifier
                .height(1.dp)
                .fillMaxWidth()
                .background(color = Color.Black)
        )
        Spacer(modifier = Modifier.height(padding / 2))
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = floatToPrice(totalCost),
            textAlign = TextAlign.End
        )
    }
}

@Composable
fun BillItem(bill: Bill) {
    Column(
        modifier = Modifier.padding(padding, padding / 2, padding, padding / 2),
    ) {
        Row(
            modifier = Modifier.height(IntrinsicSize.Max)
        ) {
            Text(
                text = bill.name,
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.width(padding / 2))
            Text(
                text = "* ${bill.account}",
                modifier = Modifier
                    .widthIn(64.dp),
                textAlign = TextAlign.End
            )
            Spacer(modifier = Modifier.width(padding / 2))
            Text(
                text = floatToPrice(bill.price),
                modifier = Modifier
                    .widthIn(64.dp),
                textAlign = TextAlign.End
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBillView() {
    val bills = mutableListOf<Bill>()
    repeat(10) {
        val bill = Bill(it, 1, "矿泉水", 1.00f, "2022-07-31", 1659260026665, "")
        bills.add(bill)
    }

    BillView(bills = bills)
}

fun floatToPrice(num: Float): String {
    return "%.2f".format(num)
}

private val padding = 16.dp