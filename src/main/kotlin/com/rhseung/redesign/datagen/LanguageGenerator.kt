package com.rhseung.redesign.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.block.Block
import net.minecraft.item.Item
import net.rhseung.rhseungslib.datagen.LanguageManager
import net.rhseung.rhseungslib.registration.RegistryHelper
import net.rhseung.rhseungslib.things.BasicBlock
import net.rhseung.rhseungslib.things.BasicItem

class LanguageGenerator(val output: FabricDataOutput,
) : FabricLanguageProvider(output, "en_us") {
	
	override fun generateTranslations(translationBuilder: TranslationBuilder) {
		val languageManager = LanguageManager(output.modId, translationBuilder)
		
		RegistryHelper.getItems(BasicItem::class).forEach {
			languageManager.generate(it)
		}
		RegistryHelper.getBlocks(BasicBlock::class).forEach {
			languageManager.generate(it)
		}
	}
}
