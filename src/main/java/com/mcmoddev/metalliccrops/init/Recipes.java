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
	}
	
	@Optional.Method(modid = "modernmetals")
	public static void initMMe() {
		// Base Metals Seeds
		GameRegistry.addRecipe(new ItemStack(Items.aluminumSeeds), "1M1", "MPM", "1M1", '1', Item.getByNameOrId("modernmetals:aluminum_powder"), 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.cadmiumSeeds), "1M1", "MPM", "1M1", '1', Item.getByNameOrId("modernmetals:cadmium_powder"), 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.chromiumSeeds), "1M1", "MPM", "1M1", '1', Item.getByNameOrId("modernmetals:chromium_powder"), 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.iridiumSeeds), "1M1", "MPM", "1M1", '1', Item.getByNameOrId("modernmetals:iridium_powder"), 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.magnesiumSeeds), "1M1", "MPM", "1M1", '1', Item.getByNameOrId("modernmetals:magnesium_powder"), 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.manganeseSeeds), "1M1", "MPM", "1M1", '1', Item.getByNameOrId("modernmetals:manganese_powder"), 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.osmiumSeeds), "1M1", "MPM", "1M1", '1', Item.getByNameOrId("modernmetals:osmium_powder"), 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.plutoniumSeeds), "1M1", "MPM", "1M1", '1', Item.getByNameOrId("modernmetals:plutonium_powder"), 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.rutileSeeds), "1M1", "MPM", "1M1", '1', Item.getByNameOrId("modernmetals:rutile_powder"), 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.tantalumSeeds), "1M1", "MPM", "1M1", '1', Item.getByNameOrId("modernmetals:tantalum_powder"), 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.tungstenSeeds), "1M1", "MPM", "1M1", '1', Item.getByNameOrId("modernmetals:tungsten_powder"), 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.uraniumSeeds), "1M1", "MPM", "1M1", '1', Item.getByNameOrId("modernmetals:uranium_powder"), 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.zirconiumSeeds), "1M1", "MPM", "1M1", '1', Item.getByNameOrId("modernmetals:zirconium_powder"), 'P', Items.metallicSeeds, 'M', Items.metallicPowder);


		// Small Powder Shaped
		GameRegistry.addRecipe(new ItemStack(Item.getByNameOrId("modernmetals:aliminum_ingot"),1 ), "111", "111", "111", '1',Items.aluminumSmallPowder );
		GameRegistry.addRecipe(new ItemStack(Item.getByNameOrId("modernmetals:cadmium_ingot"),1 ), "111", "111", "111", '1',Items.cadmiumSmallPowder );
		GameRegistry.addRecipe(new ItemStack(Item.getByNameOrId("modernmetals:chromium_ingot"),1 ), "111", "111", "111", '1',Items.chromiumSmallPowder );
		GameRegistry.addRecipe(new ItemStack(Item.getByNameOrId("modernmetals:iridium_ingot"),1 ), "111", "111", "111", '1',Items.iridiumSmallPowder );
		GameRegistry.addRecipe(new ItemStack(Item.getByNameOrId("modernmetals:magnesium_ingot"),1 ), "111", "111", "111", '1',Items.magnesiumSmallPowder );
		GameRegistry.addRecipe(new ItemStack(Item.getByNameOrId("modernmetals:manganese_ingot"),1 ), "111", "111", "111", '1',Items.manganeseSmallPowder );
		GameRegistry.addRecipe(new ItemStack(Item.getByNameOrId("modernmetals:osmium_ingot"),1 ), "111", "111", "111", '1',Items.osmiumSmallPowder );
		GameRegistry.addRecipe(new ItemStack(Item.getByNameOrId("modernmetals:plutonium_ingot"),1 ), "111", "111", "111", '1',Items.plutoniumSmallPowder );
		GameRegistry.addRecipe(new ItemStack(Item.getByNameOrId("modernmetals:rutile_ingot"),1 ), "111", "111", "111", '1',Items.rutileSmallPowder );
		GameRegistry.addRecipe(new ItemStack(Item.getByNameOrId("modernmetals:tantalum_ingot"),1 ), "111", "111", "111", '1',Items.tantalumSmallPowder );
		GameRegistry.addRecipe(new ItemStack(Item.getByNameOrId("modernmetals:tungsten_ingot"),1 ), "111", "111", "111", '1',Items.tungstenSmallPowder );
		GameRegistry.addRecipe(new ItemStack(Item.getByNameOrId("modernmetals:uranium_ingot"),1 ), "111", "111", "111", '1',Items.uraniumSmallPowder );
		GameRegistry.addRecipe(new ItemStack(Item.getByNameOrId("modernmetals:zirconium_ingot"),1 ), "111", "111", "111", '1',Items.zirconiumSmallPowder );



		// 1 Ingot = 9 small powder
		GameRegistry.addShapelessRecipe(new ItemStack(Items.aluminumSmallPowder, 9),new ItemStack(Item.getByNameOrId("modernmetals:aluminum_ingot"), 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.cadmiumSmallPowder, 9),new ItemStack(Item.getByNameOrId("modernmetals:cadmium_ingot"), 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.chromiumSmallPowder, 9),new ItemStack(Item.getByNameOrId("modernmetals:chromium_ingot"), 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.iridiumSmallPowder, 9),new ItemStack(Item.getByNameOrId("modernmetals:iridium_ingot"), 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.magnesiumSmallPowder, 9),new ItemStack(Item.getByNameOrId("modernmetals:magnesium_ingot"), 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.manganeseSmallPowder, 9),new ItemStack(Item.getByNameOrId("modernmetals:manganese_ingot"), 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.osmiumSmallPowder, 9),new ItemStack(Item.getByNameOrId("modernmetals:osmium_ingot"), 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.plutoniumSmallPowder, 9),new ItemStack(Item.getByNameOrId("modernmetals:plutonium_ingot"), 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.rutileSmallPowder, 9),new ItemStack(Item.getByNameOrId("modernmetals:rutile_ingot"), 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.tantalumSmallPowder, 9),new ItemStack(Item.getByNameOrId("modernmetals:tantalum_ingot"), 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.tungstenSmallPowder, 9),new ItemStack(Item.getByNameOrId("modernmetals:tungsten_ingot"), 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.uraniumSmallPowder, 9),new ItemStack(Item.getByNameOrId("modernmetals:uranium_ingot"), 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.zirconiumSmallPowder, 9),new ItemStack(Item.getByNameOrId("modernmetals:zirconium_ingot"), 1));

	}
	
	@Optional.Method(modid = "utilitybaseores")
	public static void initUBO() {
		// Base Metals Seeds
		GameRegistry.addRecipe(new ItemStack(Items.featherSeeds), "1M1", "MPM", "1M1", '1', net.minecraft.init.Items.FEATHER, 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.boneSeeds), "1M1", "MPM", "1M1", '1', net.minecraft.init.Items.BONE, 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.blazeSeeds), "1M1", "MPM", "1M1", '1', net.minecraft.init.Items.BLAZE_POWDER, 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.rottenSeeds), "1M1", "MPM", "1M1", '1', net.minecraft.init.Items.ROTTEN_FLESH, 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.gunpowderSeeds), "1M1", "MPM", "1M1", '1', net.minecraft.init.Items.GUNPOWDER, 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.prismarineSeeds), "1M1", "MPM", "1M1", '1', net.minecraft.init.Items.PRISMARINE_SHARD, 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.enderSeeds), "1M1", "MPM", "1M1", '1', net.minecraft.init.Items.ENDER_PEARL, 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.slimeSeeds), "1M1", "MPM", "1M1", '1', net.minecraft.init.Items.SLIME_BALL, 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.flintSeeds), "1M1", "MPM", "1M1", '1', net.minecraft.init.Items.FLINT, 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.carrotSeeds), "1M1", "MPM", "1M1", '1', net.minecraft.init.Items.CARROT, 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.melonSeeds), "1M1", "MPM", "1M1", '1', net.minecraft.init.Items.MELON, 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.potatoSeeds), "1M1", "MPM", "1M1", '1', net.minecraft.init.Items.POTATO, 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.chickenSeeds), "1M1", "MPM", "1M1", '1', net.minecraft.init.Items.CHICKEN, 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.beefSeeds), "1M1", "MPM", "1M1", '1', net.minecraft.init.Items.BEEF, 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.porkchopSeeds), "1M1", "MPM", "1M1", '1', net.minecraft.init.Items.PORKCHOP, 'P', Items.metallicSeeds, 'M', Items.metallicPowder);
		GameRegistry.addRecipe(new ItemStack(Items.fishSeeds), "1M1", "MPM", "1M1", '1', net.minecraft.init.Items.FISH, 'P', Items.metallicSeeds, 'M', Items.metallicPowder);


		// Small Powder Shaped
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Items.FEATHER,1 ), "111", "111", "111", '1',Items.featherSmallPowder );
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Items.BONE,1 ), "111", "111", "111", '1',Items.boneSmallPowder );
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Items.BLAZE_POWDER,1 ), "111", "111", "111", '1',Items.blazeSmallPowder );
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Items.ROTTEN_FLESH,1 ), "111", "111", "111", '1',Items.rottenSmallPowder );
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Items.GUNPOWDER,1 ), "111", "111", "111", '1',Items.gunpowderSmallPowder );
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Items.PRISMARINE_SHARD,1 ), "111", "111", "111", '1',Items.prismarineSmallPowder );
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Items.ENDER_PEARL,1 ), "111", "111", "111", '1',Items.enderSmallPowder );
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Items.SLIME_BALL,1 ), "111", "111", "111", '1',Items.slimeSmallPowder );
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Items.FLINT,1 ), "111", "111", "111", '1',Items.flintSmallPowder );
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Items.CARROT,1 ), "111", "111", "111", '1',Items.carrotSmallPowder );
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Items.MELON,1 ), "111", "111", "111", '1',Items.melonSmallPowder );
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Items.POTATO,1 ), "111", "111", "111", '1',Items.potatoSmallPowder );
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Items.CHICKEN,1 ), "111", "111", "111", '1',Items.chickenSmallPowder );
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Items.BEEF,1 ), "111", "111", "111", '1',Items.beefSmallPowder );
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Items.PORKCHOP,1 ), "111", "111", "111", '1',Items.porkchopSmallPowder );
		GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Items.FISH,1 ), "111", "111", "111", '1',Items.fishSmallPowder );

		// 1 Ingot = 9 small powder
		GameRegistry.addShapelessRecipe(new ItemStack(Items.featherSmallPowder, 9),new ItemStack(net.minecraft.init.Items.FEATHER, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.boneSmallPowder, 9),new ItemStack(net.minecraft.init.Items.BONE, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.blazeSmallPowder, 9),new ItemStack(net.minecraft.init.Items.BLAZE_POWDER, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.rottenSmallPowder, 9),new ItemStack(net.minecraft.init.Items.ROTTEN_FLESH, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.gunpowderSmallPowder, 9),new ItemStack(net.minecraft.init.Items.GUNPOWDER, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.prismarineSmallPowder, 9),new ItemStack(net.minecraft.init.Items.PRISMARINE_SHARD, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.enderSmallPowder, 9),new ItemStack(net.minecraft.init.Items.ENDER_PEARL, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.slimeSmallPowder, 9),new ItemStack(net.minecraft.init.Items.SLIME_BALL, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.flintSmallPowder, 9),new ItemStack(net.minecraft.init.Items.FLINT, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.carrotSmallPowder, 9),new ItemStack(net.minecraft.init.Items.CARROT, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.melonSmallPowder, 9),new ItemStack(net.minecraft.init.Items.MELON, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.potatoSmallPowder, 9),new ItemStack(net.minecraft.init.Items.POTATO, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.chickenSmallPowder, 9),new ItemStack(net.minecraft.init.Items.CHICKEN, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.beefSmallPowder, 9),new ItemStack(net.minecraft.init.Items.BEEF, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.porkchopSmallPowder, 9),new ItemStack(net.minecraft.init.Items.PORKCHOP, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.fishSmallPowder, 9),new ItemStack(net.minecraft.init.Items.FISH, 1));

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
