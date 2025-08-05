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

        // Здесь я добавляю пулл для моделей (ступеньки , полублоки и т.д.)

        BlockStateModelGenerator.BlockTexturePool Vslovenii = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLOCK_V_SLOVENII);

        // А здесь уже инициализирую весь пулл и ещё двери и люки

        Vslovenii.stairs(ModBlocks.V_SLOVENII_STAIRS);
        Vslovenii.slab(ModBlocks.V_SLOVENII_SLABS);

        Vslovenii.button(ModBlocks.V_SLOVENII_BUTTONS);
        Vslovenii.pressurePlate(ModBlocks.V_SLOVENII_PRESSURE_PLATE);

        Vslovenii.fence(ModBlocks.V_SLOVENII_FENCE);
        Vslovenii.fenceGate(ModBlocks.V_SLOVENII_FENCE_GATE);
        Vslovenii.wall(ModBlocks.V_SLOVENII_WALLS);

        blockStateModelGenerator.registerDoor(ModBlocks.V_SLOVENII_DOORS);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.V_SLOVENII_TRAP_DOORS);

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
