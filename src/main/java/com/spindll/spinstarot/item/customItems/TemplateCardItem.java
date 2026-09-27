package com.spindll.spinstarot.item.customItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import java.util.List;

public class TemplateCardItem extends Item
{
    public TemplateCardItem(Settings settings)
    {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand)
    {
        return super.useOnEntity(stack, user, entity, hand);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected)
    {
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type)
    {
        super.appendTooltip(stack, context, tooltip, type);
    }

//    //done
//
//    //now a component, see the declaration
//    @Override
//    public boolean hasGlint(ItemStack stack)
//    {
//        return true;
//    }
//
//    //done
//
//    //now a component, see the declaration
//    @Override
//    public boolean isEnchantable(ItemStack stack) {
//        return false;
//    }

    //done
    @Override
    public boolean canBeNested() {
        return false;
    }

//    //done
//
//    //now a component, see declaration
//    @Override
//    public int getMaxCount() {
//        return 1;
//    }

    //rarity is also a component
}
