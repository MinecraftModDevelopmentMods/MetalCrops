package com.mcmoddev.metalliccrops.lib;

import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import com.mcmoddev.metalliccrops.MetallicCrops;

public class BlockMetalCrop extends BlockCrops{
	public String crop;
	public String seed;

	
	public BlockMetalCrop(String regname, String cropname, String seedname) {
		setUnlocalizedName(MetallicCrops.MODID + "." + regname);
		setRegistryName(regname);
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());
		crop = cropname;
		seed = seedname;
	}
	
	@Override
	protected Item getSeed() {
		return Item.getByNameOrId("metalliccrops:" + seed);
	}
	@Override
	protected Item getCrop() {
		return Item.getByNameOrId("metalliccrops:" + crop);
	}

	@SideOnly(Side.CLIENT)
	public void initModel(){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}
 
}