package com.mcmoddev.metalliccrops.init;


import com.mcmoddev.metalliccrops.lib.BlockMetalCrop;
import com.mcmoddev.metalliccrops.lib.BlockMetalicBase;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Blocks {
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
	public static BlockMetalCrop vanilla_charcoalCrop;
	public static BlockMetalCrop vanilla_coalCrop;	
	public static BlockMetalCrop vanilla_diamondCrop;
	public static BlockMetalCrop vanilla_goldCrop;
	public static BlockMetalCrop vanilla_ironCrop;	
	public static BlockMetalCrop vanilla_redstoneCrop;
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
	public static BlockMetalCrop metallicCrop;
	public static BlockMetalCrop goldCrop;
	public static BlockMetalCrop ironCrop;
	public static BlockMetalCrop coalCrop;
	public static BlockMetalCrop lapisCrop;
	public static BlockMetalCrop diamondCrop;
	public static BlockMetalCrop redstoneCrop;
	public static BlockMetalCrop emeraldCrop;

	public static void initBlocks() {
		
	    GameRegistry.registerBlock(metallicFarmland = new BlockMetalicBase("metallic_farmland").setLightLevel(1.0f), "metallic_farmland");
	    GameRegistry.registerBlock(metallicOre = new BlockMetalicBase("metallic_ore").setLightLevel(1.0f), "metallic_ore");
	    metallicCrop = new BlockMetalCrop("metallic_crop", "metallic_smallpowder", "metallic_seeds");
	    goldCrop = new BlockMetalCrop("gold_crop", "gold_smallpowder", "gold_seeds");
	    ironCrop = new BlockMetalCrop("iron_crop", "iron_smallpowder", "iron_seeds");
	    coalCrop = new BlockMetalCrop("coal_crop", "coal_smallpowder", "coal_seeds");
	    lapisCrop = new BlockMetalCrop("lapis_crop", "lapis_smallpowder", "lapis_seeds");
	    diamondCrop = new BlockMetalCrop("diamond_crop", "diamond_smallpowder", "diamon_seeds");
	    redstoneCrop = new BlockMetalCrop("redstone_crop", "redstone_smallpowder", "redstone_seeds");
	    emeraldCrop = new BlockMetalCrop("emerald_crop", "emerald_smallpowder", "emerald_seeds");
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
		}
	
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

		}
		}

}
