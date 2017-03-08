package com.mcmoddev.basecrops.init;



import com.mcmoddev.basecrops.BaseCrops;
import com.mcmoddev.basecrops.lib.BlockMetalCrop;
import com.mcmoddev.basecrops.lib.BlockMetalCrop2;
import com.mcmoddev.basecrops.lib.ItemMetalHoe;
import com.mcmoddev.basecrops.lib.ItemMetalSeeds;
import com.mcmoddev.basecrops.lib.ItemMetalSeeds2;
import com.mcmoddev.basecrops.lib.ItemMetalic;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;

public class Items {
	
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
	public static Item goldSmallPowder;
	public static Item ironSmallPowder;
	public static Item coalSmallPowder;
	public static Item lapisSmallPowder;
	public static Item diamondSmallPowder;
	public static Item redstoneSmallPowder;
	public static Item emeraldSmallPowder;

	public static Item goldPowder;
	public static Item ironPowder;
	public static Item coalPowder;
	public static Item lapisPowder;
	public static Item diamondPowder;
	public static Item redstonePowder;
	public static Item emeraldPowder;
	public static Item metallicPowder;
	public static Item metallicSmallPowder;
	public static Item metallicIngot;
	public static Item metallicRod;
	public static Item metallicSeeds;
	public static Item metallicHoe;
	public static Item adamantineSeeds;
	//public static Item antimonySeeds;
	public static Item aquariumSeeds;
	//public static Item bismuthSeeds;
	public static Item copperSeeds;
	public static Item coldironSeeds;
	public static Item leadSeeds;
	public static Item nickelSeeds;
	public static Item mercurySeeds;
	public static Item starsteelSeeds;
	public static Item tinSeeds;
	public static Item zincSeeds;
	
	public static Item goldSeeds;
	public static Item ironSeeds;
	public static Item coalSeeds;
	public static Item lapisSeeds;
	public static Item diamondSeeds;
	public static Item redstoneSeeds;
	public static Item emeraldSeeds;

	public static HashMap<BlockMetalCrop, Item> seedsMap = new HashMap<BlockMetalCrop, Item>();
	public static HashMap<BlockMetalCrop2, Item> seedsMap2 = new HashMap<BlockMetalCrop2, Item>();

	public static void initItems() {
		//BMe Tier 1
		
		goldPowder = registerItemsMetalic("gold_powder");
		ironPowder = registerItemsMetalic("iron_powder");
		coalPowder = registerItemsMetalic("coal_powder");
		lapisPowder = registerItemsMetalic("lapis_powder");
		diamondPowder = registerItemsMetalic("diamond_powder");
		redstonePowder = registerItemsMetalic("redstone_powder");
		emeraldPowder = registerItemsMetalic("emerald_powder");

		
		adamantineSmallPowder = registerItemsMetalic("adamantine_smallpowder");
		aquariumSmallPowder = registerItemsMetalic("aquarium_smallpowder");
		copperSmallPowder = registerItemsMetalic("copper_smallpowder");
		coldironSmallPowder = registerItemsMetalic("coldiron_smallpowder");
		leadSmallPowder = registerItemsMetalic("lead_smallpowder");
		nickelSmallPowder = registerItemsMetalic("nickel_smallpowder");
		mercurySmallPowder = registerItemsMetalic("mercury_smallpowder");
		starsteelSmallPowder = registerItemsMetalic("starsteel_smallpowder");
		tinSmallPowder = registerItemsMetalic("tin_smallpowder");
		zincSmallPowder = registerItemsMetalic("zinc_smallpowder");
		goldSmallPowder = registerItemsMetalic("gold_smallpowder");
		ironSmallPowder = registerItemsMetalic("iron_smallpowder");
		coalSmallPowder = registerItemsMetalic("coal_smallpowder");
		lapisSmallPowder = registerItemsMetalic("lapis_smallpowder");
		diamondSmallPowder = registerItemsMetalic("diamond_smallpowder");
		redstoneSmallPowder = registerItemsMetalic("redstone_smallpowder");
		emeraldSmallPowder = registerItemsMetalic("emerald_smallpowder");
		
		metallicPowder = registerItemsMetalic("metallic_powder");

		metallicSmallPowder = registerItemsMetalic("metallic_smallpowder");
		metallicIngot = registerItemsMetalic("metallic_ingot");
		metallicRod = registerItemsMetalic("metallic_rod");
		metallicHoe = registerItems("metallic_hoe", ToolMaterial.IRON);
		metallicSeeds = registerSeeds2("metallic_seeds", Blocks.metallicCrop, Blocks.metallicFarmland);
		
		
		goldSeeds = registerSeeds2("gold_seeds", Blocks.goldCrop, Blocks.metallicFarmland);
		ironSeeds = registerSeeds2("iron_seeds", Blocks.ironCrop, Blocks.metallicFarmland);
		coalSeeds = registerSeeds2("coal_seeds", Blocks.coalCrop, Blocks.metallicFarmland);
		lapisSeeds = registerSeeds2("lapis_seeds", Blocks.lapisCrop, Blocks.metallicFarmland);
		diamondSeeds = registerSeeds2("diamond_seeds", Blocks.diamondCrop, Blocks.metallicFarmland);
		redstoneSeeds = registerSeeds2("redstone_seeds", Blocks.redstoneCrop, Blocks.metallicFarmland);
		emeraldSeeds = registerSeeds2("emerald_seeds", Blocks.emeraldCrop, Blocks.metallicFarmland);

		}
	
