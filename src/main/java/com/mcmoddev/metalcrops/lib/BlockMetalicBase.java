package com.mcmoddev.metalcrops.lib;


import java.util.List;

import javax.annotation.Nullable;

import com.mcmoddev.metalcrops.MetalCrops;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

	public class BlockMetalicBase extends Block {
		protected String name;
		public BlockMetalicBase(Material material, String name) {
			super(material);
			this.name = name;
			setUnlocalizedName(MetalCrops.MODID + "." + name);
			setRegistryName(name);
			setHardness(3f);
			setResistance(5f);
		}
	    
		@Override
	    public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, net.minecraftforge.common.IPlantable plantable)
	    {
	     return true;
	    }

		public void registerItemModel(Item itemBlock) {
			MetalCrops.proxy.registerItemRenderer(itemBlock, 0, name);
		}
		
		public Item createItemBlock() {
			return new ItemBlock(this).setRegistryName(getRegistryName());
		}
		
		@Override
		public BlockMetalicBase setCreativeTab(CreativeTabs tab) {
			super.setCreativeTab(tab);
			return this;
		}
		
		@Override
	    @SideOnly(Side.CLIENT)
	    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	    {	
			tooltip.add(TextFormatting.YELLOW + I18n.format("Needed for Metal Seeds"));
	    }
		
	}