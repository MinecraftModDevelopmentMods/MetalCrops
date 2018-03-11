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

	public static BlockMetalCrop copperCrop = (BlockMetalCrop) new BlockMetalCrop("copper_crop","copper_smallpowder", "copper_seeds").setCreativeTab(CreativeTabs.MATERIALS);
	public static BlockMetalCrop antimonyCrop = (BlockMetalCrop) new BlockMetalCrop("antimony_crop","antimony_powder", "antimony_seeds").setCreativeTab(CreativeTabs.MATERIALS);
	public static BlockMetalCrop adamantineCrop = (BlockMetalCrop) new BlockMetalCrop("adamantine_crop","adamantine_smallpowder", "antimony_seeds").setCreativeTab(CreativeTabs.MATERIALS);
	public static BlockMetalCrop aquariumCrop = (BlockMetalCrop) new BlockMetalCrop("aquarium_crop","aquarium_smallpowder", "aquarium_seeds").setCreativeTab(CreativeTabs.MATERIALS);
	public static BlockMetalCrop bismuthCrop = (BlockMetalCrop) new BlockMetalCrop("bismuth_crop","bismuth_powder", "bismuth_seeds").setCreativeTab(CreativeTabs.MATERIALS);
	public static BlockMetalCrop coldironCrop = (BlockMetalCrop) new BlockMetalCrop("coldiron_crop","coldiron_smallpowder", "coldiron_seeds").setCreativeTab(CreativeTabs.MATERIALS);
	public static BlockMetalCrop leadCrop = (BlockMetalCrop) new BlockMetalCrop("lead_crop","lead_smallpowder", "lead_seeds").setCreativeTab(CreativeTabs.MATERIALS);
	public static BlockMetalCrop nickelCrop = (BlockMetalCrop) new BlockMetalCrop("nickel_crop","nickel_smallpowder", "nickel_seeds").setCreativeTab(CreativeTabs.MATERIALS);
	public static BlockMetalCrop mercuryCrop = (BlockMetalCrop) new BlockMetalCrop("mercury_crop","mercury_smallpowder", "mercury_seeds").setCreativeTab(CreativeTabs.MATERIALS);
	public static BlockMetalCrop starsteelCrop = (BlockMetalCrop) new BlockMetalCrop("starsteel_crop","starsteel_smallpowder", "starsteel_seeds").setCreativeTab(CreativeTabs.MATERIALS);
	public static BlockMetalCrop tinCrop = (BlockMetalCrop) new BlockMetalCrop("tin_crop","tin_smallpowder", "tin_seeds").setCreativeTab(CreativeTabs.MATERIALS);
	public static BlockMetalCrop zincCrop = (BlockMetalCrop) new BlockMetalCrop("zinc_crop","zinc_smallpowder", "zinc_seeds").setCreativeTab(CreativeTabs.MATERIALS);

	

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
				metallicOre,
				
				copperCrop,
				antimonyCrop,
				adamantineCrop,
				aquariumCrop,
				bismuthCrop ,
				coldironCrop,
				leadCrop,
				nickelCrop,
				mercuryCrop,
				starsteelCrop,
				tinCrop,
				zincCrop
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
				metallicOre.createItemBlock(),
				//BMe
				copperCrop.createItemBlock(),
				antimonyCrop.createItemBlock(),
				adamantineCrop.createItemBlock(),
				aquariumCrop.createItemBlock(),
				bismuthCrop .createItemBlock(),
				coldironCrop.createItemBlock(),
				leadCrop.createItemBlock(),
				nickelCrop.createItemBlock(),
				mercuryCrop.createItemBlock(),
				starsteelCrop.createItemBlock(),
				tinCrop.createItemBlock(),
				zincCrop.createItemBlock()
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
		copperCrop.registerItemModel(Item.getItemFromBlock(copperCrop));
		antimonyCrop.registerItemModel(Item.getItemFromBlock(antimonyCrop));
		adamantineCrop.registerItemModel(Item.getItemFromBlock(adamantineCrop));
		aquariumCrop.registerItemModel(Item.getItemFromBlock(aquariumCrop));
		bismuthCrop.registerItemModel(Item.getItemFromBlock(bismuthCrop));
		coldironCrop.registerItemModel(Item.getItemFromBlock(coldironCrop));
		leadCrop.registerItemModel(Item.getItemFromBlock(leadCrop));
		nickelCrop.registerItemModel(Item.getItemFromBlock(nickelCrop));
		mercuryCrop.registerItemModel(Item.getItemFromBlock(mercuryCrop));
		starsteelCrop.registerItemModel(Item.getItemFromBlock(starsteelCrop));
		tinCrop.registerItemModel(Item.getItemFromBlock(tinCrop));
		zincCrop.registerItemModel(Item.getItemFromBlock(zincCrop));

	}


}
