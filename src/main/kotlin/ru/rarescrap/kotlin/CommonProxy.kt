package ru.rarescrap.kotlin

import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.event.FMLPostInitializationEvent
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import cpw.mods.fml.common.registry.GameRegistry

open class CommonProxy {
    open fun pre(e: FMLPreInitializationEvent) {
        println("Pre initialization on server side!")
    }

    open fun init(e: FMLInitializationEvent) {
        GameRegistry.registerItem(MarkerItem.MARKER_ITEM, "marker_item")
        println("Initialization on server side!")
    }

    open fun post(e: FMLPostInitializationEvent) {
        println("Post initialization on server side!")
    }
}