package com.example.the_recipe_app

sealed class Screen(val route:String){
    object  RecipeScreen:Screen("recipescreen")
    object DetailScreen:Screen("detailscreen")

}