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
	
	// Vanilla and Metallic Crops blocks (10 Blocks)
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
	
	// Utility Base Ores Compat (18 Blocks)
	public static BlockMetalCrop featherCrop;
	public static BlockMetalCrop boneCrop;
	public static BlockMetalCrop rottenCrop;
	public static BlockMetalCrop blazeCrop;
	public static BlockMetalCrop glowstoneCrop;
	public static BlockMetalCrop gunpowderCrop;
	public static BlockMetalCrop prismarineCrop;
	public static BlockMetalCrop enderCrop;
	public static BlockMetalCrop magmaCrop;
	public static BlockMetalCrop slimeCrop;
	public static BlockMetalCrop flintCrop;
	public static BlockMetalCrop carrotCrop;
	public static BlockMetalCrop melonCrop;
	public static BlockMetalCrop potatoCrop;
	public static BlockMetalCrop chickenCrop;
	public static BlockMetalCrop beefCrop;
	public static BlockMetalCrop porkchopCrop;
	public static BlockMetalCrop fishCrop;
	
    //BMe compat  (12 Blocks)
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

	//MMe Compat  (13 Blocks)
	public static BlockMetalCrop aluminumCrop;
	public static BlockMetalCrop cadmiumCrop;
	public static BlockMetalCrop chromiumCrop;
	public static BlockMetalCrop iridiumCrop;
	public static BlockMetalCrop magnesiumCrop;
	public static BlockMetalCrop manganeseCrop;
	public static BlockMetalCrop osmiumCrop;
	public static BlockMetalCrop plutoniumCrop;
	public static BlockMetalCrop rutileCrop;
	public static BlockMetalCrop tantalumCrop;
	public static BlockMetalCrop tungstenCrop;
	public static BlockMetalCrop uraniumCrop;
	public static BlockMetalCrop zirconiumCrop;

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
	    emeraldCrop = new BlockMetalCrop("emerald_crop", "emerald_smallpowder", "emerald_seeds");}
	
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
		zincCrop = new BlockMetalCrop("zinc_crop", "zinc_smallpowder", "zinc_seeds");}
	
	@Optional.Method(modid="modernmetals")
	public static void initMMe() {
		aluminumCrop = new BlockMetalCrop("aluminum_crop", "aluminum_smallpowder", "aluminum_seeds");
		cadmiumCrop = new BlockMetalCrop("cadmium_crop", "cadmium_smallpowder", "cadmium_seeds");
		chromiumCrop = new BlockMetalCrop("chromium_crop", "chromium_smallpowder", "chromium_seeds");
		iridiumCrop = new BlockMetalCrop("iridium_crop", "iridium_smallpowder", "iridium_seeds");
		magnesiumCrop = new BlockMetalCrop("magnesium_crop", "magnesium_smallpowder", "magnesium_seeds");
		manganeseCrop = new BlockMetalCrop("manganese_crop", "manganese_smallpowder", "manganese_seeds");
		osmiumCrop = new BlockMetalCrop("osmium_crop", "osmium_smallpowder", "osmium_seeds");
		plutoniumCrop = new BlockMetalCrop("plutonium_crop", "plutonium_smallpowder", "plutonium_seeds");
		rutileCrop = new BlockMetalCrop("rutile_crop", "rutile_smallpowder", "rutile_seeds");
		tantalumCrop = new BlockMetalCrop("tantalum_crop", "tantalum_smallpowder", "tantalum_seeds");
		tungstenCrop = new BlockMetalCrop("tungsten_crop", "tungsten_smallpowder", "tungsten_seeds");
		uraniumCrop = new BlockMetalCrop("uranium_crop", "uranium_smallpowder", "uranium_seeds");
		zirconiumCrop = new BlockMetalCrop("zirconium_crop", "zirconium_smallpowder", "zirconium_seeds");}
	
	@Optional.Method(modid="utilitybaseores")
	public static void initUBO() {
		featherCrop = new BlockMetalCrop("feather_crop", "feather_smallpowder", "feather_seeds");
		boneCrop = new BlockMetalCrop("bone_crop", "bone_smallpowder", "bone_seeds");
		rottenCrop = new BlockMetalCrop("rotten_crop", "rotten_smallpowder", "rotten_seeds");
		blazeCrop = new BlockMetalCrop("blaze_crop", "blaze_smallpowder", "blaze_seeds");
		glowstoneCrop = new BlockMetalCrop("glowstone_crop", "glowstone_smallpowder", "glowstone_seeds");
		gunpowderCrop = new BlockMetalCrop("gunpowder_crop", "gunpowder_smallpowder", "gunpowder_seeds");
		prismarineCrop = new BlockMetalCrop("prismarine_crop", "prismarine_smallpowder", "prismarine_seeds");
		enderCrop = new BlockMetalCrop("ender_crop", "ender_smallpowder", "ender_seeds");
		magmaCrop = new BlockMetalCrop("magma_crop", "magma_smallpowder", "magma_seeds");
		slimeCrop = new BlockMetalCrop("slime_crop", "slime_smallpowder", "slime_seeds");
		flintCrop = new BlockMetalCrop("flint_crop", "flint_smallpowder", "flint_seeds");
		carrotCrop = new BlockMetalCrop("carrot_crop", "carrot_smallpowder", "carrot_seeds");
		melonCrop = new BlockMetalCrop("melon_crop", "melon_smallpowder", "melon_seeds");
		potatoCrop = new BlockMetalCrop("potato_crop", "potato_smallpowder", "potato_seeds");
		chickenCrop = new BlockMetalCrop("chicken_crop", "chicken_smallpowder", "chicken_seeds");
		beefCrop = new BlockMetalCrop("beef_crop", "beef_smallpowder", "beef_seeds");
		porkchopCrop = new BlockMetalCrop("porkchop_crop", "porkchop_smallpowder", "porkchop_seeds");
		fishCrop = new BlockMetalCrop("fish_crop", "fish_smallpowder", "fish_seeds");}

	@SideOnly(Side.CLIENT)
	public static void initModels(){
		metallicCrop.initModel();
		goldCrop.initModel();
		ironCrop.initModel();
		coalCrop.initModel();
		lapisCrop.initModel();
		diamondCrop.initModel();
		redstoneCrop.initModel();
		emeraldCrop.initModel();}	
	
	@SideOnly(Side.CLIENT)
	public static void initModelsBMe(){
		if (Loader.isModLoaded("basemetals")){
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
		zincCrop.initModel();}}
	
	@SideOnly(Side.CLIENT)
	public static void initModelsMMe(){
		if (Loader.isModLoaded("modernmetals")){
		aluminumCrop.initModel();
		cadmiumCrop.initModel();
		chromiumCrop.initModel();
		iridiumCrop.initModel();
		magnesiumCrop.initModel();
		manganeseCrop.initModel();
		osmiumCrop.initModel();
		plutoniumCrop.initModel();
		rutileCrop.initModel();
		tantalumCrop.initModel();
		tungstenCrop.initModel();
		uraniumCrop.initModel();
		zirconiumCrop.initModel();}}
	
	@SideOnly(Side.CLIENT)
	public static void initModelsUBO(){
		if (Loader.isModLoaded("utilitybaseores")){
			featherCrop.initModel();
			boneCrop.initModel();
			rottenCrop.initModel();
			blazeCrop.initModel();
			glowstoneCrop.initModel();
			gunpowderCrop.initModel();
			prismarineCrop.initModel();
			enderCrop.initModel();
			magmaCrop.initModel();
			slimeCrop.initModel();
			flintCrop.initModel();
			carrotCrop.initModel();
			melonCrop.initModel();
			potatoCrop.initModel();
			chickenCrop.initModel();
			beefCrop.initModel();
			porkchopCrop.initModel();
			fishCrop.initModel();}}

}
