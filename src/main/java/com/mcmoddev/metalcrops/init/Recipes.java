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


    }

}         