package me.carandev.harrypotter

import me.carandev.harrypotter.registry.ItemRegistry
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.ItemGroups

class Harrypotter : ModInitializer {

    override fun onInitialize() {
        ItemRegistry.init()

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
            .register{it.add(ItemRegistry.HOLLY_PHOENIX_FEATHER_WAND)}

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
            .register{it.add(ItemRegistry.YEW_DRAGON_HEARTSTRING_WAND)}

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
            .register{it.add(ItemRegistry.OAK_UNICORN_HAIR_WAND)}

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
            .register{it.add(ItemRegistry.PHOENIX_FEATHER)}
    }
}
