package com.rodrigoc.recipesapp.data

import com.rodrigoc.recipesapp.data.network.FoodRecipesApi
import com.rodrigoc.recipesapp.model.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi,
) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.getRecipes(queries)
    }

}