package com.mcmoddev.basecrops.proxy;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import java.util.*;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.MissingModsException;
import net.minecraftforge.fml.common.versioning.ArtifactVersion;
import net.minecraftforge.fml.common.versioning.DefaultArtifactVersion;
import com.mcmoddev.basecrops.BaseCrops;
import com.mcmoddev.basecrops.init.Blocks;
import com.mcmoddev.basecrops.init.Items;
import com.mcmoddev.basecrops.init.Recipes;
import com.mcmoddev.basecrops.lib.DataConstants;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;


public class CommonProxy {
	
	
	
	
	private static final String ORESPAWN_CFG_PATH = "config/orespawn";

	
	public static Configuration config;
    public void preInit(FMLPreInitializationEvent e) {
    	config = new Configuration(e.getSuggestedConfigurationFile());

		FMLInterModComms.sendFunctionMessage("orespawn", "api", "com.mcmoddev.orespawn.BaseCropsOreSpawn");

    	Blocks.initBlocks();
    	Items.initItems();
        Recipes.initRecipes();
		if (Loader.isModLoaded("basemetals")){Blocks.initBMe(); Items.initBMe(); Recipes.initBMe();
		}
		if (!Loader.isModLoaded("orespawn")) {
			final HashSet<ArtifactVersion> orespawnMod = new HashSet<>();
			orespawnMod.add(new DefaultArtifactVersion("1.1.0"));
			throw new MissingModsException(orespawnMod, "orespawn", "MMD Ore Spawn Mod");
		}
		final Path oreSpawnFile = Paths.get(ORESPAWN_CFG_PATH, BaseCrops.MODID + ".json");
		if (!(oreSpawnFile.toFile().exists())) {
			try {
				Files.createDirectories(oreSpawnFile.getParent());
				Files.write(oreSpawnFile, Arrays.asList(DataConstants.DEFAULT_ORESPAWN_JSON.split("\n")), Charset.forName("UTF-8"));
			} catch (final IOException ex) {
				//BaseMetals.logger.error("Failed to write file " + oreSpawnFile, ex);
			}
		}
	}
		
    
    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }
}