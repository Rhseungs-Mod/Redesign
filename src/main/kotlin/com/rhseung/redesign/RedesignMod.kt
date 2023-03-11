package com.rhseung.redesign

import com.rhseung.redesign.registration.RsItems
import net.fabricmc.api.ModInitializer
import net.minecraft.util.Identifier
import org.slf4j.LoggerFactory

object RedesignMod : ModInitializer {
	const val modId = "redesign"
	private val logger = LoggerFactory.getLogger(modId)

	fun modID(path: String): Identifier {
		return Identifier(modId, path)
	}
	
	override fun onInitialize() {
		RsItems.register()
	}
}