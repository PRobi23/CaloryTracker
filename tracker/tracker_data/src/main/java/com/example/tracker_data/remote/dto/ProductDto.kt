package com.example.tracker_data.remote.dto

import com.squareup.moshi.Json

data class ProductDto(
    @field:Json(name = "image_front_thumb_url")
    val imageFrontThumbUrl: String?,
    val nutriments: Nutriments,
    @field:Json(name = "product_name")
    val productName: String?
)