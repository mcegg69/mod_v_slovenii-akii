package net.dude.mymod.block;

import net.dude.mymod.Mymod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import java.util.List;

public class ModBlocks {
    public static final Block BLOCK_V_SLOVENII = registerBlock(
            "block_v_slovenii",
            new Block(
                    AbstractBlock.Settings.create()
                            .strength(4f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.POLISHED_TUFF)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.block_v_slovenii.tooltip"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block RAW_V_SLOVENII_ORE = registerBlock("raw_v_slovenii_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(5, 10),
                    AbstractBlock.Settings.create()
                            .strength(5f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.raw_v_slovenii_ore.tooltip"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block RAW_V_SLOVENII_DEEPSLATE_ORE = registerBlock("raw_v_slovenii_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(5, 10),
                    AbstractBlock.Settings.create()
                            .strength(5f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.raw_deepslate_v_slovakii_ore_v_slovenii_ore.tooltip"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block BLOCK_V_SLOVAKII = registerBlock(
            "block_v_slovakii",
            new Block(
                    AbstractBlock.Settings.create()
                            .strength(4f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.TUFF)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.block_v_slovakii.tooltip"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block RAW_V_SLOVAKII_ORE = registerBlock("raw_v_slovakii_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(5, 10),
                    AbstractBlock.Settings.create()
                            .strength(5f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.raw_v_slovakii_ore.tooltip"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block RAW_V_SLOVAKII_DEEPSLATE_ORE = registerBlock("raw_v_slovakii_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(5, 10),
                    AbstractBlock.Settings.create()
                            .strength(5f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.raw_deepslate_v_slovakii_ore_v_slovenii_ore.tooltip"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Mymod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(Mymod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries ->{
            entries.add(BLOCK_V_SLOVENII);
            entries.add(BLOCK_V_SLOVAKII);
            entries.add(RAW_V_SLOVAKII_DEEPSLATE_ORE);
            entries.add(RAW_V_SLOVENII_DEEPSLATE_ORE);
            entries.add(RAW_V_SLOVENII_ORE);
            entries.add(RAW_V_SLOVAKII_ORE);
        });
    }
}
