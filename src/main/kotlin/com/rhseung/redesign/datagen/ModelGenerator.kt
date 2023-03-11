package com.rhseung.redesign.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.block.Block
import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.rhseung.rhseungslib.datagen.ItemModelManager
import net.rhseung.rhseungslib.registration.RegistryHelper
import net.rhseung.rhseungslib.things.BasicBlock
import net.rhseung.rhseungslib.things.BasicItem

class ModelGenerator(
	val output: FabricDataOutput
) : FabricModelProvider(output) {
	
	override fun generateBlockStateModels(blockStateModelGenerator: BlockStateModelGenerator) {
		RegistryHelper.getBlocks(BasicBlock::class).forEach {
			blockStateModelGenerator.registerCubeAllModelTexturePool(it)
		}
	}
	
	override fun generateItemModels(itemModelGenerator: ItemModelGenerator) {
		val modelManager = ItemModelManager(output.modId, itemModelGenerator)
		
		RegistryHelper.getItems(BasicItem::class).forEach {
			modelManager.generateItem(it)
		}
	}
}
