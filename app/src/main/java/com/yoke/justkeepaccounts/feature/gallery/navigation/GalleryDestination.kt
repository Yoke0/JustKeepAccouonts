package com.yoke.justkeepaccounts.feature.gallery.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.yoke.justkeepaccounts.core.navigation.AppNavigationDestination
import com.yoke.justkeepaccounts.feature.bill.BillRoute

object GalleryDestination : AppNavigationDestination {
    override val route: String = "gallery_route"
    override val destination: String = "gallery_destination"
    const val galleryIdArg = "galleryId"
}

fun NavGraphBuilder.galleryGraph(
    onBackClick: () -> Unit
) {
    composable(
        route = "${GalleryDestination.route}/${GalleryDestination.galleryIdArg}",
        arguments = listOf(
            navArgument(GalleryDestination.galleryIdArg) {
                type = NavType.StringType
            }
        )
    ) {
        BillRoute(onBackClick = onBackClick)
    }
}