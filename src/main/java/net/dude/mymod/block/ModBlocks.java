package net.dude.mymod.block;

import net.dude.mymod.Mymod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
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

    //После этой строки идут блоки с моделями , в основном не кастомные , т.к. они якобы сделанны из деревва прочность = 3f
    //Также нужно пофиксить текстуры (взять из майна) , добавишь описание
    //разве не похуй на описание этих блоков? будет впадлу думать елси это про то описание которое я думаю-mcegg
    //БЛОКИ В СЛОВЕНИИ
    public static final Block V_SLOVENII_STAIRS = registerBlock("v_slovenii_stairs" , new StairsBlock(ModBlocks.BLOCK_V_SLOVENII.getDefaultState() ,
            AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.POLISHED_TUFF)));

    public static final Block V_SLOVENII_SLABS = registerBlock("v_slovenii_slabs" , new SlabBlock(
            AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.POLISHED_TUFF)));

    public static final Block V_SLOVENII_BUTTONS = registerBlock("v_slovenii_buttons" , new ButtonBlock(BlockSetType.IRON , 20 ,
            AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.POLISHED_TUFF)
                    .noCollision()));

    public static final Block V_SLOVENII_PRESSURE_PLATE = registerBlock("v_slovenii_pressure_plate" , new PressurePlateBlock(BlockSetType.IRON ,
            AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.POLISHED_TUFF)));

    public static final Block V_SLOVENII_FENCE = registerBlock("v_slovenii_fence" , new FenceBlock(
            AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.POLISHED_TUFF)));

    public static final Block V_SLOVENII_FENCE_GATE = registerBlock("v_slovenii_fence_gate" , new FenceGateBlock(WoodType.ACACIA ,
            AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.POLISHED_TUFF)));

    public static final Block V_SLOVENII_WALLS = registerBlock("v_slovenii_walls" , new WallBlock(
            AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.POLISHED_TUFF)));

    public static final Block V_SLOVENII_DOORS = registerBlock("v_slovenii_doors" , new DoorBlock(BlockSetType.OAK ,
            AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.POLISHED_TUFF)
                    .nonOpaque()));

    public static final Block V_SLOVENII_TRAP_DOORS = registerBlock("v_slovenii_trap_doors" , new TrapdoorBlock(BlockSetType.OAK ,
            AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.POLISHED_TUFF)
                    .nonOpaque()));

    //БЛОКИ В СЛОВАКИИ

    public static final Block V_SLOVAKII_STAIRS = registerBlock("v_slovakii_stairs" , new StairsBlock(ModBlocks.BLOCK_V_SLOVAKII.getDefaultState() ,
            AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.TUFF)));

    public static final Block V_SLOVAKII_SLABS = registerBlock("v_slovakii_slabs" , new SlabBlock(
            AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.TUFF)));

    public static final Block V_SLOVAKII_BUTTONS = registerBlock("v_slovakii_buttons" , new ButtonBlock(BlockSetType.IRON , 20 ,
            AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.TUFF)
                    .noCollision()));

    public static final Block V_SLOVAKII_PRESSURE_PLATE = registerBlock("v_slovakii_pressure_plate" , new PressurePlateBlock(BlockSetType.IRON ,
            AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.TUFF)));

    public static final Block V_SLOVAKII_FENCE = registerBlock("v_slovakii_fence" , new FenceBlock(
            AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.TUFF)));

    public static final Block V_SLOVAKII_FENCE_GATE = registerBlock("v_slovakii_fence_gate" , new FenceGateBlock(WoodType.ACACIA ,
            AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.TUFF)));

    public static final Block V_SLOVAKII_WALLS = registerBlock("v_slovakii_walls" , new WallBlock(
            AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.TUFF)));

    public static final Block V_SLOVAKII_DOORS = registerBlock("v_slovakii_doors" , new DoorBlock(BlockSetType.OAK ,
            AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.TUFF)
                    .nonOpaque()));

    public static final Block V_SLOVAKII_TRAP_DOORS = registerBlock("v_slovakii_trap_doors" , new TrapdoorBlock(BlockSetType.OAK ,
            AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.TUFF)
                    .nonOpaque()));

    //БЛОКИ ETC

    public static final Block BREWING_BARREL = registerBlock(
            "brewing_barrel",
            new Block(
                    AbstractBlock.Settings.create()
                            .strength(3f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.WOOD)));


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
