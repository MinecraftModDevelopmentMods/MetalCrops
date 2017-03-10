package com.mcmoddev.orespawn;

import com.google.common.base.Function;
import com.mcmoddev.metalliccrops.init.Blocks;

import mmd.orespawn.api.OreSpawnAPI;
import mmd.orespawn.api.SpawnLogic;

public class MetallicCropsOreSpawn implements Function<OreSpawnAPI, SpawnLogic> {

	@Override
	public SpawnLogic apply(OreSpawnAPI api) {

		SpawnLogic logic = api.createSpawnLogic();

		// Vanilla		
		logic.getDimension(0)
				.addOre(Blocks.metallicOre.getDefaultState(), 6, 8,  10, 0,  64);
		return logic;
	}
}
