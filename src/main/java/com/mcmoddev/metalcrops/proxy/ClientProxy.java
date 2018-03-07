package com.mcmoddev.metalcrops.proxy;


import com.mcmoddev.metalcrops.MetalCrops;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(MetalCrops.MODID + ":" + id, "inventory"));
	}

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);	
	}
	
	@Override
    public void init(FMLInitializationEvent e) {	
    }
}
