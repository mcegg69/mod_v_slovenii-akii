package net.dude.mymod.datagen;

import net.dude.mymod.block.ModBlocks;
import net.dude.mymod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BLOCK_V_SLOVAKII);
        addDrop(ModBlocks.BLOCK_V_SLOVENII);

        addDrop(ModBlocks.RAW_V_SLOVAKII_ORE, oreDrops(ModBlocks.RAW_V_SLOVAKII_ORE, ModItems.RAW_V_SLOVAKII));
        addDrop(ModBlocks.RAW_V_SLOVAKII_DEEPSLATE_ORE, multipleOreDrops(ModBlocks.RAW_V_SLOVAKII_ORE, ModItems.RAW_V_SLOVAKII,1 ,2));
        addDrop(ModBlocks.RAW_V_SLOVENII_ORE, oreDrops(ModBlocks.RAW_V_SLOVENII_ORE, ModItems.RAW_V_SLOVENII));
        addDrop(ModBlocks.RAW_V_SLOVENII_DEEPSLATE_ORE, multipleOreDrops(ModBlocks.RAW_V_SLOVENII_ORE, ModItems.RAW_V_SLOVENII,1 ,2));
    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }

}
