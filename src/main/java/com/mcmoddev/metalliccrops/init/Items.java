package com.mcmoddev.metalliccrops.init;

import com.mcmoddev.metalliccrops.MetallicCrops;
import com.mcmoddev.metalliccrops.lib.BlockMetalCrop;
import com.mcmoddev.metalliccrops.lib.ItemMetalHoe;
import com.mcmoddev.metalliccrops.lib.ItemMetalicBase;
import com.mcmoddev.metalliccrops.lib.ItemModMetalSeeds;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.common.registry.GameRegistry;
import java.util.HashMap;

public class Items {
	
	// Metallic Crops General
	public static Item metallicIngot;
	public static Item metallicRod;
	public static Item metallicSeeds;
	public static Item metallicHoe;
	
	// Metallic Crops Seeds
	public static Item goldSeeds;
	public static Item ironSeeds;
	public static Item coalSeeds;
	public static Item lapisSeeds;
	public static Item diamondSeeds;
	public static Item redstoneSeeds;
	public static Item emeraldSeeds;
	
	// Metallic Small Powder
	public static Item goldSmallPowder;
	public static Item ironSmallPowder;
	public static Item coalSmallPowder;
	public static Item lapisSmallPowder;
	public static Item diamondSmallPowder;
	public static Item redstoneSmallPowder;
	public static Item emeraldSmallPowder;
	public static Item metallicSmallPowder;
	
	// Metallic Crops Powder
	public static Item goldPowder;
	public static Item ironPowder;
	public static Item coalPowder;
	public static Item lapisPowder;
	public static Item diamondPowder;
	public static Item redstonePowder;
	public static Item emeraldPowder;
	public static Item metallicPowder;
	
    // Base Metals Small Powder
	public static Item adamantineSmallPowder;
	public static Item aquariumSmallPowder;
	public static Item copperSmallPowder;
	public static Item coldironSmallPowder;
	public static Item leadSmallPowder;
	public static Item nickelSmallPowder;
	public static Item mercurySmallPowder;
	public static Item starsteelSmallPowder;
	public static Item tinSmallPowder;
	public static Item zincSmallPowder;

	// Base Metals Seeds
	public static Item adamantineSeeds;
	public static Item antimonySeeds;
	public static Item aquariumSeeds;
	public static Item bismuthSeeds;
	public static Item copperSeeds;
	public static Item coldironSeeds;
	public static Item leadSeeds;
	public static Item nickelSeeds;
	public static Item mercurySeeds;
	public static Item starsteelSeeds;
	public static Item tinSeeds;
	public static Item zincSeeds;
	
	// Modern Metals Seeds
	public static Item aluminumSeeds;
	public static Item cadmiumSeeds;
	public static Item chromiumSeeds;
	public static Item iridiumSeeds;
	public static Item magnesiumSeeds;
	public static Item manganeseSeeds;
	public static Item osmiumSeeds;
	public static Item plutoniumSeeds;
	public static Item rutileSeeds;
	public static Item tantalumSeeds;
	public static Item tungstenSeeds;
	public static Item uraniumSeeds;
	public static Item zirconiumSeeds;


	// Modern Metals Small Powder
	public static Item aluminumSmallPowder;
	public static Item cadmiumSmallPowder;
	public static Item chromiumSmallPowder;
	public static Item iridiumSmallPowder;
	public static Item magnesiumSmallPowder;
	public static Item manganeseSmallPowder;
	public static Item osmiumSmallPowder;
	public static Item plutoniumSmallPowder;
	public static Item rutileSmallPowder;
	public static Item tantalumSmallPowder;
	public static Item tungstenSmallPowder;
	public static Item uraniumSmallPowder;
	public static Item zirconiumSmallPowder;

	// Utility Base Ores Seeds
	public static Item featherSeeds;
	public static Item boneSeeds;
	public static Item rottenSeeds;
	public static Item gunpowderSeeds;
	public static Item prismarineSeeds;
	public static Item enderSeeds;
	public static Item slimeSeeds;
	public static Item flintSeeds;
	public static Item carrotSeeds;
	public static Item melonSeeds;
	public static Item potatoSeeds;
	public static Item chickenSeeds;
	public static Item beefSeeds;
	public static Item porkchopSeeds;
	public static Item fishSeeds;

