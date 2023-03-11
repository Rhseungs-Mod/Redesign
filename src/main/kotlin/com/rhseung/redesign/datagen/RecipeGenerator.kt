package com.rhseung.redesign.datagen

import com.rhseung.redesign.registration.RsItems
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.data.server.recipe.RecipeJsonProvider
import net.rhseung.rhseungslib.datagen.RecipeManager
import java.util.function.Consumer

class RecipeGenerator(
	val output: FabricDataOutput
) : FabricRecipeProvider(output) {
	
	override fun generate(exporter: Consumer<RecipeJsonProvider>) {
		val reciperManager = RecipeManager(output.modId, exporter)
		
		reciperManager.generateShapelessRecipe(RsItems.EXAMPLE_BLOCK, RsItems.EXAMPLE_ITEM, 9)
	}
}
