package ru.rarescrap.kotlin

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.SidedProxy
import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.event.FMLPostInitializationEvent
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import cpw.mods.fml.common.eventhandler.SubscribeEvent
import net.minecraft.client.Minecraft
import net.minecraft.client.renderer.Tessellator
import net.minecraftforge.client.event.RenderWorldLastEvent
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.event.world.WorldEvent
import org.lwjgl.opengl.GL11
import ru.rarescrap.kotlin.MarkerItem.Companion.x1
import ru.rarescrap.kotlin.MarkerItem.Companion.x2
import ru.rarescrap.kotlin.MarkerItem.Companion.y1
import ru.rarescrap.kotlin.MarkerItem.Companion.y2
import ru.rarescrap.kotlin.MarkerItem.Companion.z1
import ru.rarescrap.kotlin.MarkerItem.Companion.z2


@Mod(modid = "lookaround", name = "Look Around", version = "0.0.1")
object KotlinTest {
    @JvmStatic
    @Mod.InstanceFactory
    fun instance() = KotlinTest
    
    @JvmStatic
    @SidedProxy(clientSide = "ru.rarescrap.kotlin.ClientProxy", serverSide = "ru.rarescrap.kotlin.CommonProxy")
    lateinit var proxy: CommonProxy

    @Mod.EventHandler
    fun pre(e: FMLPreInitializationEvent) {
        proxy.pre(e)
    }

    @Mod.EventHandler
    fun init(e: FMLInitializationEvent) {
        proxy.init(e)
        MinecraftForge.EVENT_BUS.register(this)
    }

    @Mod.EventHandler
    fun post(e: FMLPostInitializationEvent) {
        proxy.post(e)
    }

    @SubscribeEvent
    fun render(e: RenderWorldLastEvent) {
        val doubleX = Minecraft.getMinecraft().thePlayer.posX - 0.5
        val doubleY = Minecraft.getMinecraft().thePlayer.posY + 0.1
        val doubleZ = Minecraft.getMinecraft().thePlayer.posZ - 0.5

        GL11.glPushMatrix()
        GL11.glTranslated(-doubleX, -doubleY, -doubleZ)
        //GL11.glColor3ub(255.toByte(), 0.toByte(), 0.toByte())
        //GL11.glColor3b(255.toByte(), 0.toByte(), 0.toByte());
        val mx = 9f
        val my = 9f
        val mz = 9f
        //GL11.glBegin(GL11.GL_LINES)
        GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GL11.glEnable(GL11.GL_BLEND)
        //GL11.glEnable(GL11.GL_DEPTH_TEST)
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA)
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 0.5f);
        GL11.glBegin(GL11.GL_QUADS)
//        GL11.glVertex3f(x1.toFloat(), y1.toFloat(), z1.toFloat())
//        GL11.glVertex3f(x1.toFloat(), y1.toFloat(), z2.toFloat())
//
//        GL11.glVertex3f(x1.toFloat(), y1.toFloat(), z2.toFloat())
//        GL11.glVertex3f(x1.toFloat(), y2.toFloat(), z2.toFloat())
//
//        GL11.glVertex3f(x1.toFloat(), y2.toFloat(), z2.toFloat())
//        GL11.glVertex3f(x1.toFloat(), y2.toFloat(), z1.toFloat())
//
//        GL11.glVertex3f(x1.toFloat(), y2.toFloat(), z1.toFloat())
//        GL11.glVertex3f(x1.toFloat(), y1.toFloat(), z1.toFloat())
//
//        GL11.glVertex3f(x1.toFloat(), y1.toFloat(), z1.toFloat())
//        GL11.glVertex3f(x2.toFloat(), y1.toFloat(), z1.toFloat())
//
//        GL11.glVertex3f(x2.toFloat(), y1.toFloat(), z1.toFloat())
//        GL11.glVertex3f(x2.toFloat(), y1.toFloat(), z2.toFloat())
//
//        GL11.glVertex3f(x2.toFloat(), y1.toFloat(), z2.toFloat())
//        GL11.glVertex3f(x1.toFloat(), y1.toFloat(), z2.toFloat())
//
//        GL11.glVertex3f(x1.toFloat(), y1.toFloat(), z2.toFloat())
//        GL11.glVertex3f(x1.toFloat(), y2.toFloat(), z2.toFloat())
//
//        GL11.glVertex3f(x1.toFloat(), y2.toFloat(), z2.toFloat())
//        GL11.glVertex3f(x1.toFloat(), y2.toFloat(), z2.toFloat())



        //GL11.glColor3f(1.0f,1.0f,0.0f);

        //GL11.glColor4f(255.0f, 20.0f, 20.0f, 0.4f)
        GL11.glVertex3f( x1, y1,z2);
        GL11.glVertex3f(x2, y1,z2);
        GL11.glVertex3f(x2, y1, z1);
        GL11.glVertex3f( x1, y1, z1);
        GL11.glVertex3f( x1,y2, z1);
        GL11.glVertex3f(x2,y2, z1);
        GL11.glVertex3f(x2,y2,z2);
        GL11.glVertex3f( x1,y2,z2);
        GL11.glVertex3f( x1, y1, z1);
        GL11.glVertex3f(x2, y1, z1);
        GL11.glVertex3f(x2,y2, z1);
        GL11.glVertex3f( x1,y2, z1);
        GL11.glVertex3f( x1,y2,z2);
        GL11.glVertex3f(x2,y2,z2);
        GL11.glVertex3f(x2, y1,z2);
        GL11.glVertex3f( x1, y1,z2);
        GL11.glVertex3f(x2, y1, z1);
        GL11.glVertex3f(x2, y1,z2);
        GL11.glVertex3f(x2,y2,z2);
        GL11.glVertex3f(x2,y2, z1);
        GL11.glVertex3f( x1, y1,z2);
        GL11.glVertex3f( x1, y1, z1);
        GL11.glVertex3f( x1,y2, z1);
        GL11.glVertex3f( x1,y2,z2);


        GL11.glEnd()

        GL11.glDisable(GL11.GL_BLEND);
        GL11.glPopMatrix()

        var t = Tessellator.instance;
    }

    @SubscribeEvent
    fun save(e: WorldEvent.Save) {
        ModWorldSavedData.get(e.world).markDirty()
//        val data = e.world.worldInfo.nbtTagCompound.getTagList("look_around", Constants.NBT.TAG_LIST)
//
//        e.world.worldInfo.nbtTagCompound.setTag("look_around", data);
    }

    @SubscribeEvent
    fun save(e: WorldEvent.Load) {
        ModWorldSavedData.get(e.world)
        //ModWorldSavedData.get(e.world).writeToNBT(ModWorldSavedData.regions)
//        val data = e.world.worldInfo.nbtTagCompound.getTagList("look_around", Constants.NBT.TAG_LIST)
//
//        e.world.worldInfo.nbtTagCompound.setTag("look_around", data);
    }
}