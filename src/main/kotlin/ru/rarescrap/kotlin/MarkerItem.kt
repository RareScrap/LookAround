package ru.rarescrap.kotlin

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.world.World

class MarkerItem() : Item() {
    companion object {
        val MARKER_ITEM = MarkerItem()
        var x1 = 0.0f
        var y1 = 0.0f
        var z1 = 0.0f
        var x2 = 0.0f
        var y2 = 0.0f
        var z2 = 0.0f
    }

    init {
        unlocalizedName = "region_marker"
        creativeTab = CreativeTabs.tabTools
    }

    // ПКМ
    override fun onItemUse(stack: ItemStack?, entityPlayer: EntityPlayer?, world: World?, x: Int, y: Int, z: Int, side: Int, hitX: Float, hitY: Float, hitZ: Float): Boolean {
        if (world!!.isRemote) {
            x2 = x.toFloat()
            y2 = y.toFloat()
            z2 = z.toFloat()
        }

        return super.onItemUse(stack, entityPlayer, world, x, y, z, side, hitX, hitY, hitZ)
    }


    // TODO: З
    override fun getMaxItemUseDuration(p_77626_1_: ItemStack?): Int {
        return 1
    }
}