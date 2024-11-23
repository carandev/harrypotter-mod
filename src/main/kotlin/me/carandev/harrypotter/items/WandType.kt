package me.carandev.harrypotter.items

import me.carandev.harrypotter.items.materials.CoreType
import me.carandev.harrypotter.items.materials.WoodType

data class WandType(val wood: WoodType, val core: CoreType, val length: Int)
