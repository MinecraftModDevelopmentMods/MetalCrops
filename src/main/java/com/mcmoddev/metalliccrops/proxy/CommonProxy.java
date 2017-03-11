package com.mcmoddev.metalliccrops.proxy;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Loader;
import com.mcmoddev.metalliccrops.init.Blocks;
import com.mcmoddev.metalliccrops.init.Items;
import com.mcmoddev.metalliccrops.init.Recipes;
import com.mcmoddev.metalliccrops.lib.WorldGen;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;


public class CommonProxy {

	//private static final String ORESPAWN_CFG_PATH = "config/orespawn";
	public static Configuration config;
    public void preInit(FMLPreInitializationEvent e) {
    	config = new Configuration(e.getSuggestedConfigurationFile());
		//FMLInterModComms.sendFunctionMessage("orespawn", "api", "com.mcmoddev.orespawn.MetallicCropsOreSpawn");
    	Blocks.initBlocks();
    	Items.initItems();
        Recipes.initRecipes();
		GameRegistry.registerWorldGenerator(new WorldGen(), 0);

		if (Loader.isModLoaded("basemetals")){Blocks.initBMe(); Items.initBMe(); Recipes.initBMe();
		}
    }
		
		/**
		if (!Loader.isModLoaded("orespawn")) {
			final HashSet<ArtifactVersion> orespawnMod = new HashSet<>();
			orespawnMod.add(new DefaultArtifactVersion("1.1.0"));
			throw new MissingModsException(orespawnMod, "orespawn", "MMD Ore Spawn Mod");
		}
		final Path oreSpawnFile = Paths.get(ORESPAWN_CFG_PATH, MetallicCrops.MODID + ".json");
		if (!(oreSpawnFile.toFile().exists())) {
			try {
				Files.createDirectories(oreSpawnFile.getParent());
				Files.write(oreSpawnFile, Arrays.asList(DataConstants.DEFAULT_ORESPAWN_JSON.split("\n")), Charset.forName("UTF-8"));
			} catch (final IOException ex) {
				//BaseMetals.logger.error("Failed to write file " + oreSpawnFile, ex);
			}
		}
	}
		
    **/
    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }
}