package com.spindll.spinstarot.item;

import com.spindll.spinstarot.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item BASIC_CARD = registerItem("basic_card", new Item(new Item.Settings()
            .component(DataComponentTypes.MAX_STACK_SIZE, 1)
    ));

    public static final Item TEMPLATE_CARD = registerItem("template_card", new Item(new Item.Settings()
            .component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)
            .component(DataComponentTypes.MAX_STACK_SIZE, 1)
            .component(DataComponentTypes.RARITY, Rarity.EPIC)
    ));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BASIC_CARD);
        });
    }
}