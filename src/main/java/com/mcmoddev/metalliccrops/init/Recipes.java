package com.mcmoddev.metalliccrops.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class Recipes {
	
	public static void initRecipes() {
	
        // Base
		GameRegistry.addSmelting(Blocks.metallicOre, new ItemStack(Items.metallicIngot, 1), 1.0f);
		GameRegistry.addRecipe(new ItemStack(Items.metallicHoe), "PP ", " 1 ", " 1 ", 'P', Items.metallicIngot, '1', Items.metallicRod);
		GameRegistry.addRecipe(new ItemStack(Items.metallicRod), "   ", " 1 ", " 1 ", 'P', Items.adamantineSeeds, '1', Items.metallicIngot);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.metallicSmallPowder, 9),new ItemStack(Items.metallicIngot, 1));
		GameRegistry.addSmelting(Items.metallicIngot, new ItemStack(Items.metallicPowder), 1.0f);

        // 1 Ingot = 9 small powder
		GameRegistry.addShapelessRecipe(new ItemStack(Items.goldSmallPowder, 9),new ItemStack( net.minecraft.init.Items.GOLD_INGOT, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.coalSmallPowder, 9),new ItemStack( net.minecraft.init.Items.COAL, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ironSmallPowder, 9),new ItemStack( net.minecraft.init.Items.IRON_INGOT, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.lapisSmallPowder, 9),new ItemStack( net.minecraft.init.Items.DYE, 1, 4));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.diamondSmallPowder, 9),new ItemStack( net.minecraft.init.Items.DIAMOND, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.redstoneSmallPowder, 9),new ItemStack( net.minecraft.init.Items.REDSTONE, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.emeraldSmallPowder, 9),new ItemStack( net.minecraft.init.Items.EMERALD, 1));
       
		// 9 small powder = 1 Ingot (Shaped)
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Items.GOLD_INGOT,1 ), "111", "111", "111", '1',Items.goldSmallPowder );
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Items.COAL,1 ), "111", "111", "111", '1',Items.coalSmallPowder );
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Items.IRON_INGOT,1 ), "111", "111", "111", '1',Items.ironSmallPowder );
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Items.DYE ,1 ,4 ), "111", "111", "111", '1',Items.lapisSmallPowder );
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Items.DIAMOND,1 ), "111", "111", "111", '1',Items.diamondSmallPowder );
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Items.REDSTONE,1 ), "111", "111", "111", '1',Items.redstoneSmallPowder );
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Items.EMERALD,1 ), "111", "111", "111", '1',Items.emeraldSmallPowder );

		
        // Base Powder
		GameRegistry.addSmelting(net.minecraft.init.Items.GOLD_INGOT, new ItemStack(Items.goldPowder, 1), 1.0f);
		GameRegistry.addSmelting(net.minecraft.init.Items.COAL, new ItemStack(Items.coalPowder, 1), 1.0f);
		GameRegistry.addSmelting(net.minecraft.init.Items.IRON_INGOT, new ItemStack(Items.ironPowder, 1), 1.0f);
		GameRegistry.addSmelting(new ItemStack(net.minecraft.init.Items.DYE, 1, 4), new ItemStack(Items.lapisPowder, 1), 1.0f);
		GameRegistry.addSmelting(net.minecraft.init.Items.DIAMOND, new ItemStack(Items.diamondPowder, 1), 1.0f);
		GameRegistry.addSmelting(net.minecraft.init.Items.REDSTONE, new ItemStack(Items.redstonePowder, 1), 1.0f);
		GameRegistry.addSmelting(net.minecraft.init.Items.EMERALD, new ItemStack(Items.emeraldPowder, 1), 1.0f);
		
		// Base Seeds
		GameRegistry.addRecipe(new ItemStack(Items.metallicSeeds), "111", "1P1", "111", '1', Items.metallicPowder, 'P',  net.minecraft.init.Items.WHEAT_SEEDS);
		GameRegistry.addRecipe(new ItemStack(Items.goldSeeds), "1M1", "MPM", "1M1", '1', Items.goldPowder, 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.ironSeeds), "1M1", "MPM", "1M1", '1', Items.ironPowder, 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.coalSeeds), "1M1", "MPM", "1M1", '1', Items.coalPowder, 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.lapisSeeds), "1M1", "MPM", "1M1", '1', Items.lapisPowder, 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.diamondSeeds), "1M1", "MPM", "1M1", '1', Items.diamondPowder, 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.redstoneSeeds), "1M1", "MPM", "1M1", '1', Items.redstonePowder, 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.emeraldSeeds), "1M1", "MPM", "1M1", '1', Items.emeraldPowder, 'P', Items.metallicSeeds, 'M', Items.metallicPowder);

	}
	
	@Optional.Method(modid = "basemetals")
	public static void initBMe() {
		// Base Metals Seeds
		GameRegistry.addRecipe(new ItemStack(Items.adamantineSeeds), "1M1", "MPM", "1M1", '1', Item.getByNameOrId("basemetals:adamantine_powder"), 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.aquariumSeeds), "1M1", "MPM", "1M1", '1', Item.getByNameOrId("basemetals:aquarium_powder"), 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.copperSeeds), "1M1", "MPM", "1M1", '1', Item.getByNameOrId("basemetals:copper_powder"), 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.coldironSeeds), "1M1", "MPM", "1M1", '1', Item.getByNameOrId("basemetals:coldiron_powder"), 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.leadSeeds), "1M1", "MPM", "1M1", '1', Item.getByNameOrId("basemetals:lead_powder"), 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.nickelSeeds), "1M1", "MPM", "1M1", '1', Item.getByNameOrId("basemetals:nickel_powder"), 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.mercurySeeds), "1M1", "MPM", "1M1", '1', Item.getByNameOrId("basemetals:starsteel_powder"), 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.starsteelSeeds), "1M1", "MPM", "1M1", '1', Item.getByNameOrId("basemetals:starsteel_powder"), 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.tinSeeds), "1M1", "MPM", "1M1", '1', Item.getByNameOrId("basemetals:tin_powder"), 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.zincSeeds), "1M1", "MPM", "1M1", '1', Item.getByNameOrId("basemetals:zinc_powder"), 'P', Items.metallicSeeds, 'M', Items.metallicPowder);

		// Small Powder Shaped
		GameRegistry.addRecipe(new ItemStack(Item.getByNameOrId("basemetals:adamantine_ingot"),1 ), "111", "111", "111", '1',Items.adamantineSmallPowder );
		GameRegistry.addRecipe(new ItemStack(Item.getByNameOrId("basemetals:aquarium_ingot"),1 ), "111", "111", "111", '1',Items.aquariumSmallPowder );
		GameRegistry.addRecipe(new ItemStack(Item.getByNameOrId("basemetals:copper_ingot"),1 ), "111", "111", "111", '1',Items.copperSmallPowder );
		GameRegistry.addRecipe(new ItemStack(Item.getByNameOrId("basemetals:coldiron_ingot"),1 ), "111", "111", "111", '1',Items.coldironSmallPowder );
		GameRegistry.addRecipe(new ItemStack(Item.getByNameOrId("basemetals:lead_ingot"),1 ), "111", "111", "111", '1',Items.leadSmallPowder );
		GameRegistry.addRecipe(new ItemStack(Item.getByNameOrId("basemetals:nickel_ingot"),1 ), "111", "111", "111", '1',Items.nickelSmallPowder );
		GameRegistry.addRecipe(new ItemStack(Item.getByNameOrId("basemetals:mercury_ingot"),1 ), "111", "111", "111", '1',Items.mercurySmallPowder);
		GameRegistry.addRecipe(new ItemStack(Item.getByNameOrId("basemetals:starsteel_ingot"),1 ), "111", "111", "111", '1',Items.starsteelSmallPowder );
		GameRegistry.addRecipe(new ItemStack(Item.getByNameOrId("basemetals:tin_ingot"),1 ), "111", "111", "111", '1',Items.tinSmallPowder );
		GameRegistry.addRecipe(new ItemStack(Item.getByNameOrId("basemetals:zinc_ingot"),1 ), "111", "111", "111", '1',Items.zincSmallPowder );

		// 1 Ingot = 9 small powder
		GameRegistry.addShapelessRecipe(new ItemStack(Items.adamantineSmallPowder, 9),new ItemStack(Item.getByNameOrId("basemetals:adamantine_ingot"), 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.aquariumSmallPowder, 9),new ItemStack(Item.getByNameOrId("basemetals:aquarium_ingot"), 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.copperSmallPowder, 9),new ItemStack(Item.getByNameOrId("basemetals:copper_ingot"), 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.coldironSmallPowder, 9),new ItemStack(Item.getByNameOrId("basemetals:coldiron_ingot"), 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.leadSmallPowder, 9),new ItemStack(Item.getByNameOrId("basemetals:lead_ingot"), 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.nickelSmallPowder, 9),new ItemStack(Item.getByNameOrId("basemetals:nickel_ingot"), 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.mercurySmallPowder, 9),new ItemStack(Item.getByNameOrId("basemetals:mercury_ingot"), 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.starsteelSmallPowder, 9),new ItemStack(Item.getByNameOrId("basemetals:starsteel_ingot"), 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.tinSmallPowder, 9),new ItemStack(Item.getByNameOrId("basemetals:tin_ingot"), 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.zincSmallPowder, 9),new ItemStack(Item.getByNameOrId("basemetals:zinc_ingot"), 1));
