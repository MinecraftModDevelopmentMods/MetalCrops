package com.mcmoddev.metalcrops.lib;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import java.util.Random;

import com.mcmoddev.metalcrops.MetalCrops;

public class BlockMetalCrop extends BlockCrops{
	public String crop;
	public String seed;
	public String name;

	public BlockMetalCrop(String regname, String cropname, String seedname) {
		setUnlocalizedName(MetalCrops.MODID + "." + regname);
		setRegistryName(regname);
		name = regname;
		crop = cropname;
		seed = seedname;
	}
	
	@Override
	protected Item getSeed() {
		return Item.getByNameOrId("metalcrops:" + seed);
	}
	@Override
	protected Item getCrop() {
		return Item.getByNameOrId("metalcrops:" + crop);
	}

 
	public void registerItemModel(Item itemBlock) {
		MetalCrops.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
	
	@Override
	public BlockMetalCrop setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	
	}
	@Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state)
    {
        return false;
    }

}
