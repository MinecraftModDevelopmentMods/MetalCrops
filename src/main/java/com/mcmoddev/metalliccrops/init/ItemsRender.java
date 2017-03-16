package com.mcmoddev.metalliccrops.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Optional;

public class ItemsRender {
	public static void registerItemRenderer() {
		// Metallic Crops Items 
		reg(Items.metallicRod);
		reg(Items.metallicSeeds);
		reg(Items.metallicIngot);
		reg(Items.metallicSmallPowder);
		reg(Items.metallicPowder);
		reg(Items.metallicHoe);
		
		// Metallic Crops SmallPowder
		reg(Items.goldSmallPowder);
		reg(Items.ironSmallPowder);
		reg(Items.coalSmallPowder);
		reg(Items.lapisSmallPowder);
		reg(Items.diamondSmallPowder);
		reg(Items.redstoneSmallPowder);
		reg(Items.emeraldSmallPowder);
		
		// Metallic Crops Seeds
		reg(Items.goldSeeds);
		reg(Items.ironSeeds);
		reg(Items.coalSeeds);
		reg(Items.lapisSeeds);
		reg(Items.diamondSeeds);
		reg(Items.redstoneSeeds);
		reg(Items.emeraldSeeds);
		
		// Metallic Crops Powder
		reg(Items.goldPowder);
		reg(Items.ironPowder);
		reg(Items.coalPowder);
		reg(Items.lapisPowder);
		reg(Items.diamondPowder);
		reg(Items.redstonePowder);
		reg(Items.emeraldPowder);}
	
	    @Optional.Method(modid="basemetals")
		public static void registerItemRendererBMe() {
	    	
	    	// Base Metals Seeds
			reg(Items.adamantineSeeds);
			//reg(Items.antimonySeeds);  BMe 2.5 omly
			reg(Items.aquariumSeeds);
			//reg(Items.bismuthSeeds);  BMe 2.5 omly
			reg(Items.copperSeeds);
			reg(Items.coldironSeeds);
			reg(Items.leadSeeds);
			reg(Items.nickelSeeds);
			reg(Items.mercurySeeds);
			reg(Items.starsteelSeeds);
			reg(Items.tinSeeds);
			reg(Items.zincSeeds);
			
			// Base Metals Small Powder
			reg(Items.adamantineSmallPowder);
			reg(Items.aquariumSmallPowder);
			reg(Items.copperSmallPowder);
			reg(Items.coldironSmallPowder);
			reg(Items.leadSmallPowder);
			reg(Items.nickelSmallPowder);
			reg(Items.mercurySmallPowder);
			reg(Items.starsteelSmallPowder);
			reg(Items.tinSmallPowder);
			reg(Items.zincSmallPowder);}
	    
	    @Optional.Method(modid="modernmetals")
		public static void registerItemRendererMMe() {
	    	
	    	// Modern Metals Seeds	
			reg(Items.aluminumSeeds);
			reg(Items.cadmiumSeeds);
			reg(Items.chromiumSeeds);
			reg(Items.iridiumSeeds);
			reg(Items.magnesiumSeeds);
			reg(Items.manganeseSeeds);
			reg(Items.osmiumSeeds);
			reg(Items.plutoniumSeeds);
			reg(Items.rutileSeeds);
			reg(Items.tantalumSeeds);
			reg(Items.tungstenSeeds);
			reg(Items.uraniumSeeds);
			reg(Items.zirconiumSeeds);

			// Modern Metals Small Powder
			reg(Items.aluminumSmallPowder);
			reg(Items.cadmiumSmallPowder);
			reg(Items.chromiumSmallPowder);
			reg(Items.iridiumSmallPowder);
			reg(Items.magnesiumSmallPowder);
			reg(Items.manganeseSmallPowder);
			reg(Items.osmiumSmallPowder);
			reg(Items.plutoniumSmallPowder);
			reg(Items.rutileSmallPowder);
			reg(Items.tantalumSmallPowder);
			reg(Items.tungstenSmallPowder);
			reg(Items.uraniumSmallPowder);
			reg(Items.zirconiumSmallPowder);}
	    
	    @Optional.Method(modid="utilitybaseores")
		public static void registerItemRendererUBO() {
	    	
	    	// Utility Base Ores Seeds
			reg(Items.featherSeeds);
			reg(Items.boneSeeds);
			reg(Items.rottenSeeds);
			reg(Items.gunpowderSeeds);
			reg(Items.prismarineSeeds);
			reg(Items.enderSeeds);
			reg(Items.slimeSeeds);
			reg(Items.flintSeeds);
			reg(Items.carrotSeeds);
			reg(Items.melonSeeds);
			reg(Items.potatoSeeds);
			reg(Items.chickenSeeds);
			reg(Items.beefSeeds);
			reg(Items.porkchopSeeds);
			reg(Items.fishSeeds);

			// Utility Base Ores Small Powder
			reg(Items.featherSmallPowder);
			reg(Items.boneSmallPowder);
			reg(Items.rottenSmallPowder);
			reg(Items.gunpowderSmallPowder);
			reg(Items.prismarineSmallPowder);
			reg(Items.enderSmallPowder);
			reg(Items.slimeSmallPowder);
			reg(Items.flintSmallPowder);
			reg(Items.carrotSmallPowder);
			reg(Items.melonSmallPowder);
			reg(Items.potatoSmallPowder);
			reg(Items.chickenSmallPowder);
			reg(Items.beefSmallPowder);
			reg(Items.porkchopSmallPowder);
			reg(Items.fishSmallPowder);}
	    
		public static void reg(Item item) {
			ModelResourceLocation res = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
			ModelLoader.setCustomModelResourceLocation(item, 0, res);}
		
}
