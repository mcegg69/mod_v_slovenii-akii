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
            Identifier.of(Mymod.MOD_ID,"v_slovakii_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.BLOCK_V_SLOVAKII))
                    .displayName(Text.translatable("itemgroup.mymod.v_slovakii_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BLOCK_V_SLOVAKII);
                        entries.add(ModBlocks.RAW_V_SLOVAKII_ORE);
                        entries.add(ModBlocks.RAW_V_SLOVAKII_DEEPSLATE_ORE);
                    }).build());

    public static final ItemGroup V_SLOVAKII_GROUP_ITEMS = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(Mymod.MOD_ID,"v_slovakii_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.V_SLOVAKII))
                    .displayName(Text.translatable("itemgroup.mymod.v_slovakii_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.V_SLOVAKII);
                        entries.add(ModItems.RAW_V_SLOVAKII);
                        entries.add(ModItems.V_SLOVAKII_MIDAS);
                    }).build());

    public static final ItemGroup V_SLOVENII_GROUP_BLOCKS = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(Mymod.MOD_ID,"v_slovenii_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.BLOCK_V_SLOVENII))
                    .displayName(Text.translatable("itemgroup.mymod.v_slovenii_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BLOCK_V_SLOVENII);
                        entries.add(ModBlocks.RAW_V_SLOVENII_ORE);
                        entries.add(ModBlocks.RAW_V_SLOVENII_DEEPSLATE_ORE);
                    }).build());

public static final ItemGroup V_SLOVENII_GROUP_ITEMS = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(Mymod.MOD_ID,"v_slovenii_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.V_SLOVENII))
                    .displayName(Text.translatable("itemgroup.mymod.v_slovenii_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.V_SLOVENII);
                        entries.add(ModItems.RAW_V_SLOVENII);
                        entries.add(ModItems.V_SLOVENII_MIDAS);
                    }).build());


    public static void registerItemGroups() {

    }
}
