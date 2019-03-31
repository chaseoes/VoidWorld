package com.chaseoes.voidworld;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public class VoidWorld extends JavaPlugin {

    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new VoidWorldGenerator();
    }

    public class VoidWorldGenerator extends ChunkGenerator {
		@Override
		public ChunkData generateChunkData(World world, Random random, int x, int z, BiomeGrid biome) {
			return createChunkData(world);
		}
	}
}
