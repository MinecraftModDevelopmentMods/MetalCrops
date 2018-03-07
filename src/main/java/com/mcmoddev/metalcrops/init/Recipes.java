package com.mcmoddev.metalcrops.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {
	
	public static void init() {
		GameRegistry.addSmelting(Blocks.metallicOre, new ItemStack(Items.metallicIngot), 0.7f);
	}
}