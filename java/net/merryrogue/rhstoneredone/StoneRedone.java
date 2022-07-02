package net.merryrogue.rhstoneredone;

import net.fabricmc.api.ModInitializer;
import net.merryrogue.rhstoneredone.block.ModBlocks;
import net.merryrogue.rhstoneredone.item.ModItems;

public class StoneRedone implements ModInitializer
{
	public static final String MOD_ID = "rhstoneredone";

	@Override
	public void onInitialize()
	{
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