/**
		GameRegistry.addShapelessRecipe(new ItemStack(Item.getByNameOrId("basemetals:adamantine_ingot"), 1),new ItemStack(Items.adamantineSmallPowder, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.getByNameOrId("basemetals:aquarium_ingot"), 1),new ItemStack(Items.aquariumSmallPowder, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.getByNameOrId("basemetals:copper_ingot"), 1),new ItemStack(Items.copperSmallPowder, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.getByNameOrId("basemetals:coldiron_ingot"), 1),new ItemStack(Items.coldironSmallPowder, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.getByNameOrId("basemetals:lead_ingot"), 1),new ItemStack(Items.leadSmallPowder, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.getByNameOrId("basemetals:nickel_ingot"), 1),new ItemStack(Items.nickelSmallPowder, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.getByNameOrId("basemetals:mercury_ingot"), 1),new ItemStack(Items.mercurySmallPowder, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.getByNameOrId("basemetals:starsteel_ingot"), 1),new ItemStack(Items.starsteelSmallPowder, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.getByNameOrId("basemetals:tin_ingot"), 1),new ItemStack(Items.tinSmallPowder, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.getByNameOrId("basemetals:zinc_ingot"), 1),new ItemStack(Items.zincSmallPowder, 9));
	**/
	
	}
}
