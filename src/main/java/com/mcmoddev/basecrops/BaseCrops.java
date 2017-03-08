package com.mcmoddev.basecrops;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.mcmoddev.basecrops.proxy.CommonProxy;

@Mod(modid = BaseCrops.MODID, name = BaseCrops.MODNAME, version = BaseCrops.VERSION, dependencies = "after:basemetals" )
public class BaseCrops
{
    public static final String MODID = "basecrops";
    public static final String MODNAME = "Base Crops";
    public static final String VERSION = "1.0";
    
    @SidedProxy(clientSide = "com.mcmoddev.basecrops.proxy.ClientProxy", serverSide = "com.mcmoddev.basecrops.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    @Mod.Instance
    public static BaseCrops instance;
    
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
