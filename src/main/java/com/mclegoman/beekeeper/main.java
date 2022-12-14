// Copyright (c) Daniel-Tayden Larsen 2022 //
// License: MCLM-OSL (2022) //

package com.mclegoman.beekeeper;

import com.mclegoman.beekeeper.registry.blocks;
import com.mclegoman.beekeeper.registry.items;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class main implements ModInitializer {
	public static final String MOD_ID = "beekeeper";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		items.registerItems();
		blocks.registerBlocks();
	}

	public static Identifier identifier(String path) {
		return new Identifier(MOD_ID, path);
	}
}