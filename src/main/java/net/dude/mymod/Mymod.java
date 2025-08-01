package net.dude.mymod;

import net.dude.mymod.block.ModBlocks;
import net.dude.mymod.item.ModItemGroups;
import net.dude.mymod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mymod implements ModInitializer {
	public static final String  MOD_ID = "mymod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModBlocks.BLOCK_V_SLOVAKII, 1600);
		FuelRegistry.INSTANCE.add(ModBlocks.BLOCK_V_SLOVENII, 1600);
	}
}