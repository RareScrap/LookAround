package ru.rarescrap.kotlin

import net.minecraft.nbt.NBTTagCompound
import net.minecraft.nbt.NBTTagList
import net.minecraft.world.World
import net.minecraft.world.WorldSavedData
import net.minecraftforge.common.util.Constants
import ru.rarescrap.kotlin.MarkerItem.Companion.x1
import ru.rarescrap.kotlin.MarkerItem.Companion.x2
import ru.rarescrap.kotlin.MarkerItem.Companion.y1
import ru.rarescrap.kotlin.MarkerItem.Companion.y2
import ru.rarescrap.kotlin.MarkerItem.Companion.z1
import ru.rarescrap.kotlin.MarkerItem.Companion.z2


open class ModWorldSavedData : WorldSavedData(DATA_NAME) {
    companion object {
        val DATA_NAME = "lookaround_data"

        fun get(world: World): ModWorldSavedData {
            //var data: ModWorldSavedData? = world.loadItemData(ModWorldSavedData::class.java, DATA_NAME) as ModWorldSavedData
            var data = world.loadItemData(ModWorldSavedData::class.java, DATA_NAME)

            if (data == null) {
                data = ModWorldSavedData()
                world.setItemData(DATA_NAME, data)
            }
            return data as ModWorldSavedData
        }

        var regions = NBTTagList()
    }

    override fun writeToNBT(data: NBTTagCompound?) {
        var region = NBTTagCompound()
        region.setFloat("x1", x1)
        region.setFloat("y1", y1)
        region.setFloat("z1", z1)

        region.setFloat("x2", x2)
        region.setFloat("y2", y2)
        region.setFloat("z2", z2)

        // TODO: +message

        regions.appendTag(region)
        data!!.setTag("regions", regions)
        markDirty()
    }

    override fun readFromNBT(data: NBTTagCompound?) {
        regions = data!!.getTagList("regions", Constants.NBT.TAG_LIST)
    }
}
