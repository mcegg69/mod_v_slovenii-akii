package net.dude.mymod.datagen;

import net.dude.mymod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
       super(output, registriesFuture);
    }

    @Override
        protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
      getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
              .add(ModBlocks.RAW_V_SLOVAKII_DEEPSLATE_ORE)
                .add(ModBlocks.RAW_V_SLOVAKII_ORE)
                .add(ModBlocks.BLOCK_V_SLOVAKII)
                .add(ModBlocks.RAW_V_SLOVENII_DEEPSLATE_ORE)
                .add(ModBlocks.RAW_V_SLOVENII_ORE)
                .add(ModBlocks.BLOCK_V_SLOVENII);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RAW_V_SLOVAKII_DEEPSLATE_ORE)
                .add(ModBlocks.RAW_V_SLOVAKII_ORE)
                .add(ModBlocks.RAW_V_SLOVENII_DEEPSLATE_ORE)
                .add(ModBlocks.RAW_V_SLOVENII_ORE);

       getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
             .add(ModBlocks.BLOCK_V_SLOVENII)
                .add(ModBlocks.BLOCK_V_SLOVAKII);


        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.V_SLOVENII_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.V_SLOVENII_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.V_SLOVENII_WALLS);



    }
}
