package net.yamato.megamon;

import net.fabricmc.api.ModInitializer;

import net.yamato.megamon.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Megamon implements ModInitializer {
	public static final String MOD_ID = "megamon";
	public static final Logger LOGGER = LoggerFactory.getLogger("megamon");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}