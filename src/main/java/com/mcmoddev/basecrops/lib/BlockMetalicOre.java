package com.mcmoddev.basecrops.lib;


import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

	public class BlockMetalicOre extends Block {
		private int meta;
		private int least_quantity;
		private int most_quantity;
		
		
	    public BlockMetalicOre(String unlocalizedName, Material material, float hardness, float resistance, int meta, int least_quantity, int most_quantity) {
	        super(material);
	        this.setUnlocalizedName(unlocalizedName);
	        this.setHardness(hardness);
	        this.setResistance(resistance);
			this.meta = meta;
			this.least_quantity = least_quantity;
			this.most_quantity = most_quantity;
	    }

	    public BlockMetalicOre(String unlocalizedName, float hardness, float resistance, int least_quantity, int most_quantity) {
	        this(unlocalizedName, Material.ROCK, hardness, resistance, least_quantity, least_quantity, least_quantity);
	    }

	    public BlockMetalicOre(String unlocalizedName, int least_quantity, int most_quantity) {
	        this(unlocalizedName, 2.0f, 10.0f, least_quantity, least_quantity);
	    }
	    
		@Override
		public int damageDropped(IBlockState blockstate) {
			return this.meta;
		}
	   
		@Override
		public int quantityDropped(IBlockState blockstate, int fortune, Random random) {
			if (this.least_quantity >= this.most_quantity)
				return this.least_quantity;
			return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
		}
	    

	    
	}


