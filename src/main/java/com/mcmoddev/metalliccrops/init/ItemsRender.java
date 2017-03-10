package com.mcmoddev.metalliccrops.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Optional;

public class ItemsRender {
	public static void registerItemRenderer() {
		reg(Items.metallicRod);
		reg(Items.metallicSeeds);
		reg(Items.metallicIngot);
		reg(Items.metallicSmallPowder);
		reg(Items.metallicPowder);

		reg(Items.metallicHoe);
		
		reg(Items.adamantineSmallPowder);
		reg(Items.aquariumSmallPowder);
		reg(Items.copperSmallPowder);
		reg(Items.coldironSmallPowder);
		reg(Items.leadSmallPowder);
		reg(Items.nickelSmallPowder);
		reg(Items.mercurySmallPowder);
		reg(Items.starsteelSmallPowder);
		reg(Items.tinSmallPowder);
		reg(Items.zincSmallPowder);
		reg(Items.goldSmallPowder);
		reg(Items.ironSmallPowder);
		reg(Items.coalSmallPowder);
		reg(Items.lapisSmallPowder);
		reg(Items.diamondSmallPowder);
		reg(Items.redstoneSmallPowder);
		reg(Items.emeraldSmallPowder);
		reg(Items.goldSeeds);
		reg(Items.ironSeeds);
		reg(Items.coalSeeds);
		reg(Items.lapisSeeds);
		reg(Items.diamondSeeds);
		reg(Items.redstoneSeeds);
		reg(Items.emeraldSeeds);

		reg(Items.goldPowder);
		reg(Items.ironPowder);
		reg(Items.coalPowder);
		reg(Items.lapisPowder);
		reg(Items.diamondPowder);
		reg(Items.redstonePowder);
		reg(Items.emeraldPowder);
}
	    @Optional.Method(modid="basemetals")
		public static void registerItemRendererBMe() {
			reg(Items.adamantineSeeds);
			//reg(Items.antimonySeeds);
			reg(Items.aquariumSeeds);
			//reg(Items.bismuthSeeds);
			reg(Items.copperSeeds);
			reg(Items.coldironSeeds);
			reg(Items.leadSeeds);
			reg(Items.nickelSeeds);
			reg(Items.mercurySeeds);
			reg(Items.starsteelSeeds);
			reg(Items.tinSeeds);
			reg(Items.zincSeeds);
			/**
			reg(Items.vanilla_charcoalSeeds);
			reg(Items.vanilla_coalSeeds);
			reg(Items.vanilla_diamondSeeds);
			reg(Items.vanilla_goldSeeds);
			reg(Items.vanilla_ironSeeds);
			reg(Items.vanilla_redstoneSeeds);

**/
}
		public static void reg(Item item) {
			ModelResourceLocation res = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
			ModelLoader.setCustomModelResourceLocation(item, 0, res);
		}
}