	// Utility Base Ores Small Powder
	public static Item featherSmallPowder;
	public static Item boneSmallPowder;
	public static Item rottenSmallPowder;
	public static Item gunpowderSmallPowder;
	public static Item prismarineSmallPowder;
	public static Item enderSmallPowder;
	public static Item slimeSmallPowder;
	public static Item flintSmallPowder;
	public static Item carrotSmallPowder;
	public static Item melonSmallPowder;
	public static Item potatoSmallPowder;
	public static Item chickenSmallPowder;
	public static Item beefSmallPowder;
	public static Item porkchopSmallPowder;
	public static Item fishSmallPowder;

	public static HashMap<BlockMetalCrop, Item> seedsMap = new HashMap<BlockMetalCrop, Item>();
	public static void initItems() {
		
		// Metallic Crops Items
		metallicPowder = registerItems("metallic_powder");
		metallicSmallPowder = registerItems("metallic_smallpowder");
		metallicIngot = registerItems("metallic_ingot");
		metallicRod = registerItems("metallic_rod");
		metallicHoe = registerItemsHoe("metallic_hoe", ToolMaterial.IRON);
		metallicSeeds = registerSeeds("metallic_seeds", Blocks.metallicCrop, Blocks.metallicFarmland);
		// Vanilla Seeds
		goldPowder = registerItems("gold_powder");
		ironPowder = registerItems("iron_powder");
		coalPowder = registerItems("coal_powder");
		lapisPowder = registerItems("lapis_powder");
		diamondPowder = registerItems("diamond_powder");
		redstonePowder = registerItems("redstone_powder");
		emeraldPowder = registerItems("emerald_powder");
        // Vanilla Powder
		goldSmallPowder = registerItems("gold_smallpowder");
		ironSmallPowder = registerItems("iron_smallpowder");
		coalSmallPowder = registerItems("coal_smallpowder");
		lapisSmallPowder = registerItems("lapis_smallpowder");
		diamondSmallPowder = registerItems("diamond_smallpowder");
		redstoneSmallPowder = registerItems("redstone_smallpowder");
		emeraldSmallPowder = registerItems("emerald_smallpowder");
		// Vanilla Seeds
		goldSeeds = registerSeeds("gold_seeds", Blocks.goldCrop, Blocks.metallicFarmland);
		ironSeeds = registerSeeds("iron_seeds", Blocks.ironCrop, Blocks.metallicFarmland);
		coalSeeds = registerSeeds("coal_seeds", Blocks.coalCrop, Blocks.metallicFarmland);
		lapisSeeds = registerSeeds("lapis_seeds", Blocks.lapisCrop, Blocks.metallicFarmland);
		diamondSeeds = registerSeeds("diamond_seeds", Blocks.diamondCrop, Blocks.metallicFarmland);
		redstoneSeeds = registerSeeds("redstone_seeds", Blocks.redstoneCrop, Blocks.metallicFarmland);
		emeraldSeeds = registerSeeds("emerald_seeds", Blocks.emeraldCrop, Blocks.metallicFarmland);

		}
	
