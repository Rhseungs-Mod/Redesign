package com.rhseung.redesign.registration

import com.rhseung.redesign.RedesignMod
import net.minecraft.block.Material
import net.minecraft.item.Item
import net.minecraft.item.ItemGroups
import net.rhseung.rhseungslib.things.BasicBlock
import net.rhseung.rhseungslib.things.BasicItem

object RsItems {
	lateinit var EXAMPLE_ITEM: BasicItem
	lateinit var EXAMPLE_BLOCK: BasicBlock
	
	fun register() {
		val BASIC_ITEM = item(RedesignMod.modId) {
			path = "example_item"
			settings {
				group = ItemGroups.INGREDIENTS
			}
		}
		
		val BASIC_BLOCK = block(RedesignMod.modId) {
			path = "example_block"
			settings {
				material = Material.WOOD
				group = ItemGroups.INGREDIENTS
			}
		}
		
		EXAMPLE_ITEM = BasicItem.ItemBuilder("example_item", ItemGroups.INGREDIENTS)
			.of(RedesignMod.modId)
		EXAMPLE_BLOCK = BasicBlock.BlockBuilder("example_block", ItemGroups.INGREDIENTS).settings(Material.METAL)
			.of(RedesignMod.modId)
	}
}