package net.dude.mymod.item;

import net.dude.mymod.Mymod;
import net.dude.mymod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

//test
//привет сладкий

public class ModItemGroups {
    public static final ItemGroup V_SLOVAKII_GROUP_BLOCKS = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(Mymod.MOD_ID,"v_slovakii_group_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.BLOCK_V_SLOVAKII))
                    .displayName(Text.translatable("itemgroup.mymod.v_slovakii_group_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BLOCK_V_SLOVAKII);
                        entries.add(ModBlocks.RAW_V_SLOVAKII_ORE);
                        entries.add(ModBlocks.RAW_V_SLOVAKII_DEEPSLATE_ORE);

                        entries.add(ModBlocks.V_SLOVAKII_BUTTONS);
                        entries.add(ModBlocks.V_SLOVAKII_TRAP_DOORS);
                        entries.add(ModBlocks.V_SLOVAKII_DOORS);
                        entries.add(ModBlocks.V_SLOVAKII_STAIRS);
                        entries.add(ModBlocks.V_SLOVAKII_SLABS);
                        entries.add(ModBlocks.V_SLOVAKII_PRESSURE_PLATE);
                        entries.add(ModBlocks.V_SLOVAKII_FENCE);
                        entries.add(ModBlocks.V_SLOVAKII_FENCE_GATE);
                        entries.add(ModBlocks.V_SLOVAKII_WALLS);
                    }).build());

    public static final ItemGroup V_SLOVAKII_GROUP_ITEMS = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(Mymod.MOD_ID,"v_slovakii_group_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.V_SLOVAKII))
                    .displayName(Text.translatable("itemgroup.mymod.v_slovakii_group_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.V_SLOVAKII);
                        entries.add(ModItems.RAW_V_SLOVAKII);
                        entries.add(ModItems.V_SLOVAKII_MIDAS);
                    }).build());

    public static final ItemGroup V_SLOVENII_GROUP_BLOCKS = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(Mymod.MOD_ID,"v_slovenii_group_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.BLOCK_V_SLOVENII))
                    .displayName(Text.translatable("itemgroup.mymod.v_slovenii_group_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BLOCK_V_SLOVENII);
                        entries.add(ModBlocks.RAW_V_SLOVENII_ORE);
                        entries.add(ModBlocks.RAW_V_SLOVENII_DEEPSLATE_ORE);

                        entries.add(ModBlocks.V_SLOVENII_BUTTONS);
                        entries.add(ModBlocks.V_SLOVENII_TRAP_DOORS);
                        entries.add(ModBlocks.V_SLOVENII_DOORS);
                        entries.add(ModBlocks.V_SLOVENII_STAIRS);
                        entries.add(ModBlocks.V_SLOVENII_SLABS);
                        entries.add(ModBlocks.V_SLOVENII_PRESSURE_PLATE);
                        entries.add(ModBlocks.V_SLOVENII_FENCE);
                        entries.add(ModBlocks.V_SLOVENII_FENCE_GATE);
                        entries.add(ModBlocks.V_SLOVENII_WALLS);
                    }).build());

public static final ItemGroup V_SLOVENII_GROUP_ITEMS = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(Mymod.MOD_ID,"v_slovenii_group_item"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.V_SLOVENII))
                    .displayName(Text.translatable("itemgroup.mymod.v_slovenii_group_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.V_SLOVENII);
                        entries.add(ModItems.RAW_V_SLOVENII);
                        entries.add(ModItems.V_SLOVENII_MIDAS);
                    }).build());


    public static void registerItemGroups() {

    }
}
