package com.mcmoddev.metalliccrops.proxy;


import com.mcmoddev.metalliccrops.init.Blocks;
import com.mcmoddev.metalliccrops.init.Items;
import com.mcmoddev.metalliccrops.init.ItemsRender;
import com.mcmoddev.metalliccrops.init.Recipes;
import com.mcmoddev.metalliccrops.init.SpecialBlocksRender;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);	
	Blocks.initModels();
	ItemsRender.registerItemRenderer();
	
	if (Loader.isModLoaded("basemetals")){	
		ItemsRender.registerItemRendererBMe(); 
		Blocks.initModelsBMe();}
	
	if (Loader.isModLoaded("modernmetals")){	
		ItemsRender.registerItemRendererMMe(); 
		Blocks.initModelsMMe();}
	
	if (Loader.isModLoaded("utilitybaseores")){	
		ItemsRender.registerItemRendererUBO(); 
		Blocks.initModelsUBO();}
	
	
	}
	
	@Override
    public void init(FMLInitializationEvent e) {	
	SpecialBlocksRender.registerBlockRenderer();
    }
}