	@Optional.Method(modid="basemetals")
	public static void initBMe() {
		// BMe Small Powder
		adamantineSmallPowder = registerItems("adamantine_smallpowder");
		aquariumSmallPowder = registerItems("aquarium_smallpowder");
		copperSmallPowder = registerItems("copper_smallpowder");
		coldironSmallPowder = registerItems("coldiron_smallpowder");
		leadSmallPowder = registerItems("lead_smallpowder");
		nickelSmallPowder = registerItems("nickel_smallpowder");
		mercurySmallPowder = registerItems("mercury_smallpowder");
		starsteelSmallPowder = registerItems("starsteel_smallpowder");
		tinSmallPowder = registerItems("tin_smallpowder");
		zincSmallPowder = registerItems("zinc_smallpowder");
		// BMe Seeds
		adamantineSeeds = registerSeeds("adamantine_seeds", Blocks.adamantineCrop, Blocks.metallicFarmland);
		//antimonySeeds = registerSeeds("antimony_seeds", Blocks.antimonyCrop, Blocks.metallicFarmland);
		aquariumSeeds = registerSeeds("aquarium_seeds", Blocks.aquariumCrop, Blocks.metallicFarmland);
		//bismuthSeeds = registerSeeds("bismuth_seeds", Blocks.bismuthCrop, Blocks.metallicFarmland);
		copperSeeds = registerSeeds("copper_seeds", Blocks.copperCrop, Blocks.metallicFarmland);
		coldironSeeds = registerSeeds("coldiron_seeds", Blocks.coldironCrop, Blocks.metallicFarmland);
		leadSeeds = registerSeeds("lead_seeds", Blocks.leadCrop, Blocks.metallicFarmland);
		nickelSeeds = registerSeeds("nickel_seeds", Blocks.nickelCrop, Blocks.metallicFarmland);
		mercurySeeds = registerSeeds("mercury_seeds", Blocks.mercuryCrop, Blocks.metallicFarmland);
		starsteelSeeds = registerSeeds("starsteel_seeds", Blocks.starsteelCrop, Blocks.metallicFarmland);
		tinSeeds = registerSeeds("tin_seeds", Blocks.tinCrop, Blocks.metallicFarmland);
		zincSeeds = registerSeeds("zinc_seeds", Blocks.zincCrop, Blocks.metallicFarmland);
		}

	@Optional.Method(modid="modernmetals")
	public static void initMMe() {
		
		// MMe Small Powder
		aluminumSmallPowder = registerItems("aluminum_smallpowder");
		cadmiumSmallPowder = registerItems("cadmium_smallpowder");
		chromiumSmallPowder = registerItems("chromium_smallpowder");
		iridiumSmallPowder = registerItems("iridium_smallpowder");
		magnesiumSmallPowder = registerItems("magnesium_smallpowder");
		manganeseSmallPowder = registerItems("manganese_smallpowder");
		osmiumSmallPowder = registerItems("osmium_smallpowder");
		plutoniumSmallPowder = registerItems("plutonium_smallpowder");
		rutileSmallPowder = registerItems("rutile_smallpowder");
		tantalumSmallPowder = registerItems("tantalum_smallpowder");
		tungstenSmallPowder = registerItems("tungsten_smallpowder");
		uraniumSmallPowder = registerItems("uranium_smallpowder");
		zirconiumSmallPowder = registerItems("zirconium_smallpowder");

		// MMe Seeds
		aluminumSeeds = registerSeeds("aluminum_seeds", Blocks.aluminumCrop, Blocks.metallicFarmland);
		cadmiumSeeds = registerSeeds("cadmium_seeds", Blocks.cadmiumCrop, Blocks.metallicFarmland);
		chromiumSeeds = registerSeeds("chromium_seeds", Blocks.chromiumCrop, Blocks.metallicFarmland);
		iridiumSeeds = registerSeeds("iridium_seeds", Blocks.iridiumCrop, Blocks.metallicFarmland);
		magnesiumSeeds = registerSeeds("magnesium_seeds", Blocks.magnesiumCrop, Blocks.metallicFarmland);
		manganeseSeeds = registerSeeds("manganese_seeds", Blocks.manganeseCrop, Blocks.metallicFarmland);
		osmiumSeeds = registerSeeds("osmium_seeds", Blocks.osmiumCrop, Blocks.metallicFarmland);
		plutoniumSeeds = registerSeeds("plutonium_seeds", Blocks.plutoniumCrop, Blocks.metallicFarmland);
		rutileSeeds = registerSeeds("rutile_seeds", Blocks.rutileCrop, Blocks.metallicFarmland);
		tantalumSeeds = registerSeeds("tantalum_seeds", Blocks.tantalumCrop, Blocks.metallicFarmland);
		tungstenSeeds = registerSeeds("tungsten_seeds", Blocks.tungstenCrop, Blocks.metallicFarmland);
		uraniumSeeds = registerSeeds("uranium_seeds", Blocks.uraniumCrop, Blocks.metallicFarmland);
		zirconiumSeeds = registerSeeds("zirconium_seeds", Blocks.zirconiumCrop, Blocks.metallicFarmland);}

