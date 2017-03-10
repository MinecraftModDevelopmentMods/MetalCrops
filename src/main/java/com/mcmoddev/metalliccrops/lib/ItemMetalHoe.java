package com.mcmoddev.metalliccrops.lib;

import com.mcmoddev.metalliccrops.init.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemMetalHoe extends ItemHoe {

	public ItemMetalHoe(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.MATERIALS);

	}
	
	
	
    @Override
	    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	    {
	        if (!playerIn.canPlayerEdit(pos.offset(facing), facing, stack))
	        {
	            return EnumActionResult.FAIL;
	        }
	        else
	        {
	            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(stack, playerIn, worldIn, pos);
	            if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

	            IBlockState iblockstate = worldIn.getBlockState(pos);
	            Block block = iblockstate.getBlock();

	            if (facing != EnumFacing.DOWN && worldIn.isAirBlock(pos.up()))
	            {
	                if (block == net.minecraft.init.Blocks.GRASS || block == net.minecraft.init.Blocks.GRASS_PATH)
	                {
	                    this.setBlock(stack, playerIn, worldIn, pos, Blocks.metallicFarmland.getDefaultState());
	                    return EnumActionResult.SUCCESS;
	                }

	                
	                
	                
	                if (block == net.minecraft.init.Blocks.DIRT)
	                {
                        this.setBlock(stack, playerIn, worldIn, pos, Blocks.metallicFarmland.getDefaultState());

	                    }
	                }
	            }

	            return EnumActionResult.PASS;
	        }
	    }