	@Optional.Method(modid="basemetals")
	public static void initBMe() {
		//BMe Tier 1
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
		/**
		vanilla_charcoalSeeds = registerSeeds("vanilla_charcoal_seeds", Blocks.vanilla_charcoalCrop, Blocks.metalicFarmland);
		vanilla_coalSeeds = registerSeeds("vanilla_coal_seeds", Blocks.vanilla_coalCrop, Blocks.metalicFarmland);
		vanilla_diamondSeeds = registerSeeds("vanilla_diamond_seeds", Blocks.vanilla_diamondCrop, Blocks.metalicFarmland);
		vanilla_goldSeeds = registerSeeds("vanilla_gold_seeds", Blocks.vanilla_goldCrop, Blocks.metalicFarmland);
		vanilla_ironSeeds = registerSeeds("vanilla_iron_seeds", Blocks.vanilla_ironCrop, Blocks.metalicFarmland);
		vanilla_redstoneSeeds = registerSeeds("vanilla_redstone_seeds", Blocks.vanilla_redstoneCrop, Blocks.metalicFarmland);
**/

		}
	public static Item registerItemsMetalic(String name) {
		ItemMetalic item = new ItemMetalic (name);
		item.setRegistryName(name);
		item.setUnlocalizedName(BaseCrops.MODID + "." + name);
		return GameRegistry.register(item);
	}
	public static Item registerItems(String name, ToolMaterial material) {
		ItemMetalHoe item = new ItemMetalHoe (material, name);
		item.setRegistryName(name);
		item.setUnlocalizedName(BaseCrops.MODID + "." + name);
		return GameRegistry.register(item);
	}
	
	public static Item registerSeeds(String name, Block crop, Block soil) {
		ItemMetalSeeds item = new ItemMetalSeeds (crop, name, soil);
		seedsMap.put((BlockMetalCrop) crop, item);
		item.setRegistryName(name);
		item.setUnlocalizedName(BaseCrops.MODID + "." + name);
		return GameRegistry.register(item);
		
	}
	public static Item registerSeeds2(String name, Block crop, Block soil) {
		ItemMetalSeeds2 item = new ItemMetalSeeds2 (crop, name, soil);
		seedsMap2.put((BlockMetalCrop2) crop, item);
		item.setRegistryName(name);
		item.setUnlocalizedName(BaseCrops.MODID + "." + name);
		return GameRegistry.register(item);
		
	}
}
