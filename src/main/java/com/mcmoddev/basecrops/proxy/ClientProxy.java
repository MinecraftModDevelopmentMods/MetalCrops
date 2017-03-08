package com.mcmoddev.basecrops.proxy;


import com.mcmoddev.basecrops.init.Blocks;
import com.mcmoddev.basecrops.init.BlocksRender;
import com.mcmoddev.basecrops.init.Items;
import com.mcmoddev.basecrops.init.ItemsRender;
import com.mcmoddev.basecrops.init.Recipes;

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
