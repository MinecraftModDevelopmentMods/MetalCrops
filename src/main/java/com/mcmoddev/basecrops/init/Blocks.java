package com.mcmoddev.basecrops.init;


import com.mcmoddev.basecrops.lib.BlockMetalCrop;
import com.mcmoddev.basecrops.lib.BlockMetalCrop2;
import com.mcmoddev.basecrops.lib.BlockMetalicFarmland2;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class Blocks {

    //BMe Tier 1
	public static BlockMetalCrop adamantineCrop;
	public static BlockMetalCrop antimonyCrop;
	public static BlockMetalCrop aquariumCrop;
	public static BlockMetalCrop bismuthCrop;	
	public static BlockMetalCrop copperCrop;
	public static BlockMetalCrop coldironCrop;
	public static BlockMetalCrop leadCrop;
	public static BlockMetalCrop nickelCrop;
	public static BlockMetalCrop mercuryCrop;
	public static BlockMetalCrop starsteelCrop;
	public static BlockMetalCrop tinCrop;
	public static BlockMetalCrop zincCrop;

	//BMe Vanilla
	public static BlockMetalCrop vanilla_charcoalCrop;
	public static BlockMetalCrop vanilla_coalCrop;	
	public static BlockMetalCrop vanilla_diamondCrop;
	public static BlockMetalCrop vanilla_goldCrop;
	public static BlockMetalCrop vanilla_ironCrop;	
	public static BlockMetalCrop vanilla_redstoneCrop;

    //BMe Tier 2 (To do)
	public static BlockMetalCrop brassCrop;
	public static BlockMetalCrop bronzeCrop;
	public static BlockMetalCrop cupronickelCrop;
	public static BlockMetalCrop electrumCrop;
	public static BlockMetalCrop invarCrop;
	public static BlockMetalCrop mithrilCrop;
	public static BlockMetalCrop pewterCrop;
	public static BlockMetalCrop platinumCrop;
	public static BlockMetalCrop silverCrop;
	public static BlockMetalCrop steelCrop;


	public static Block metallicFarmland;
	public static Block metallicOre;
	public static BlockMetalCrop2 metallicCrop;
	
	public static BlockMetalCrop2 goldCrop;
	public static BlockMetalCrop2 ironCrop;
	public static BlockMetalCrop2 coalCrop;
	public static BlockMetalCrop2 lapisCrop;
	public static BlockMetalCrop2 diamondCrop;
	public static BlockMetalCrop2 redstoneCrop;
	public static BlockMetalCrop2 emeraldCrop;



    // To do
	public static BlockMetalCrop modernmetalsCrop;
	public static BlockMetalCrop utilitybaseoresCrop;

	public static void initBlocks() {
		
	    GameRegistry.registerBlock(metallicFarmland = new BlockMetalicFarmland2("metallic_farmland").setLightLevel(1.0f), "metallic_farmland");
	    GameRegistry.registerBlock(metallicOre = new BlockMetalicFarmland2("metallic_ore").setLightLevel(1.0f), "metallic_ore");
	    metallicCrop = new BlockMetalCrop2("metallic_crop", "metallic_smallpowder", "metallic_seeds");
	    
	    goldCrop = new BlockMetalCrop2("gold_crop", "gold_smallpowder", "gold_seeds");
	    ironCrop = new BlockMetalCrop2("iron_crop", "iron_smallpowder", "iron_seeds");
	    coalCrop = new BlockMetalCrop2("coal_crop", "coal_smallpowder", "coal_seeds");
	    lapisCrop = new BlockMetalCrop2("lapis_crop", "lapis_smallpowder", "lapis_seeds");
	    diamondCrop = new BlockMetalCrop2("diamond_crop", "diamond_smallpowder", "diamon_seeds");
	    redstoneCrop = new BlockMetalCrop2("redstone_crop", "redstone_smallpowder", "redstone_seeds");
	    emeraldCrop = new BlockMetalCrop2("emerald_crop", "emerald_smallpowder", "emerald_seeds");


	}
	
	@Optional.Method(modid="basemetals")
	public static void initBMe() {

		//antimonyCrop = new BlockMetalCrop("antimony_crop", "antimony_powder", "antimony_seeds");
		adamantineCrop = new BlockMetalCrop("adamantine_crop", "adamantine_smallpowder", "adamantine_seeds");
		aquariumCrop = new BlockMetalCrop("aquarium_crop", "aquarium_smallpowder", "aquarium_seeds");
		//bismuthCrop = new BlockMetalCrop("bismuth_crop", "bismuth_powder", "bismuth_seeds");
		copperCrop = new BlockMetalCrop("copper_crop", "copper_smallpowder", "copper_seeds");
		coldironCrop = new BlockMetalCrop("coldiron_crop", "coldiron_smallpowder", "coldiron_seeds");
		leadCrop = new BlockMetalCrop("lead_crop", "lead_smallpowder", "lead_seeds");
		nickelCrop = new BlockMetalCrop("nickel_crop", "nickel_smallpowder", "nickel_seeds");
		mercuryCrop = new BlockMetalCrop("mercury_crop", "mercury_smallpowder", "mercury_seeds");
		starsteelCrop = new BlockMetalCrop("starsteel_crop", "starsteel_smallpowder", "starsteel_seeds");
		tinCrop = new BlockMetalCrop("tin_crop", "tin_smallpowder", "tin_seeds");
		zincCrop = new BlockMetalCrop("zinc_crop", "zinc_smallpowder", "zinc_seeds");
		
		/**
		vanilla_charcoalCrop = new BlockMetalCrop("vanilla_charcoal_crop", "vanilla_charcoal_smallpowder", "vanilla_charcoal_seeds");
		vanilla_coalCrop = new BlockMetalCrop("vanilla_coal_crop", "vanilla_coal_smallpowder", "vanilla_coal_seeds");
		vanilla_diamondCrop = new BlockMetalCrop("vanilla_diamond_crop", "vanilla_diamond_smallpowder", "vanilla_diamond_seeds");
		vanilla_goldCrop = new BlockMetalCrop("vanilla_gold_crop", "vanilla_gold_smallpowder", "vanilla_gold_seeds");
		vanilla_ironCrop = new BlockMetalCrop("vanilla_iron_crop", "vanilla_iron_smallpowder", "vanilla_iron_seeds");
		vanilla_redstoneCrop = new BlockMetalCrop("vanilla_redstone_crop", "vanilla_redstone_smallpowder", "vanilla_redstone_seeds");
**/
		}
	/**
	@Optional.Method(modid="baseminerals")
	public static void initBMe2() {
		basemineralsCrop = new BlockMetalCrop("baseminerals_crop", "baseminerals_powder", "baseminerals_seed");
	    }
	
	@Optional.Method(modid="fantasymetals")
		public static void initFMe() {
		copperCrop = new BlockMetalCrop("copper_crop", "copper_powder", "copper_seed");
	//
	}	
	
	@Optional.Method(modid="modernmetals")
	public static void initMMe() {
		modernmetalsCrop = new BlockMetalCrop("modernmetals_crop", "modernmetals_powder", "modernmetals_seed");
	//
	}
	
	@Optional.Method(modid="utilitybaseores")
	public static void initUBOe() {
		utilitybaseoresCrop = new BlockMetalCrop("utilitybaseores_crop", "utilitybaseores_powder", "utilitybaseores_seed");
//	
	}
**/
	@SideOnly(Side.CLIENT)
	public static void initModels(){
		
		metallicCrop.initModel();
		goldCrop.initModel();
		ironCrop.initModel();
		coalCrop.initModel();
		lapisCrop.initModel();
		diamondCrop.initModel();
		redstoneCrop.initModel();
		emeraldCrop.initModel();

		}	
	@SideOnly(Side.CLIENT)
	public static void initModelsBMe(){
		if (Loader.isModLoaded("basemetals"))
		{
		//antimonyCrop.initModel();
		adamantineCrop.initModel();
		aquariumCrop.initModel();
		//bismuthCrop.initModel();
		copperCrop.initModel();
		coldironCrop.initModel();
		leadCrop.initModel();
		nickelCrop.initModel();
		mercuryCrop.initModel();
		starsteelCrop.initModel();
		tinCrop.initModel();
		zincCrop.initModel();
		/**
		vanilla_charcoalCrop.initModel();
		vanilla_coalCrop.initModel();
		vanilla_diamondCrop.initModel();
		vanilla_goldCrop.initModel();
		vanilla_ironCrop.initModel();
		vanilla_redstoneCrop.initModel();
		**/
		
		}
	
//
		}
		
		/**
		if (Loader.isModLoaded("modernmetals"))
		{
		modernmetalsCrop.initModel();
//
		}
		if (Loader.isModLoaded("utilitybaseores"))
		{
		utilitybaseoresCrop.initModel();
//
		}
		
**/
		
	
	
	
}