	@Optional.Method(modid="utilitybaseores")
	public static void initUBO() {
		
		// Utility Base Ores Small Powder
		featherSmallPowder = registerItems("feather_smallpowder");
		boneSmallPowder = registerItems("bone_smallpowder");
		rottenSmallPowder = registerItems("rotten_smallpowder");
		gunpowderSmallPowder = registerItems("gunpowder_smallpowder");
		prismarineSmallPowder = registerItems("prismarine_smallpowder");
		enderSmallPowder = registerItems("ender_smallpowder");
		slimeSmallPowder = registerItems("slime_smallpowder");
		flintSmallPowder = registerItems("flint_smallpowder");
		carrotSmallPowder = registerItems("carrot_smallpowder");
		melonSmallPowder = registerItems("melon_smallpowder");
		potatoSmallPowder = registerItems("potato_smallpowder");
		chickenSmallPowder = registerItems("chicken_smallpowder");
		beefSmallPowder = registerItems("beef_smallpowder");
		porkchopSmallPowder = registerItems("porkchop_smallpowder");
		fishSmallPowder = registerItems("fish_smallpowder");

		// utility Base Ores Seeds
		featherSeeds = registerSeeds("feather_seeds", Blocks.featherCrop, Blocks.metallicFarmland);
		boneSeeds = registerSeeds("bone_seeds", Blocks.boneCrop, Blocks.metallicFarmland);
		rottenSeeds = registerSeeds("rotten_seeds", Blocks.rottenCrop, Blocks.metallicFarmland);
		gunpowderSeeds = registerSeeds("gunpowder_seeds", Blocks.gunpowderCrop, Blocks.metallicFarmland);
		prismarineSeeds = registerSeeds("prismarine_seeds", Blocks.prismarineCrop, Blocks.metallicFarmland);
		enderSeeds = registerSeeds("ender_seeds", Blocks.enderCrop, Blocks.metallicFarmland);
		slimeSeeds = registerSeeds("slime_seeds", Blocks.slimeCrop, Blocks.metallicFarmland);
		flintSeeds = registerSeeds("flint_seeds", Blocks.flintCrop, Blocks.metallicFarmland);
		carrotSeeds = registerSeeds("carrot_seeds", Blocks.carrotCrop, Blocks.metallicFarmland);
		melonSeeds = registerSeeds("melon_seeds", Blocks.melonCrop, Blocks.metallicFarmland);
		potatoSeeds = registerSeeds("potato_seeds", Blocks.potatoCrop, Blocks.metallicFarmland);
		chickenSeeds = registerSeeds("chicken_seeds", Blocks.chickenCrop, Blocks.metallicFarmland);
		beefSeeds = registerSeeds("beef_seeds", Blocks.beefCrop, Blocks.metallicFarmland);
		porkchopSeeds = registerSeeds("porkchop_seeds", Blocks.porkchopCrop, Blocks.metallicFarmland);
		fishSeeds = registerSeeds("fish_seeds", Blocks.fishCrop, Blocks.metallicFarmland);}
	
	public static Item registerItems(String name) {
		ItemMetalicBase item = new ItemMetalicBase (name);
		item.setRegistryName(name);
		item.setUnlocalizedName(MetallicCrops.MODID + "." + name);
		return GameRegistry.register(item);
	}
	
	public static Item registerItemsHoe(String name, ToolMaterial material) {
		ItemMetalHoe item = new ItemMetalHoe (material, name);
		item.setRegistryName(name);
		item.setUnlocalizedName(MetallicCrops.MODID + "." + name);
		return GameRegistry.register(item);
	}
	
	public static Item registerSeeds(String name, Block crop, Block soil) {
		ItemModMetalSeeds item = new ItemModMetalSeeds (crop, name, soil);
		seedsMap.put((BlockMetalCrop) crop, item);
		item.setRegistryName(name);
		item.setUnlocalizedName(MetallicCrops.MODID + "." + name);
		return GameRegistry.register(item);
		
	}
}
