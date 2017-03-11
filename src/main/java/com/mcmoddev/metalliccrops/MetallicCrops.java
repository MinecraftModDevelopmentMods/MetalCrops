package com.mcmoddev.metalliccrops;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.mcmoddev.metalliccrops.proxy.CommonProxy;

@Mod(modid = MetallicCrops.MODID, name = MetallicCrops.MODNAME, version = MetallicCrops.VERSION, dependencies = "after:basemetals" )
public class MetallicCrops
{
    public static final String MODID = "metalliccrops";
    public static final String MODNAME = "Metallic Crops";
    public static final String VERSION = "1.1.0";
    
    @SidedProxy(clientSide = "com.mcmoddev.metalliccrops.proxy.ClientProxy", serverSide = "com.mcmoddev.metalliccrops.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    @Mod.Instance
    public static MetallicCrops instance;
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	proxy.preInit(event);
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent e){
    	proxy.init(e);
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
    	proxy.postInit(e);
    }
    
}
