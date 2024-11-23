package me.carandev.harrypotter.registry

import me.carandev.harrypotter.items.MagicWand
import me.carandev.harrypotter.items.WandType
import me.carandev.harrypotter.items.materials.CoreType
import me.carandev.harrypotter.items.materials.WoodType
import net.minecraft.item.Item
import net.minecraft.item.Item.Settings
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ItemRegistry {
    val HOLLY_PHOENIX_FEATHER_WAND = register(MagicWand(WandType(WoodType.HOLLY, CoreType.PHOENIX_FEATHER, 13)), "holly_phoenix_feather_wand")
    val YEW_DRAGON_HEARTSTRING_WAND = register(MagicWand(WandType(WoodType.YEW, CoreType.DRAGON_HEARTSTRING, 13)), "yew_dragon_heartstring_wand")
    val OAK_UNICORN_HAIR_WAND = register(MagicWand(WandType(WoodType.OAK, CoreType.UNICORN_HAIR, 13)), "oak_unicorn_hair_wand")
    val PHOENIX_FEATHER = register(Item(Settings()), "phoenix_feather")

    fun register(item: Item, id: String) : Item{
        val itemId = Identifier.of("harrypotter", id)

        return Registry.register(Registries.ITEM, itemId, item)
    }

    fun init() {
    }
}