package net.dude.mymod.datagen;

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

        createDoorRecipe(ModBlocks.V_SLOVENII_DOORS, Ingredient.ofItems(ModBlocks.BLOCK_V_SLOVENII));
        createTrapdoorRecipe(ModBlocks.V_SLOVENII_DOORS, Ingredient.ofItems(ModBlocks.BLOCK_V_SLOVENII));
        //1.первый комент крч я в душе не ебу есть датаген по стенам и так же вроде по заборам но нихуя не работает почему то->
        //>по этому я сделал чуток через костыль?? хотя костылем и не сказать вроде оно не работало и мне похуй я сделал так 06.08.25
        //edit: время комментов тут не писал т.к думал будет один так что примерное время написание этого комента 3:40+-
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.V_SLOVENII_FENCE, 3)
                .pattern("VSV")
                .pattern("VSV")
                .input('V', ModBlocks.BLOCK_V_SLOVENII)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.BLOCK_V_SLOVENII), conditionsFromItem(ModBlocks.BLOCK_V_SLOVENII))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.V_SLOVENII_FENCE_GATE, 3)
                .pattern("SVS")
                .pattern("SVS")
                .input('V', ModBlocks.BLOCK_V_SLOVENII)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.BLOCK_V_SLOVENII), conditionsFromItem(ModBlocks.BLOCK_V_SLOVENII))
                .offerTo(recipeExporter);
        //2 точная такая же хуйня что с забором уже подумываю что я еблан и не правильно делаю тоесть надо разобраться с этим
        //06.08.25 4:08
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.V_SLOVENII_STAIRS, 3)
                .pattern("V  ")
                .pattern("VV ")
                .pattern("VVV")
                .input('V', ModBlocks.BLOCK_V_SLOVENII)
                .criterion(hasItem(ModBlocks.BLOCK_V_SLOVENII), conditionsFromItem(ModBlocks.BLOCK_V_SLOVENII))
                .offerTo(recipeExporter);

        offerWallRecipe(recipeExporter, RecipeCategory.MISC, ModBlocks.V_SLOVAKII_WALLS, ModBlocks.BLOCK_V_SLOVAKII);
        offerSlabRecipe(recipeExporter, RecipeCategory.MISC, ModBlocks.V_SLOVAKII_SLABS, ModBlocks.BLOCK_V_SLOVAKII);
        offerSingleOutputShapelessRecipe(recipeExporter, ModBlocks.V_SLOVAKII_BUTTONS, ModBlocks.BLOCK_V_SLOVAKII,"v_slovenii");
        offerPressurePlateRecipe(recipeExporter, ModBlocks.V_SLOVAKII_PRESSURE_PLATE, ModBlocks.BLOCK_V_SLOVAKII);

        createDoorRecipe(ModBlocks.V_SLOVAKII_DOORS, Ingredient.ofItems(ModBlocks.BLOCK_V_SLOVAKII));
        createTrapdoorRecipe(ModBlocks.V_SLOVAKII_DOORS, Ingredient.ofItems(ModBlocks.BLOCK_V_SLOVAKII));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.V_SLOVAKII_FENCE, 3)
                .pattern("VSV")
                .pattern("VSV")
                .input('V', ModBlocks.BLOCK_V_SLOVAKII)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.BLOCK_V_SLOVAKII), conditionsFromItem(ModBlocks.BLOCK_V_SLOVAKII))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.V_SLOVAKII_FENCE_GATE, 3)
                .pattern("SVS")
                .pattern("SVS")
                .input('V', ModBlocks.BLOCK_V_SLOVAKII)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.BLOCK_V_SLOVAKII), conditionsFromItem(ModBlocks.BLOCK_V_SLOVAKII))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.V_SLOVAKII_STAIRS, 3)
                .pattern("V  ")
                .pattern("VV ")
                .pattern("VVV")
                .input('V', ModBlocks.BLOCK_V_SLOVAKII)
                .criterion(hasItem(ModBlocks.BLOCK_V_SLOVAKII), conditionsFromItem(ModBlocks.BLOCK_V_SLOVAKII))
                .offerTo(recipeExporter);
        //3 крч вроде как я понял как юзать заборы там лестницы но тестить не буду и пока юзать


    }

}
