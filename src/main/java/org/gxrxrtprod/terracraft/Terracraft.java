package org.gxrxrtprod.terracraft;

import net.fabricmc.api.ModInitializer;
import org.gxrxrtprod.terracraft.block.ModBlocks;
import org.gxrxrtprod.terracraft.item.ModItems;
import org.gxrxrtprod.terracraft.util.ModLootTables;
import org.gxrxrtprod.terracraft.worldgen.ModFeatures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Terracraft implements ModInitializer {
	public static final String MOD_ID = "terracraft";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.register();
		ModBlocks.register();
		ModLootTables.register();
		ModFeatures.register();
	}
}
