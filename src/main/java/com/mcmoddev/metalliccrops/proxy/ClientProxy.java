package com.mcmoddev.metalliccrops.proxy;


import com.mcmoddev.metalliccrops.init.Blocks;
import com.mcmoddev.metalliccrops.init.BlocksRender;
import com.mcmoddev.metalliccrops.init.Items;
import com.mcmoddev.metalliccrops.init.ItemsRender;
import com.mcmoddev.metalliccrops.init.Recipes;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);	
	Blocks.initModels();
	ItemsRender.registerItemRenderer();
	
	if (Loader.isModLoaded("basemetals")){	ItemsRender.registerItemRendererBMe(); Blocks.initModelsBMe();

	}
	}
	
	@Override
    public void init(FMLInitializationEvent e) {	
	BlocksRender.registerBlockRenderer();
    }
}
