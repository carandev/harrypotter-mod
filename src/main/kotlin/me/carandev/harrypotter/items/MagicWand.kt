package me.carandev.harrypotter.items

import me.carandev.harrypotter.items.materials.CoreType
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.text.Text
import net.minecraft.util.Hand
import net.minecraft.util.TypedActionResult
import net.minecraft.world.World

class MagicWand(private val wandType: WandType) : Item(Settings().maxCount(1)) {
    override fun use(
        world: World?,
        user: PlayerEntity?,
        hand: Hand?
    ): TypedActionResult<ItemStack?>? {
        if (world?.isClient == true){
            user?.sendMessage(Text.of("You have a ${wandType.wood.displayName} wand with a ${wandType.core.displayName} core."), false)

            castSpell(user, wandType)
        }

        return TypedActionResult.success(user?.getStackInHand(hand))
    }

    private fun castSpell(player: PlayerEntity?, wandType: WandType) {
        when (wandType.core) {
            CoreType.PHOENIX_FEATHER -> {
                // Ejemplo: lanzar un hechizo de fuego
                player?.sendMessage(Text.of("Lanzando hechizo de fuego..."), true)
                // Implementar lógica de ataque de fuego
            }
            CoreType.DRAGON_HEARTSTRING -> {
                // Ejemplo: lanzar un rayo
                player?.sendMessage(Text.of("Lanzando rayo..."), true)
                // Implementar lógica para rayo
            }
            CoreType.UNICORN_HAIR -> {
                // Ejemplo: curación
                player?.heal(5.0F)
                player?.sendMessage(Text.of("Curado por la varita!"), true)
            }
        }
    }
}