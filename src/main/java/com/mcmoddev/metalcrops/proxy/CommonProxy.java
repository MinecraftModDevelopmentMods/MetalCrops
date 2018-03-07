package com.mcmoddev.metalcrops.proxy;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import com.mcmoddev.metalcrops.lib.WorldGen;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;


public class CommonProxy {
	public void registerItemRenderer(Item item, int meta, String id) {
	}
	public static Configuration config;
    public void preInit(FMLPreInitializationEvent e) {
    	config = new Configuration(e.getSuggestedConfigurationFile());
		FMLInterModComms.sendFunctionMessage("orespawn", "api", "com.mcmoddev.orespawn.MetalCropsOreSpawn");
		GameRegistry.registerWorldGenerator(new WorldGen(), 0);
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }
}