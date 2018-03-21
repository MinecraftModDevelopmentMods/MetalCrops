package com.mcmoddev.metalcrops.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class Recipes {
	
    public static void init()
    {
        addOreRegistration();
        addSmeltingRecipes();
    }
	
	
	
	public static void addSmeltingRecipes() {

		GameRegistry.addSmelting(Blocks.metallicOre, new ItemStack(Items.metallicIngot), 0.7f);
	}

    public static void addOreRegistration()
    {
        OreDictionary.registerOre("ingotMetallic", Items.metallicIngot);
        OreDictionary.registerOre("nuggetMetallic", Items.metallicSmallPowder);
        OreDictionary.registerOre("oreMetallic", Blocks.metallicOre);
        OreDictionary.registerOre("nuggetAdamantine", Items.adamantineSmallPowder);
        OreDictionary.registerOre("nuggetAntimony", Items.antimonySmallPowder);
        OreDictionary.registerOre("nuggetAquarium", Items.aquariumSmallPowder);
        OreDictionary.registerOre("nuggetBismuth", Items.bismuthSmallPowder);
        OreDictionary.registerOre("nuggetCopper", Items.copperSmallPowder);
        OreDictionary.registerOre("nuggetColdiron", Items.coldironSmallPowder);
        OreDictionary.registerOre("nuggetLead", Items.leadSmallPowder);
        OreDictionary.registerOre("nuggetNickel", Items.nickelSmallPowder);
        OreDictionary.registerOre("nuggetMercury", Items.mercurySmallPowder);
        OreDictionary.registerOre("nuggetStarsteel", Items.starsteelSmallPowder);
        OreDictionary.registerOre("nuggetTin", Items.tinSmallPowder);
        OreDictionary.registerOre("nuggetZinc", Items.zincSmallPowder);
    


    }

}         
