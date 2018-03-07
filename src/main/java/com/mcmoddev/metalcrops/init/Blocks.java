package com.mcmoddev.metalcrops.init;


import com.mcmoddev.metalcrops.lib.BlockMetalCrop;
import com.mcmoddev.metalcrops.lib.BlockMetalicBase;
import com.mcmoddev.metalcrops.lib.BlockOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class Blocks {

	//Vanilla
	public static BlockMetalCrop ironCrop = (BlockMetalCrop) new BlockMetalCrop("iron_crop","iron_smallpowder", "iron_seeds").setCreativeTab(CreativeTabs.MATERIALS);
	public static BlockMetalCrop goldCrop = (BlockMetalCrop) new BlockMetalCrop("gold_crop","gold_smallpowder", "gold_seeds").setCreativeTab(CreativeTabs.MATERIALS);
	public static BlockMetalCrop coalCrop = (BlockMetalCrop) new BlockMetalCrop("coal_crop","coal_smallpowder", "coal_seeds").setCreativeTab(CreativeTabs.MATERIALS);
	public static BlockMetalCrop lapisCrop = (BlockMetalCrop) new BlockMetalCrop("lapis_crop","lapis_smallpowder", "lapis_seeds").setCreativeTab(CreativeTabs.MATERIALS);
	public static BlockMetalCrop diamondCrop = (BlockMetalCrop) new BlockMetalCrop("diamond_crop","diamond_smallpowder", "diamond_seeds").setCreativeTab(CreativeTabs.MATERIALS);
	public static BlockMetalCrop redstoneCrop = (BlockMetalCrop) new BlockMetalCrop("redstone_crop","redstone_smallpowder", "redstone_seeds").setCreativeTab(CreativeTabs.MATERIALS);
	public static BlockMetalCrop emeraldCrop = (BlockMetalCrop) new BlockMetalCrop("emerald_crop","emerald_smallpowder", "emerald_seeds").setCreativeTab(CreativeTabs.MATERIALS);
	public static BlockMetalCrop metallicCrop = (BlockMetalCrop) new BlockMetalCrop("metallic_crop","metallic_smallpowder", "metallic_seeds").setCreativeTab(CreativeTabs.MATERIALS);
	public static BlockMetalicBase metallicFarmland = (BlockMetalicBase) new BlockMetalicBase(Material.GRASS, "metallic_farmland").setCreativeTab(CreativeTabs.MATERIALS);
	public static BlockOre metallicOre = (BlockOre) new BlockOre("metallic_ore").setCreativeTab(CreativeTabs.MATERIALS);

	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				
				//Vanilla
				ironCrop,
				goldCrop,
				coalCrop,
				lapisCrop,
				diamondCrop,
				redstoneCrop,
				emeraldCrop,
				
				//Other
				metallicCrop,
				metallicFarmland,
				metallicOre
		);
	}

	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
				
				//Vanilla
				ironCrop.createItemBlock(),
				goldCrop.createItemBlock(),
				coalCrop.createItemBlock(),
				lapisCrop.createItemBlock(),
				diamondCrop.createItemBlock(),
				redstoneCrop.createItemBlock(),
				emeraldCrop.createItemBlock(),
				
				//Other
				metallicCrop.createItemBlock(),
			    metallicFarmland.createItemBlock(),
				metallicOre.createItemBlock()
		);
	}

	public static void registerItemModels() {
		
		//Vanilla
		ironCrop.registerItemModel(Item.getItemFromBlock(ironCrop));
		goldCrop.registerItemModel(Item.getItemFromBlock(goldCrop));
		coalCrop.registerItemModel(Item.getItemFromBlock(coalCrop));
		lapisCrop.registerItemModel(Item.getItemFromBlock(lapisCrop));
		diamondCrop.registerItemModel(Item.getItemFromBlock(diamondCrop));
		redstoneCrop.registerItemModel(Item.getItemFromBlock(redstoneCrop));
		emeraldCrop.registerItemModel(Item.getItemFromBlock(emeraldCrop));
		
		//Other
		metallicCrop.registerItemModel(Item.getItemFromBlock(metallicCrop));
	    metallicFarmland.registerItemModel(Item.getItemFromBlock(metallicFarmland));
	    metallicOre.registerItemModel(Item.getItemFromBlock(metallicOre));

	}

}
