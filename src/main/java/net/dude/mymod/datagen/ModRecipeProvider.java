package net.dude.mymod.datagen;

import net.dude.mymod.block.ModBlocks;
import net.dude.mymod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        List<ItemConvertible> V_SLOVAKII_SMELTABLES = List.of(
                ModItems.RAW_V_SLOVAKII,
                ModBlocks.RAW_V_SLOVAKII_ORE,
                ModBlocks.RAW_V_SLOVAKII_DEEPSLATE_ORE
                );

        List<ItemConvertible> V_SLOVENII_SMELTABLES = List.of(
                ModItems.RAW_V_SLOVENII,
                ModBlocks.RAW_V_SLOVENII_ORE,
                ModBlocks.RAW_V_SLOVENII_DEEPSLATE_ORE
                );

        offerSmelting(recipeExporter, V_SLOVAKII_SMELTABLES, RecipeCategory.MISC, ModItems.V_SLOVAKII,1f, 200,"v_slovakii");
        offerBlasting(recipeExporter, V_SLOVAKII_SMELTABLES, RecipeCategory.MISC, ModItems.V_SLOVAKII,1f, 100, "v_slovakii");

        offerSmelting(recipeExporter, V_SLOVENII_SMELTABLES, RecipeCategory.MISC, ModItems.V_SLOVENII,1f, 200,"v_slovenii");
        offerBlasting(recipeExporter, V_SLOVENII_SMELTABLES, RecipeCategory.MISC, ModItems.V_SLOVENII,1f, 100, "v_slovenii");


    }
}
