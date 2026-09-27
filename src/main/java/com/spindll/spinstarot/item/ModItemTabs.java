package com.spindll.spinstarot.item;

import com.spindll.spinstarot.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemTabs
{

    public static final ItemGroup TAROT_CARDS_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "tarot_card_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.BASIC_CARD))
                    .displayName(Text.translatable("itemgroup.spintarot.tarot_card_items"))
                    .entries(((displayContext, entries) ->
                    {
                        entries.add(ModItems.BASIC_CARD);
                        entries.add(ModItems.TEMPLATE_CARD);
                    }))
                    .build()
            );

    public static void registerItemTabs()
    {
        TutorialMod.LOGGER.info("Registering Item Tabs for " + TutorialMod.MOD_ID);

    }


}
