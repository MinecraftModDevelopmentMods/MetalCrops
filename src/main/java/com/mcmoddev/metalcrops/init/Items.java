package com.mcmoddev.metalcrops.init;

import com.mcmoddev.metalcrops.lib.ItemMetalHoe;
import com.mcmoddev.metalcrops.lib.ItemMetalicBase;
import com.mcmoddev.metalcrops.lib.ItemModMetalSeeds;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.registries.IForgeRegistry;

public class Items {

	public static ItemMetalicBase goldSmallPowder = (ItemMetalicBase) new ItemMetalicBase ("gold_smallpowder").setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemMetalicBase ironSmallPowder = (ItemMetalicBase) new ItemMetalicBase ("iron_smallpowder").setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemMetalicBase coalSmallPowder = (ItemMetalicBase) new ItemMetalicBase ("coal_smallpowder").setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemMetalicBase lapisSmallPowder = (ItemMetalicBase) new ItemMetalicBase ("lapis_smallpowder").setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemMetalicBase diamondSmallPowder = (ItemMetalicBase) new ItemMetalicBase ("diamond_smallpowder").setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemMetalicBase redstoneSmallPowder = (ItemMetalicBase) new ItemMetalicBase ("redstone_smallpowder").setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemMetalicBase emeraldSmallPowder = (ItemMetalicBase) new ItemMetalicBase ("emerald_smallpowder").setCreativeTab(CreativeTabs.MATERIALS);

	public static ItemMetalicBase goldPowder = (ItemMetalicBase) new ItemMetalicBase ("gold_powder").setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemMetalicBase ironPowder = (ItemMetalicBase) new ItemMetalicBase ("iron_powder").setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemMetalicBase coalPowder = (ItemMetalicBase) new ItemMetalicBase ("coal_powder").setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemMetalicBase lapisPowder = (ItemMetalicBase) new ItemMetalicBase ("lapis_powder").setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemMetalicBase diamondPowder = (ItemMetalicBase) new ItemMetalicBase ("diamond_powder").setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemMetalicBase redstonePowder = (ItemMetalicBase) new ItemMetalicBase ("redstone_powder").setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemMetalicBase emeraldPowder = (ItemMetalicBase) new ItemMetalicBase ("emerald_powder").setCreativeTab(CreativeTabs.MATERIALS);

	public static ItemModMetalSeeds goldSeeds = (ItemModMetalSeeds) new ItemModMetalSeeds (Blocks.goldCrop, "gold_seeds", Blocks.metallicFarmland).setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemModMetalSeeds ironSeeds = (ItemModMetalSeeds) new ItemModMetalSeeds (Blocks.ironCrop, "iron_seeds", Blocks.metallicFarmland).setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemModMetalSeeds coalSeeds = (ItemModMetalSeeds) new ItemModMetalSeeds (Blocks.coalCrop, "coal_seeds", Blocks.metallicFarmland).setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemModMetalSeeds lapisSeeds = (ItemModMetalSeeds) new ItemModMetalSeeds (Blocks.lapisCrop, "lapis_seeds", Blocks.metallicFarmland).setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemModMetalSeeds diamondSeeds = (ItemModMetalSeeds) new ItemModMetalSeeds (Blocks.diamondCrop, "diamond_seeds", Blocks.metallicFarmland).setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemModMetalSeeds redstoneSeeds = (ItemModMetalSeeds) new ItemModMetalSeeds (Blocks.redstoneCrop, "redstone_seeds", Blocks.metallicFarmland).setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemModMetalSeeds emeraldSeeds = (ItemModMetalSeeds) new ItemModMetalSeeds (Blocks.emeraldCrop, "emerald_seeds", Blocks.metallicFarmland).setCreativeTab(CreativeTabs.MATERIALS);

	public static ItemMetalHoe metallicHoe = new ItemMetalHoe(ToolMaterial.IRON, "metallic_hoe").setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemModMetalSeeds metallicSeed = new ItemModMetalSeeds(Blocks.metallicCrop, "metallic_seeds", Blocks.metallicFarmland);
	public static ItemMetalicBase metallicIngot = (ItemMetalicBase) new ItemMetalicBase ("metallic_ingot").setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemMetalicBase metallicSmallPowder = (ItemMetalicBase) new ItemMetalicBase ("metallic_smallpowder").setCreativeTab(CreativeTabs.MATERIALS);
	public static ItemMetalicBase metallicRod = (ItemMetalicBase) new ItemMetalicBase ("metallic_rod").setCreativeTab(CreativeTabs.MATERIALS);

	public static void register(IForgeRegistry<Item> registry) {
		
		
		registry.registerAll(
				metallicRod,
				metallicSmallPowder,
				metallicIngot,
				goldSmallPowder,
				ironSmallPowder,
				coalSmallPowder,
				lapisSmallPowder,
				diamondSmallPowder,
				redstoneSmallPowder,
				emeraldSmallPowder,
				/*
				goldPowder,
				ironPowder,
				coalPowder,
				lapisPowder,
				diamondPowder,
				redstonePowder,
				emeraldPowder,
				*/
				goldSeeds,
				ironSeeds,
				coalSeeds,
				lapisSeeds,
				diamondSeeds,
				redstoneSeeds,
				emeraldSeeds,
				metallicHoe,
				metallicSeed
	
		);
	}
	
	public static void registerModels() {
		        metallicRod.registerItemModel();
		        metallicSmallPowder.registerItemModel();
		        metallicIngot.registerItemModel();
		        goldSmallPowder.registerItemModel();
		        ironSmallPowder.registerItemModel();
		        coalSmallPowder.registerItemModel();
		        lapisSmallPowder.registerItemModel();
		        diamondSmallPowder.registerItemModel();
		        redstoneSmallPowder.registerItemModel();
		        emeraldSmallPowder.registerItemModel();
		        /*
		        goldPowder.registerItemModel();
	        	ironPowder.registerItemModel();
		        coalPowder.registerItemModel();
	        	lapisPowder.registerItemModel();
	        	diamondPowder.registerItemModel();
	        	redstonePowder.registerItemModel();
	        	emeraldPowder.registerItemModel();
                */
		        goldSeeds.registerItemModel();
		        ironSeeds.registerItemModel();
		        coalSeeds.registerItemModel();
		        lapisSeeds.registerItemModel();
		        diamondSeeds.registerItemModel();
		        redstoneSeeds.registerItemModel();
		        emeraldSeeds.registerItemModel();

	            metallicHoe.registerItemModel();
	            metallicSeed.registerItemModel();

	}

}