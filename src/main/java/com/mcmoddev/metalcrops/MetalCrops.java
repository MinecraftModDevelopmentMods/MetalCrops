package com.mcmoddev.metalcrops;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.mcmoddev.metalcrops.init.Blocks;
import com.mcmoddev.metalcrops.init.Items;
import com.mcmoddev.metalcrops.init.Recipes;
import com.mcmoddev.metalcrops.proxy.CommonProxy;

@Mod(modid = MetalCrops.MODID, name = MetalCrops.MODNAME, version = MetalCrops.VERSION,dependencies = "required-after:forge@[14.23.2.2624,);after:basemetals;after:baseminerals;after:modernmetals")
public class MetalCrops
{
    public static final String MODID = "metalcrops";
    public static final String MODNAME = "Metal Crops";
    public static final String VERSION = "1.2.2";
    
    @SidedProxy(clientSide = "com.mcmoddev.metalcrops.proxy.ClientProxy", serverSide = "com.mcmoddev.metalcrops.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    @Mod.Instance
    public static MetalCrops instance;
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	proxy.preInit(event);
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent e){
    	proxy.init(e);
		Recipes.init();
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
    	proxy.postInit(e);
    	
    }
    
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			Blocks.register(event.getRegistry());


		}
		
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			Items.register(event.getRegistry());
			Blocks.registerItemBlocks(event.getRegistry());

			}

		
		
		
		@SubscribeEvent
		public static void registerItemModels(ModelRegistryEvent event) {
		
		
		{
			//MCe
			Items.registerModels();
			Blocks.registerItemModels();

		
		}

		}
		


		}

	
}
		