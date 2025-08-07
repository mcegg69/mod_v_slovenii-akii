package net.dude.mymod.item;


import net.dude.mymod.Mymod;
import net.dude.mymod.item.custom.VSlovakiimidas;
import net.dude.mymod.item.custom.VSloveniimidas;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {
    public static final Item V_SLOVENII = registerItem(
            "v_slovenii",
            new Item(
                    new Item.Settings()
                            .food(ModFoodComponents.V_SLOVENII)){
                                @Override
                                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                                    tooltip.add(Text.translatable("tooltip.mymod.v_slovenii.tooltip"));
                                    super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item RAW_V_SLOVENII = registerItem(
            "raw_v_slovenii",
            new Item(
                    new Item.Settings()
                            .food(ModFoodComponents.RAW_V_SLOVENII)){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.mymod.raw_v_slovenii_raw_v_slovakii.tooltip"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Item V_SLOVAKII = registerItem(
            "v_slovakii",
            new Item(
                    new Item.Settings()
                            .food(ModFoodComponents.V_SLOVAKII)){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.mymod.v_slovakii.tooltip"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Item RAW_V_SLOVAKII = registerItem(
            "raw_v_slovakii",
            new Item(
                    new Item.Settings()
                            .food(ModFoodComponents.RAW_V_SLOVAKII)){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.mymod.raw_v_slovenii_raw_v_slovakii.tooltip"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Item V_SLOVENII_MIDAS = registerItem(
                "v_slovenii_midas",
           new VSloveniimidas(
                    new Item.Settings().maxDamage(64)));

    public static final Item V_SLOVAKII_MIDAS = registerItem(
                "v_slovakii_midas",
           new VSlovakiimidas(
                    new Item.Settings().maxDamage(64)));

    public static final Item IRON_SHELL_FOR_BARREL = registerItem(
            "iron_shell_for_barrel",
            new Item(
                    new Item.Settings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Mymod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(V_SLOVENII);
            entries.add(V_SLOVENII_MIDAS);
            entries.add(RAW_V_SLOVENII);
            entries.add(V_SLOVAKII);
            entries.add(V_SLOVAKII_MIDAS);
            entries.add(RAW_V_SLOVAKII);
        });
    }
}
