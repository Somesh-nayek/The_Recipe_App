package com.example.the_recipe_app

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Category(val idCategory:String,
    val strCategory:String,
    val strCategoryThumb:String,
    val strCategoryDescription:String):Parcelable
data class CategoriesResponse(val categories:List<Category>)
