package ru.rarescrap.kotlin

import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.event.FMLPostInitializationEvent
import cpw.mods.fml.common.event.FMLPreInitializationEvent

class ClientProxy: CommonProxy() {
    override fun pre(e: FMLPreInitializationEvent) {
        super.pre(e)
        println("Pre initialization on client side!")
    }

    override fun init(e: FMLInitializationEvent) {
        super.init(e)
        println("Initialization on client side!")
    }

    override fun post(e: FMLPostInitializationEvent) {
        super.post(e)
        println("Post initialization on client side!")
    }
}