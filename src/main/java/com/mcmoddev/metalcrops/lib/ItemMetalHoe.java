package com.mcmoddev.metalcrops.lib;

import java.util.List;

import javax.annotation.Nullable;

import com.mcmoddev.metalcrops.MetalCrops;
import com.mcmoddev.metalcrops.init.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMetalHoe extends ItemHoe {

	protected String name;

		
		public ItemMetalHoe(ToolMaterial material, String name) {
		super(material);
    	this.name = name;

		setUnlocalizedName(MetalCrops.MODID + "." + name);
		setRegistryName(name);
	}

		public void registerItemModel() {
			MetalCrops.proxy.registerItemRenderer(this, 0, name);
		}
		
		@Override
		public ItemMetalHoe setCreativeTab(CreativeTabs tab) {
			super.setCreativeTab(tab);
			return this;
		}

		@Override
	    @SuppressWarnings("incomplete-switch")
	    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	    {
	        ItemStack itemstack = player.getHeldItem(hand);

	        if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack))
	        {
	            return EnumActionResult.FAIL;
	        }
	        else
	        {
	            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, player, worldIn, pos);
	            if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

	            IBlockState iblockstate = worldIn.getBlockState(pos);
	            Block block = iblockstate.getBlock();

	            if (facing != EnumFacing.DOWN && worldIn.isAirBlock(pos.up()))
	            {
	                if (block == net.minecraft.init.Blocks.GRASS || block == net.minecraft.init.Blocks.GRASS_PATH)
	                {
	                    this.setBlock(itemstack, player, worldIn, pos, Blocks.metallicFarmland.getDefaultState());
	                    return EnumActionResult.SUCCESS;
	                }

	                if (block == net.minecraft.init.Blocks.DIRT)
	                {
	                    switch ((BlockDirt.DirtType)iblockstate.getValue(BlockDirt.VARIANT))
	                    {
	                        case DIRT:
	                            this.setBlock(itemstack, player, worldIn, pos, Blocks.metallicFarmland.getDefaultState());
	                            return EnumActionResult.SUCCESS;
	                        case COARSE_DIRT:
	                            this.setBlock(itemstack, player, worldIn, pos, net.minecraft.init.Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
	                            return EnumActionResult.SUCCESS;
	                    }
	                }
	            }

	            return EnumActionResult.PASS;
	        }
	        
	        
	    }
		
		@Override
	    @SideOnly(Side.CLIENT)
	    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	    {	
			tooltip.add(TextFormatting.YELLOW + I18n.format("Used to make Metallic Farmland"));
	    }
		}
