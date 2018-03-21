package com.mcmoddev.metalcrops.lib;

import java.util.Random;

import com.mcmoddev.metalcrops.init.Blocks;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {

	private WorldGenerator gen_metallic_ore;
	public WorldGen() {
		this.gen_metallic_ore = new WorldGenMinable(Blocks.metallicOre.getDefaultState(), 5);
	}

	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        generator.generate(world, rand, new BlockPos(x, y, z));
	    }
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, net.minecraft.world.gen.IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		  switch (world.provider.getDimension()) {
		    case 0:
		        this.runGenerator(this.gen_metallic_ore, world, random, chunkX, chunkZ, 6, 0, 96);
		        break;
			case -1: 
				break;
			case 1:
				break;
			}
	}

}