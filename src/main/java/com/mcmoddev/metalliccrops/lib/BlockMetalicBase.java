package com.mcmoddev.metalliccrops.lib;


import com.mcmoddev.metalliccrops.MetallicCrops;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

	public class BlockMetalicBase extends Block {

	    public BlockMetalicBase(String unlocalizedName, Material material, float hardness, float resistance) {
	        super(material);
	        this.setUnlocalizedName(MetallicCrops.MODID + "." + unlocalizedName);
	        this.setHardness(hardness);
	        this.setResistance(resistance);
	    }
	    public BlockMetalicBase(String unlocalizedName, float hardness, float resistance) {
	        this(unlocalizedName, Material.ROCK, hardness, resistance);
	    }
	    public BlockMetalicBase(String unlocalizedName) {
	        this(unlocalizedName, 2.0f, 10.0f);
	    }
	    
		@Override
	    public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, net.minecraftforge.common.IPlantable plantable)
	    {
	     return true;
	    }

	}