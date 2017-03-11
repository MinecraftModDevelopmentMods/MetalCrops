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
	public static Item goldSeeds;
	public static Item ironSeeds;
	public static Item coalSeeds;
	public static Item lapisSeeds;
	public static Item diamondSeeds;
	public static Item redstoneSeeds;
	public static Item emeraldSeeds;
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
