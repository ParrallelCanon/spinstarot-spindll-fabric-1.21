package com.spindll.tutorialmod;

import com.spindll.tutorialmod.item.ModItemTabs;
import com.spindll.tutorialmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;


public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";


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
