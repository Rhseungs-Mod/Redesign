package com.rhseung.redesign

import com.rhseung.redesign.datagen.*
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput

object RedesignData : DataGeneratorEntrypoint {
	override fun onInitializeDataGenerator(fabricDataGenerator: FabricDataGenerator) {
		val pack = fabricDataGenerator.createPack()
		
		pack.addProvider { output: FabricDataOutput -> ModelGenerator(output) }
		pack.addProvider { output: FabricDataOutput -> RecipeGenerator(output) }
		pack.addProvider { output: FabricDataOutput -> LanguageGenerator(output) }
		pack.addProvider { output: FabricDataOutput -> BlockLootTableGenerator(output) }
		pack.addProvider { output: FabricDataOutput, registriesFuture -> ItemTagGenerator(output, registriesFuture) }
		pack.addProvider { output: FabricDataOutput, registriesFuture -> BlockTagGenerator(output, registriesFuture) }
	}
}