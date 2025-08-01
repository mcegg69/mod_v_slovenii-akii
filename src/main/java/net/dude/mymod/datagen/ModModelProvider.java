package net.dude.mymod.datagen;

import net.dude.mymod.block.ModBlocks;
import net.dude.mymod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_V_SLOVENII_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_V_SLOVENII_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_V_SLOVENII);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_V_SLOVAKII_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_V_SLOVAKII_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_V_SLOVAKII);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.V_SLOVENII, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_V_SLOVENII, Models.GENERATED);
        itemModelGenerator.register(ModItems.V_SLOVAKII, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_V_SLOVAKII, Models.GENERATED);
    }
}
