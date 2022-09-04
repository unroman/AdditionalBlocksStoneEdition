package com.supermartijn642.additionalblocks.stone.data;

import com.supermartijn642.additionalblocks.stone.AdditionalBlocks;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.SingleItemRecipeBuilder;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;

import java.util.function.Consumer;
import java.util.function.Function;

public class AbSCRProvider {

    public static void stoneCuttingRecipes(Consumer<IFinishedRecipe> recipeConsumer, Function<IItemProvider, InventoryChangeTrigger.Instance> has) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE, Blocks.POLISHED_ANDESITE), AdditionalBlocks.polished_andesite_wall).unlocks("has_item", has.apply(Blocks.ANDESITE)).save(recipeConsumer, "abstoneedition:polished_andesite_wall_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE, Blocks.POLISHED_ANDESITE), AdditionalBlocks.andesite_bricks).unlocks("has_item", has.apply(Blocks.ANDESITE)).save(recipeConsumer, "abstoneedition:andesite_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE, Blocks.POLISHED_ANDESITE, AdditionalBlocks.andesite_bricks), AdditionalBlocks.andesite_bricks_stairs).unlocks("has_item", has.apply(Blocks.ANDESITE)).save(recipeConsumer, "abstoneedition:andesite_bricks_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE, Blocks.POLISHED_ANDESITE, AdditionalBlocks.andesite_bricks), AdditionalBlocks.andesite_bricks_wall).unlocks("has_item", has.apply(Blocks.ANDESITE)).save(recipeConsumer, "abstoneedition:andesite_bricks_wall_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ANDESITE, Blocks.POLISHED_ANDESITE, AdditionalBlocks.andesite_bricks), AdditionalBlocks.andesite_bricks_slab, 2).unlocks("has_item", has.apply(Blocks.ANDESITE)).save(recipeConsumer, "abstoneedition:andesite_bricks_slab_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.asphalt), AdditionalBlocks.asphalt_stairs).unlocks("has_item", has.apply(AdditionalBlocks.asphalt)).save(recipeConsumer, "abstoneedition:asphalt_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.asphalt), AdditionalBlocks.asphalt_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.asphalt)).save(recipeConsumer, "abstoneedition:asphalt_slab_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.black_marble), AdditionalBlocks.black_marble_bricks).unlocks("has_item", has.apply(AdditionalBlocks.black_marble)).save(recipeConsumer, "abstoneedition:black_marble_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.black_marble), AdditionalBlocks.black_marble_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.black_marble)).save(recipeConsumer, "abstoneedition:black_marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.black_marble), AdditionalBlocks.black_marble_stairs).unlocks("has_item", has.apply(AdditionalBlocks.black_marble)).save(recipeConsumer, "abstoneedition:black_marble_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.black_marble), AdditionalBlocks.black_marble_wall).unlocks("has_item", has.apply(AdditionalBlocks.black_marble)).save(recipeConsumer, "abstoneedition:black_marble_wall_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.black_marble, AdditionalBlocks.black_marble_bricks), AdditionalBlocks.black_marble_bricks_stairs).unlocks("has_item", has.apply(AdditionalBlocks.black_marble)).save(recipeConsumer, "abstoneedition:black_marble_bricks_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.black_marble, AdditionalBlocks.black_marble_bricks), AdditionalBlocks.black_marble_bricks_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.black_marble)).save(recipeConsumer, "abstoneedition:black_marble_bricks_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.black_marble, AdditionalBlocks.black_marble_bricks), AdditionalBlocks.black_marble_bricks_wall).unlocks("has_item", has.apply(AdditionalBlocks.black_marble)).save(recipeConsumer, "abstoneedition:black_marble_bricks_wall_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.bloodstone), AdditionalBlocks.bloodstone_bricks).unlocks("has_item", has.apply(AdditionalBlocks.bloodstone)).save(recipeConsumer, "abstoneedition:bloodstone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.bloodstone), AdditionalBlocks.bloodstone_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.bloodstone)).save(recipeConsumer, "abstoneedition:bloodstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.bloodstone), AdditionalBlocks.bloodstone_stairs).unlocks("has_item", has.apply(AdditionalBlocks.bloodstone)).save(recipeConsumer, "abstoneedition:bloodstone_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.bloodstone), AdditionalBlocks.bloodstone_wall).unlocks("has_item", has.apply(AdditionalBlocks.bloodstone)).save(recipeConsumer, "abstoneedition:bloodstone_wall_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.bloodstone, AdditionalBlocks.bloodstone_bricks), AdditionalBlocks.bloodstone_bricks_stairs).unlocks("has_item", has.apply(AdditionalBlocks.bloodstone)).save(recipeConsumer, "abstoneedition:bloodstone_bricks_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.bloodstone, AdditionalBlocks.bloodstone_bricks), AdditionalBlocks.bloodstone_bricks_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.bloodstone)).save(recipeConsumer, "abstoneedition:bloodstone_bricks_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.bloodstone, AdditionalBlocks.bloodstone_bricks), AdditionalBlocks.bloodstone_bricks_wall).unlocks("has_item", has.apply(AdditionalBlocks.bloodstone)).save(recipeConsumer, "abstoneedition:bloodstone_bricks_wall_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.brown_bricks), AdditionalBlocks.brown_bricks_stairs).unlocks("has_item", has.apply(AdditionalBlocks.brown_bricks)).save(recipeConsumer, "abstoneedition:brown_bricks_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.brown_bricks), AdditionalBlocks.brown_bricks_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.brown_bricks)).save(recipeConsumer, "abstoneedition:brown_bricks_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.brown_stone_path_curved), AdditionalBlocks.brown_stone_path_curved_stairs).unlocks("has_item", has.apply(AdditionalBlocks.brown_stone_path_curved)).save(recipeConsumer, "abstoneedition:brown_stone_path_curved_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.brown_stone_path_curved), AdditionalBlocks.brown_stone_path_curved_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.brown_stone_path_curved)).save(recipeConsumer, "abstoneedition:brown_stone_path_curved_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.brown_stone_path_straight), AdditionalBlocks.brown_stone_path_straight_stairs).unlocks("has_item", has.apply(AdditionalBlocks.brown_stone_path_straight)).save(recipeConsumer, "abstoneedition:brown_stone_path_straight_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.brown_stone_path_straight), AdditionalBlocks.brown_stone_path_straight_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.brown_stone_path_straight)).save(recipeConsumer, "abstoneedition:brown_stone_path_straight_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.brown_stone_pattern), AdditionalBlocks.brown_stone_pattern_stairs).unlocks("has_item", has.apply(AdditionalBlocks.brown_stone_pattern)).save(recipeConsumer, "abstoneedition:brown_stone_pattern_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.brown_stone_pattern), AdditionalBlocks.brown_stone_pattern_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.brown_stone_pattern)).save(recipeConsumer, "abstoneedition:brown_stone_pattern_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.brown_stone_tiles), AdditionalBlocks.brown_stone_tiles_stairs).unlocks("has_item", has.apply(AdditionalBlocks.brown_stone_tiles)).save(recipeConsumer, "abstoneedition:brown_stone_tiles_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.brown_stone_tiles), AdditionalBlocks.brown_stone_tiles_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.brown_stone_tiles)).save(recipeConsumer, "abstoneedition:brown_stone_tiles_slab_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.old_stone_path_curved), AdditionalBlocks.old_stone_path_curved_stairs).unlocks("has_item", has.apply(AdditionalBlocks.old_stone_path_curved)).save(recipeConsumer, "abstoneedition:old_stone_path_curved_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.old_stone_path_curved), AdditionalBlocks.old_stone_path_curved_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.old_stone_path_curved)).save(recipeConsumer, "abstoneedition:old_stone_path_curved_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.old_stone_path_straight), AdditionalBlocks.old_stone_path_straight_stairs).unlocks("has_item", has.apply(AdditionalBlocks.old_stone_path_straight)).save(recipeConsumer, "abstoneedition:old_stone_path_straight_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.old_stone_path_straight), AdditionalBlocks.old_stone_path_straight_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.old_stone_path_straight)).save(recipeConsumer, "abstoneedition:old_stone_path_straight_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.old_stone_pattern), AdditionalBlocks.old_stone_pattern_stairs).unlocks("has_item", has.apply(AdditionalBlocks.old_stone_pattern)).save(recipeConsumer, "abstoneedition:old_stone_pattern_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.old_stone_pattern), AdditionalBlocks.old_stone_pattern_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.old_stone_pattern)).save(recipeConsumer, "abstoneedition:old_stone_pattern_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.old_stone_tiles), AdditionalBlocks.old_stone_tiles_stairs).unlocks("has_item", has.apply(AdditionalBlocks.old_stone_tiles)).save(recipeConsumer, "abstoneedition:old_stone_tiles_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.old_stone_tiles), AdditionalBlocks.old_stone_tiles_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.old_stone_tiles)).save(recipeConsumer, "abstoneedition:old_stone_tiles_slab_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.stone_path_curved), AdditionalBlocks.stone_path_curved_stairs).unlocks("has_item", has.apply(AdditionalBlocks.stone_path_curved)).save(recipeConsumer, "abstoneedition:stone_path_curved_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.stone_path_curved), AdditionalBlocks.stone_path_curved_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.stone_path_curved)).save(recipeConsumer, "abstoneedition:stone_path_curved_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.stone_path_straight), AdditionalBlocks.stone_path_straight_stairs).unlocks("has_item", has.apply(AdditionalBlocks.stone_path_straight)).save(recipeConsumer, "abstoneedition:stone_path_straight_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.stone_path_straight), AdditionalBlocks.stone_path_straight_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.stone_path_straight)).save(recipeConsumer, "abstoneedition:stone_path_straight_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.stone_pattern), AdditionalBlocks.stone_pattern_stairs).unlocks("has_item", has.apply(AdditionalBlocks.stone_pattern)).save(recipeConsumer, "abstoneedition:stone_pattern_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.stone_pattern), AdditionalBlocks.stone_pattern_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.stone_pattern)).save(recipeConsumer, "abstoneedition:stone_pattern_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.stone_tiles), AdditionalBlocks.stone_tiles_stairs).unlocks("has_item", has.apply(AdditionalBlocks.stone_tiles)).save(recipeConsumer, "abstoneedition:stone_tiles_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.stone_tiles), AdditionalBlocks.stone_tiles_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.stone_tiles)).save(recipeConsumer, "abstoneedition:stone_tiles_slab_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.charred_planks), AdditionalBlocks.charred_stairs).unlocks("has_item", has.apply(AdditionalBlocks.charred_planks)).save(recipeConsumer, "abstoneedition:charred_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.charred_planks), AdditionalBlocks.charred_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.charred_planks)).save(recipeConsumer, "abstoneedition:charred_slab_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE, Blocks.POLISHED_DIORITE), AdditionalBlocks.polished_diorite_wall).unlocks("has_item", has.apply(Blocks.DIORITE)).save(recipeConsumer, "abstoneedition:polished_diorite_wall_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE, Blocks.POLISHED_DIORITE), AdditionalBlocks.diorite_bricks).unlocks("has_item", has.apply(Blocks.DIORITE)).save(recipeConsumer, "abstoneedition:diorite_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE, Blocks.POLISHED_DIORITE, AdditionalBlocks.diorite_bricks), AdditionalBlocks.diorite_bricks_stairs).unlocks("has_item", has.apply(Blocks.DIORITE)).save(recipeConsumer, "abstoneedition:diorite_bricks_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE, Blocks.POLISHED_DIORITE, AdditionalBlocks.diorite_bricks), AdditionalBlocks.diorite_bricks_wall).unlocks("has_item", has.apply(Blocks.DIORITE)).save(recipeConsumer, "abstoneedition:diorite_bricks_wall_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DIORITE, Blocks.POLISHED_DIORITE, AdditionalBlocks.diorite_bricks), AdditionalBlocks.diorite_bricks_slab, 2).unlocks("has_item", has.apply(Blocks.DIORITE)).save(recipeConsumer, "abstoneedition:diorite_bricks_slab_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GLOWSTONE), AdditionalBlocks.glowstone_stairs).unlocks("has_item", has.apply(Blocks.GLOWSTONE)).save(recipeConsumer, "abstoneedition:glowstone_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GLOWSTONE), AdditionalBlocks.glowstone_slab, 2).unlocks("has_item", has.apply(Blocks.GLOWSTONE)).save(recipeConsumer, "abstoneedition:glowstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GLOWSTONE), AdditionalBlocks.glowstone_wall).unlocks("has_item", has.apply(Blocks.GLOWSTONE)).save(recipeConsumer, "abstoneedition:glowstone_wall_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GLOWSTONE), AdditionalBlocks.glowstone_bricks).unlocks("has_item", has.apply(Blocks.GLOWSTONE)).save(recipeConsumer, "abstoneedition:glowstone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GLOWSTONE, AdditionalBlocks.glowstone_bricks), AdditionalBlocks.glowstone_bricks_stairs).unlocks("has_item", has.apply(Blocks.GLOWSTONE)).save(recipeConsumer, "abstoneedition:glowstone_bricks_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GLOWSTONE, AdditionalBlocks.glowstone_bricks), AdditionalBlocks.glowstone_bricks_slab, 2).unlocks("has_item", has.apply(Blocks.GLOWSTONE)).save(recipeConsumer, "abstoneedition:glowstone_bricks_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GLOWSTONE, AdditionalBlocks.glowstone_bricks), AdditionalBlocks.glowstone_bricks_wall).unlocks("has_item", has.apply(Blocks.GLOWSTONE)).save(recipeConsumer, "abstoneedition:glowstone_bricks_wall_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE, Blocks.POLISHED_GRANITE), AdditionalBlocks.polished_granite_wall).unlocks("has_item", has.apply(Blocks.GRANITE)).save(recipeConsumer, "abstoneedition:polished_granite_wall_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE, Blocks.POLISHED_GRANITE), AdditionalBlocks.granite_bricks).unlocks("has_item", has.apply(Blocks.GRANITE)).save(recipeConsumer, "abstoneedition:granite_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE, Blocks.POLISHED_GRANITE, AdditionalBlocks.granite_bricks), AdditionalBlocks.granite_bricks_stairs).unlocks("has_item", has.apply(Blocks.GRANITE)).save(recipeConsumer, "abstoneedition:granite_bricks_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE, Blocks.POLISHED_GRANITE, AdditionalBlocks.granite_bricks), AdditionalBlocks.granite_bricks_wall).unlocks("has_item", has.apply(Blocks.GRANITE)).save(recipeConsumer, "abstoneedition:granite_bricks_wall_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE, Blocks.POLISHED_GRANITE, AdditionalBlocks.granite_bricks), AdditionalBlocks.granite_bricks_slab, 2).unlocks("has_item", has.apply(Blocks.GRANITE)).save(recipeConsumer, "abstoneedition:granite_bricks_slab_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.gray_bricks), AdditionalBlocks.gray_bricks_stairs).unlocks("has_item", has.apply(AdditionalBlocks.gray_bricks)).save(recipeConsumer, "abstoneedition:gray_bricks_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.gray_bricks), AdditionalBlocks.gray_bricks_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.gray_bricks)).save(recipeConsumer, "abstoneedition:gray_bricks_slab_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.limestone), AdditionalBlocks.limestone_bricks).unlocks("has_item", has.apply(AdditionalBlocks.limestone)).save(recipeConsumer, "abstoneedition:limestone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.limestone), AdditionalBlocks.limestone_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.limestone)).save(recipeConsumer, "abstoneedition:limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.limestone), AdditionalBlocks.limestone_stairs).unlocks("has_item", has.apply(AdditionalBlocks.limestone)).save(recipeConsumer, "abstoneedition:limestone_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.limestone), AdditionalBlocks.limestone_wall).unlocks("has_item", has.apply(AdditionalBlocks.limestone)).save(recipeConsumer, "abstoneedition:limestone_wall_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.limestone, AdditionalBlocks.limestone_bricks), AdditionalBlocks.limestone_bricks_stairs).unlocks("has_item", has.apply(AdditionalBlocks.limestone)).save(recipeConsumer, "abstoneedition:limestone_bricks_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.limestone, AdditionalBlocks.limestone_bricks), AdditionalBlocks.limestone_bricks_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.limestone)).save(recipeConsumer, "abstoneedition:limestone_bricks_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.limestone, AdditionalBlocks.limestone_bricks), AdditionalBlocks.limestone_bricks_wall).unlocks("has_item", has.apply(AdditionalBlocks.limestone)).save(recipeConsumer, "abstoneedition:limestone_bricks_wall_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.marble), AdditionalBlocks.marble_bricks).unlocks("has_item", has.apply(AdditionalBlocks.marble)).save(recipeConsumer, "abstoneedition:marble_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.marble), AdditionalBlocks.marble_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.marble)).save(recipeConsumer, "abstoneedition:marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.marble), AdditionalBlocks.marble_stairs).unlocks("has_item", has.apply(AdditionalBlocks.marble)).save(recipeConsumer, "abstoneedition:marble_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.marble), AdditionalBlocks.marble_wall).unlocks("has_item", has.apply(AdditionalBlocks.marble)).save(recipeConsumer, "abstoneedition:marble_wall_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.marble, AdditionalBlocks.marble_bricks), AdditionalBlocks.marble_bricks_stairs).unlocks("has_item", has.apply(AdditionalBlocks.marble)).save(recipeConsumer, "abstoneedition:marble_bricks_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.marble, AdditionalBlocks.marble_bricks), AdditionalBlocks.marble_bricks_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.marble)).save(recipeConsumer, "abstoneedition:marble_bricks_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.marble, AdditionalBlocks.marble_bricks), AdditionalBlocks.marble_bricks_wall).unlocks("has_item", has.apply(AdditionalBlocks.marble)).save(recipeConsumer, "abstoneedition:marble_bricks_wall_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.marble), AdditionalBlocks.marble_pillar).unlocks("has_item", has.apply(AdditionalBlocks.marble)).save(recipeConsumer, "abstoneedition:marble_pillar_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.smooth_black_marble), AdditionalBlocks.smooth_black_marble_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.smooth_black_marble)).save(recipeConsumer, "abstoneedition:smooth_black_marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.smooth_black_marble), AdditionalBlocks.smooth_black_marble_stairs).unlocks("has_item", has.apply(AdditionalBlocks.smooth_black_marble)).save(recipeConsumer, "abstoneedition:smooth_black_marble_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.smooth_black_marble), AdditionalBlocks.smooth_black_marble_wall).unlocks("has_item", has.apply(AdditionalBlocks.smooth_black_marble)).save(recipeConsumer, "abstoneedition:smooth_black_marble_wall_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.smooth_bloodstone), AdditionalBlocks.smooth_bloodstone_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.smooth_bloodstone)).save(recipeConsumer, "abstoneedition:smooth_bloodstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.smooth_bloodstone), AdditionalBlocks.smooth_bloodstone_stairs).unlocks("has_item", has.apply(AdditionalBlocks.smooth_bloodstone)).save(recipeConsumer, "abstoneedition:smooth_bloodstone_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.smooth_bloodstone), AdditionalBlocks.smooth_bloodstone_wall).unlocks("has_item", has.apply(AdditionalBlocks.smooth_bloodstone)).save(recipeConsumer, "abstoneedition:smooth_bloodstone_wall_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.smooth_limestone), AdditionalBlocks.smooth_limestone_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.smooth_limestone)).save(recipeConsumer, "abstoneedition:smooth_limestone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.smooth_limestone), AdditionalBlocks.smooth_limestone_stairs).unlocks("has_item", has.apply(AdditionalBlocks.smooth_limestone)).save(recipeConsumer, "abstoneedition:smooth_limestone_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.smooth_limestone), AdditionalBlocks.smooth_limestone_wall).unlocks("has_item", has.apply(AdditionalBlocks.smooth_limestone)).save(recipeConsumer, "abstoneedition:smooth_limestone_wall_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.smooth_glowstone), AdditionalBlocks.smooth_glowstone_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.smooth_glowstone)).save(recipeConsumer, "abstoneedition:smooth_glowstone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.smooth_glowstone), AdditionalBlocks.smooth_glowstone_stairs).unlocks("has_item", has.apply(AdditionalBlocks.smooth_glowstone)).save(recipeConsumer, "abstoneedition:smooth_glowstone_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.smooth_glowstone), AdditionalBlocks.smooth_glowstone_wall).unlocks("has_item", has.apply(AdditionalBlocks.smooth_glowstone)).save(recipeConsumer, "abstoneedition:smooth_glowstone_wall_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.smooth_marble), AdditionalBlocks.smooth_marble_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.smooth_marble)).save(recipeConsumer, "abstoneedition:smooth_marble_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.smooth_marble), AdditionalBlocks.smooth_marble_stairs).unlocks("has_item", has.apply(AdditionalBlocks.smooth_marble)).save(recipeConsumer, "abstoneedition:smooth_marble_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.smooth_marble), AdditionalBlocks.smooth_marble_wall).unlocks("has_item", has.apply(AdditionalBlocks.smooth_marble)).save(recipeConsumer, "abstoneedition:smooth_marble_wall_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.smooth_smooth_stone), AdditionalBlocks.smooth_smooth_stone_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.smooth_smooth_stone)).save(recipeConsumer, "abstoneedition:smooth_smooth_stone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.smooth_smooth_stone), AdditionalBlocks.smooth_smooth_stone_stairs).unlocks("has_item", has.apply(AdditionalBlocks.smooth_smooth_stone)).save(recipeConsumer, "abstoneedition:smooth_smooth_stone_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.smooth_smooth_stone), AdditionalBlocks.smooth_smooth_stone_wall).unlocks("has_item", has.apply(AdditionalBlocks.smooth_smooth_stone)).save(recipeConsumer, "abstoneedition:smooth_smooth_stone_wall_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE), AdditionalBlocks.smooth_stone_stairs).unlocks("has_item", has.apply(Blocks.SMOOTH_STONE)).save(recipeConsumer, "abstoneedition:smooth_stone_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE), AdditionalBlocks.smooth_stone_wall).unlocks("has_item", has.apply(Blocks.SMOOTH_STONE)).save(recipeConsumer, "abstoneedition:smooth_stone_wall_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE), AdditionalBlocks.smooth_stone_bricks).unlocks("has_item", has.apply(Blocks.SMOOTH_STONE)).save(recipeConsumer, "abstoneedition:smooth_stone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE, AdditionalBlocks.smooth_stone_bricks), AdditionalBlocks.smooth_stone_bricks_stairs).unlocks("has_item", has.apply(Blocks.SMOOTH_STONE)).save(recipeConsumer, "abstoneedition:smooth_stone_bricks_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE, AdditionalBlocks.smooth_stone_bricks), AdditionalBlocks.smooth_stone_bricks_slab, 2).unlocks("has_item", has.apply(Blocks.SMOOTH_STONE)).save(recipeConsumer, "abstoneedition:smooth_stone_bricks_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.SMOOTH_STONE, AdditionalBlocks.smooth_stone_bricks), AdditionalBlocks.smooth_stone_bricks_wall).unlocks("has_item", has.apply(Blocks.SMOOTH_STONE)).save(recipeConsumer, "abstoneedition:smooth_stone_bricks_wall_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), AdditionalBlocks.stone_wall).unlocks("has_item", has.apply(Blocks.STONE)).save(recipeConsumer, "abstoneedition:stone_wall_stonecutting");
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.STONE), AdditionalBlocks.stone_brick_block).unlocks("has_item", has.apply(Blocks.STONE)).save(recipeConsumer, "abstoneedition:stone_brick_block_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.stone_brick_block, Blocks.STONE), AdditionalBlocks.stone_brick_block_slab, 2).unlocks("has_item", has.apply(Blocks.STONE)).save(recipeConsumer, "abstoneedition:stone_brick_block_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.stone_brick_block, Blocks.STONE), AdditionalBlocks.stone_brick_block_stairs).unlocks("has_item", has.apply(Blocks.STONE)).save(recipeConsumer, "abstoneedition:stone_brick_block_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.stone_brick_block, Blocks.STONE), AdditionalBlocks.stone_brick_block_wall).unlocks("has_item", has.apply(Blocks.STONE)).save(recipeConsumer, "abstoneedition:stone_brick_block_wall_stonecutting");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.volcanic_stone), AdditionalBlocks.volcanic_stone_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.volcanic_stone)).save(recipeConsumer, "abstoneedition:volcanic_stone_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.volcanic_stone), AdditionalBlocks.volcanic_stone_stairs).unlocks("has_item", has.apply(AdditionalBlocks.volcanic_stone)).save(recipeConsumer, "abstoneedition:volcanic_stone_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.volcanic_stone), AdditionalBlocks.volcanic_stone_wall).unlocks("has_item", has.apply(AdditionalBlocks.volcanic_stone)).save(recipeConsumer, "abstoneedition:volcanic_stone_wall_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.volcanic_stone), AdditionalBlocks.volcanic_stone_bricks).unlocks("has_item", has.apply(AdditionalBlocks.volcanic_stone)).save(recipeConsumer,"abstoneedition:volcanic_stone_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.volcanic_stone, AdditionalBlocks.volcanic_stone_bricks), AdditionalBlocks.volcanic_stone_bricks_stairs).unlocks("has_item", has.apply(AdditionalBlocks.volcanic_stone)).save(recipeConsumer, "abstoneedition:volcanic_stone_bricks_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.volcanic_stone, AdditionalBlocks.volcanic_stone_bricks), AdditionalBlocks.volcanic_stone_bricks_slab, 2).unlocks("has_item", has.apply(AdditionalBlocks.volcanic_stone)).save(recipeConsumer, "abstoneedition:volcanic_stone_bricks_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AdditionalBlocks.volcanic_stone, AdditionalBlocks.volcanic_stone_bricks), AdditionalBlocks.volcanic_stone_bricks_wall).unlocks("has_item", has.apply(AdditionalBlocks.volcanic_stone)).save(recipeConsumer, "abstoneedition:volcanic_stone_bricks_wall_stonecutting");
        
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.OBSIDIAN), AdditionalBlocks.obsidian_stairs).unlocks("has_item", has.apply(Blocks.OBSIDIAN)).save(recipeConsumer, "abstoneedition:obsidian_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.OBSIDIAN), AdditionalBlocks.obsidian_slab, 2).unlocks("has_item", has.apply(Blocks.OBSIDIAN)).save(recipeConsumer, "abstoneedition:obsidian_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.OBSIDIAN), AdditionalBlocks.obsidian_wall).unlocks("has_item", has.apply(Blocks.OBSIDIAN)).save(recipeConsumer, "abstoneedition:obsidian_wall_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.OBSIDIAN), AdditionalBlocks.obsidian_bricks).unlocks("has_item", has.apply(Blocks.OBSIDIAN)).save(recipeConsumer, "abstoneedition:obsidian_bricks_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.OBSIDIAN, AdditionalBlocks.obsidian_bricks), AdditionalBlocks.obsidian_bricks_stairs).unlocks("has_item", has.apply(Blocks.OBSIDIAN)).save(recipeConsumer, "abstoneedition:obsidian_bricks_stairs_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.OBSIDIAN, AdditionalBlocks.obsidian_bricks), AdditionalBlocks.obsidian_bricks_slab, 2).unlocks("has_item", has.apply(Blocks.OBSIDIAN)).save(recipeConsumer, "abstoneedition:obsidian_bricks_slab_stonecutting");
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.OBSIDIAN, AdditionalBlocks.obsidian_bricks), AdditionalBlocks.obsidian_bricks_wall).unlocks("has_item", has.apply(Blocks.OBSIDIAN)).save(recipeConsumer, "abstoneedition:obsidian_bricks_wall_stonecutting");
    }
}
