package org.valkyrienskies.tournament.registry

import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack
import org.valkyrienskies.tournament.services.TournamentPlatformHelper
import java.util.ServiceLoader

class CreativeTabs {
    companion object {
        fun create(id: ResourceLocation, stack: () -> ItemStack): CreativeModeTab {
            return ServiceLoader.load(TournamentPlatformHelper::class.java)
                .findFirst()
                .get()
                .createCreativeTab(id, stack)
        }
    }
}