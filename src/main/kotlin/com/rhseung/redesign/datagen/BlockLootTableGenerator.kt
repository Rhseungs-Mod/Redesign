package com.rhseung.redesign.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider
import net.rhseung.rhseungslib.datagen.BlockLootTableManager
import net.rhseung.rhseungslib.registration.RegistryHelper
import net.rhseung.rhseungslib.things.BasicBlock

class BlockLootTableGenerator(val output: FabricDataOutput,
) : FabricBlockLootTableProvider(output) {
	
	override fun generate() {
		val lootTableManager = BlockLootTableManager(output.modId, this)
		
		RegistryHelper.getBlocks(BasicBlock::class).forEach {
			lootTableManager.simpleDrop(it)
		}
	}
}
