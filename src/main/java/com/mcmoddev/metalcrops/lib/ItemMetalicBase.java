package com.mcmoddev.metalcrops.lib;

import com.mcmoddev.metalcrops.MetalCrops;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemMetalicBase extends Item {

	private String name;

	public ItemMetalicBase(String name) {
		super();
		setUnlocalizedName(MetalCrops.MODID + "." + name);
        this.setCreativeTab(CreativeTabs.MATERIALS);
    	this.name = name;
		setRegistryName(name);
	}
	
	public void registerItemModel() {
		MetalCrops.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemMetalicBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}


