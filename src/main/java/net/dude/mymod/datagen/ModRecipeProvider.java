package net.dude.mymod.datagen;

import com.mojang.datafixers.types.templates.Tag;
import net.dude.mymod.block.ModBlocks;
import net.dude.mymod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

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

        //КРАФТ БЛОКОВ В СЛОВЕНИИ

        offerWallRecipe(recipeExporter, RecipeCategory.MISC, ModBlocks.V_SLOVENII_WALLS, ModBlocks.BLOCK_V_SLOVENII);
        offerSlabRecipe(recipeExporter, RecipeCategory.MISC, ModBlocks.V_SLOVENII_SLABS, ModBlocks.BLOCK_V_SLOVENII);
        offerSingleOutputShapelessRecipe(recipeExporter, ModBlocks.V_SLOVENII_BUTTONS, ModBlocks.BLOCK_V_SLOVENII,"v_slovenii");
        offerPressurePlateRecipe(recipeExporter, ModBlocks.V_SLOVENII_PRESSURE_PLATE, ModBlocks.BLOCK_V_SLOVENII);

        createDoorRecipe(ModBlocks.V_SLOVENII_DOORS, Ingredient.ofItems(ModBlocks.BLOCK_V_SLOVENII))
                .criterion(hasItem(ModBlocks.BLOCK_V_SLOVENII), conditionsFromItem(ModBlocks.BLOCK_V_SLOVENII))
                .offerTo(recipeExporter);
        createTrapdoorRecipe(ModBlocks.V_SLOVENII_TRAP_DOORS, Ingredient.ofItems(ModBlocks.BLOCK_V_SLOVENII))
                .criterion(hasItem(ModBlocks.BLOCK_V_SLOVENII), conditionsFromItem(ModBlocks.BLOCK_V_SLOVENII))
                .offerTo(recipeExporter);
        createFenceRecipe(ModBlocks.V_SLOVENII_FENCE, Ingredient.ofItems(ModBlocks.BLOCK_V_SLOVENII))
                .criterion(hasItem(ModBlocks.BLOCK_V_SLOVENII), conditionsFromItem(ModBlocks.BLOCK_V_SLOVENII))
                .offerTo(recipeExporter);
        createFenceGateRecipe(ModBlocks.V_SLOVENII_FENCE_GATE, Ingredient.ofItems(ModBlocks.BLOCK_V_SLOVENII))
                .criterion(hasItem(ModBlocks.BLOCK_V_SLOVENII), conditionsFromItem(ModBlocks.BLOCK_V_SLOVENII))
                .offerTo(recipeExporter);
        createStairsRecipe(ModBlocks.V_SLOVENII_STAIRS, Ingredient.ofItems(ModBlocks.BLOCK_V_SLOVENII))
                .criterion(hasItem(ModBlocks.BLOCK_V_SLOVENII), conditionsFromItem(ModBlocks.BLOCK_V_SLOVENII))
                .offerTo(recipeExporter);

        //КРАФТ БЛОКОВ В СЛОВАКИИ

        offerWallRecipe(recipeExporter, RecipeCategory.MISC, ModBlocks.V_SLOVAKII_WALLS, ModBlocks.BLOCK_V_SLOVAKII);
        offerSlabRecipe(recipeExporter, RecipeCategory.MISC, ModBlocks.V_SLOVAKII_SLABS, ModBlocks.BLOCK_V_SLOVAKII);
        offerSingleOutputShapelessRecipe(recipeExporter, ModBlocks.V_SLOVAKII_BUTTONS, ModBlocks.BLOCK_V_SLOVAKII,"v_slovenii");
        offerPressurePlateRecipe(recipeExporter, ModBlocks.V_SLOVAKII_PRESSURE_PLATE, ModBlocks.BLOCK_V_SLOVAKII);

        createDoorRecipe(ModBlocks.V_SLOVAKII_DOORS, Ingredient.ofItems(ModBlocks.BLOCK_V_SLOVAKII))
                .criterion(hasItem(ModBlocks.BLOCK_V_SLOVAKII), conditionsFromItem(ModBlocks.BLOCK_V_SLOVAKII))
                .offerTo(recipeExporter);
        createTrapdoorRecipe(ModBlocks.V_SLOVAKII_TRAP_DOORS, Ingredient.ofItems(ModBlocks.BLOCK_V_SLOVAKII))
                .criterion(hasItem(ModBlocks.BLOCK_V_SLOVAKII), conditionsFromItem(ModBlocks.BLOCK_V_SLOVAKII))
                .offerTo(recipeExporter);
        createFenceRecipe(ModBlocks.V_SLOVAKII_FENCE, Ingredient.ofItems(ModBlocks.BLOCK_V_SLOVAKII))
                .criterion(hasItem(ModBlocks.BLOCK_V_SLOVAKII), conditionsFromItem(ModBlocks.BLOCK_V_SLOVAKII))
                .offerTo(recipeExporter);;
        createFenceGateRecipe(ModBlocks.V_SLOVAKII_FENCE_GATE, Ingredient.ofItems(ModBlocks.BLOCK_V_SLOVAKII))
                .criterion(hasItem(ModBlocks.BLOCK_V_SLOVAKII), conditionsFromItem(ModBlocks.BLOCK_V_SLOVAKII))
                .offerTo(recipeExporter);
        createStairsRecipe(ModBlocks.V_SLOVAKII_STAIRS, Ingredient.ofItems(ModBlocks.BLOCK_V_SLOVAKII))
                .criterion(hasItem(ModBlocks.BLOCK_V_SLOVAKII), conditionsFromItem(ModBlocks.BLOCK_V_SLOVAKII))
                .offerTo(recipeExporter);

        //КРАФТ БЛОКОВ ETC

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_SHELL_FOR_BARREL, 1)
                .pattern("III")
                .pattern("I I")
                .pattern("III")
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BREWING_BARREL, 1)
                .pattern("PSP")
                .pattern("PIP")
                .pattern("PSP")
                .input('P', ItemTags.PLANKS)
                .input('S',ItemTags.WOODEN_SLABS)
                .input('I', ModItems.IRON_SHELL_FOR_BARREL)
                .criterion(hasItem(ModItems.IRON_SHELL_FOR_BARREL), conditionsFromItem(ModItems.IRON_SHELL_FOR_BARREL))
                .offerTo(recipeExporter);

    }

}