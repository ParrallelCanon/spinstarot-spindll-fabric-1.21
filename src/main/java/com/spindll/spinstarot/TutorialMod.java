package com.spindll.spinstarot;

import com.spindll.spinstarot.item.ModItemTabs;
import com.spindll.spinstarot.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "spinstarot";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItems.registerModItems();
		ModItemTabs.registerItemTabs();
    }

	public static Identifier id(String path)
	{
		return Identifier.of(MOD_ID, path);
	}
}
