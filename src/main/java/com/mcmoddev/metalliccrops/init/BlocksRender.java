package com.mcmoddev.metalliccrops.init;

import com.mcmoddev.metalliccrops.MetallicCrops;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlocksRender {
	public static void registerBlockRenderer() {
	reg(Blocks.metallicFarmland);
	reg(Blocks.metallicOre);
}
	private static void reg(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(MetallicCrops.MODID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
		
		
	}
}
