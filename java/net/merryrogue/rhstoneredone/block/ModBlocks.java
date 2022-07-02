package net.merryrogue.rhstoneredone.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
//import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.merryrogue.rhstoneredone.StoneRedone;
import net.merryrogue.rhstoneredone.block.custom.ModStairsBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks
{
    // This is the template for all new blocks
    //public static final Block BLOCK_NAME = registerBlock("block_name",
    //      new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).
    //              requiresTool()));

    // Cobbled Andesite, Diorite, and Granite
    public static final Block COBBLED_ANDESITE = registerBlock("cobbled_andesite",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()));

    public static final Block COBBLED_DIORITE = registerBlock("cobbled_diorite",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()));

    public static final Block COBBLED_GRANITE = registerBlock("cobbled_granite",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()));

    // Stone and Mossy Stone
    public static final Block CHISELED_SIMPLE_MOSSY_STONE_BRICKS = registerBlock("chiseled_simple_mossy_stone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()));

    public static final Block CHISELED_PIGLIN_STONE_BRICKS = registerBlock("chiseled_piglin_stone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()));

    public static final Block CHISELED_PIGLIN_MOSSY_STONE_BRICKS = registerBlock("chiseled_piglin_mossy_stone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()));

    // Sandstone and Red Sandstone
    public static final Block CHISELED_WITHER_SANDSTONE = registerBlock("chiseled_wither_sandstone",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(0.8f).requiresTool()));

    public static final Block CHISELED_CREEPER_RED_SANDSTONE = registerBlock("chiseled_creeper_red_sandstone",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(0.8f).requiresTool()));

    // Nether Bricks and Red Nether Bricks
    public static final Block CHISELED_SIMPLE_NETHER_BRICKS = registerBlock("chiseled_simple_nether_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CHISELED_PIGLIN_NETHER_BRICKS = registerBlock("chiseled_piglin_nether_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block FUNGAL_NETHER_BRICKS = registerBlock("fungal_nether_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CHISELED_SIMPLE_FUNGAL_NETHER_BRICKS = registerBlock("chiseled_simple_fungal_nether_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CHISELED_SKELETON_FUNGAL_NETHER_BRICKS = registerBlock("chiseled_skeleton_fungal_nether_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CHISELED_PIGLIN_FUNGAL_NETHER_BRICKS = registerBlock("chiseled_piglin_fungal_nether_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CHISELED_SIMPLE_RED_NETHER_BRICKS = registerBlock("chiseled_simple_red_nether_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CHISELED_SKELETON_RED_NETHER_BRICKS = registerBlock("chiseled_skeleton_red_nether_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CHISELED_PIGLIN_RED_NETHER_BRICKS = registerBlock("chiseled_piglin_red_nether_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block FUNGAL_RED_NETHER_BRICKS = registerBlock("fungal_red_nether_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CHISELED_SIMPLE_FUNGAL_RED_NETHER_BRICKS = registerBlock("chiseled_simple_fungal_red_nether_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CHISELED_SKELETON_FUNGAL_RED_NETHER_BRICKS = registerBlock("chiseled_skeleton_fungal_red_nether_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CHISELED_PIGLIN_FUNGAL_RED_NETHER_BRICKS = registerBlock("chiseled_piglin_fungal_red_nether_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    // Blackstone
    public static final Block COBBLED_BLACKSTONE = registerBlock("cobbled_blackstone",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()));

    public static final Block CHISELED_SIMPLE_POLISHED_BLACKSTONE_BRICKS = registerBlock("chiseled_simple_polished_blackstone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()));

    // Deepslate
    public static final Block CHISELED_SIMPLE_DEEPSLATE_BRICKS = registerBlock("chiseled_simple_deepslate_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(3.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final Block CHISELED_PIGLIN_DEEPSLATE_BRICKS = registerBlock("chiseled_piglin_deepslate_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(3.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    // Prismarine
    public static final Block CHISELED_GUARDIAN_PRISMARINE_BRICKS = registerBlock("chiseled_guardian_prismarine_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()));

    public static final Block CHISELED_GUARDIAN_DARK_PRISMARINE = registerBlock("chiseled_guardian_dark_prismarine",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()));


    // This is the template for all new walls
    //public static final WallBlock WALL_NAME = (WallBlock) registerBlock("wall_name",
    //        new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).
    //                requiresTool()));

    // Stone
    public static final WallBlock STONE_WALL = (WallBlock) registerBlock("stone_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()));

    public static final WallBlock SMOOTH_STONE_WALL = (WallBlock) registerBlock("smooth_stone_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()));

    public static final WallBlock CRACKED_STONE_BRICK_WALL = (WallBlock) registerBlock("cracked_stone_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()));

    // Andesite, Diorite, and Granite
    public static final WallBlock POLISHED_ANDESITE_WALL = (WallBlock) registerBlock("polished_andesite_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()));

    public static final WallBlock POLISHED_DIORITE_WALL = (WallBlock) registerBlock("polished_diorite_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()));

    public static final WallBlock POLISHED_GRANITE_WALL = (WallBlock) registerBlock("polished_granite_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()));

    public static final WallBlock COBBLED_ANDESITE_WALL = (WallBlock) registerBlock("cobbled_andesite_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()));

    public static final WallBlock COBBLED_DIORITE_WALL = (WallBlock) registerBlock("cobbled_diorite_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()));

    public static final WallBlock COBBLED_GRANITE_WALL = (WallBlock) registerBlock("cobbled_granite_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()));

    // Sandstone and Red Sandstone
    public static final WallBlock SMOOTH_SANDSTONE_WALL = (WallBlock) registerBlock("smooth_sandstone_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(0.8f).requiresTool()));

    public static final WallBlock SMOOTH_RED_SANDSTONE_WALL = (WallBlock) registerBlock("smooth_red_sandstone_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(0.8f).requiresTool()));

    public static final WallBlock CUT_SANDSTONE_WALL = (WallBlock) registerBlock("cut_sandstone_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(0.8f).requiresTool()));

    public static final WallBlock CUT_RED_SANDSTONE_WALL = (WallBlock) registerBlock("cut_red_sandstone_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(0.8f).requiresTool()));

    // Netherrack
    public static final WallBlock NETHERRACK_WALL = (WallBlock) registerBlock("netherrack_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(0.4f).resistance(0.4f).requiresTool()
                    .sounds(BlockSoundGroup.NETHERRACK)));

    // Nether Bricks and Red Nether Bricks
    public static final WallBlock FUNGAL_NETHER_BRICK_WALL = (WallBlock) registerBlock("fungal_nether_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final WallBlock CRACKED_NETHER_BRICK_WALL = (WallBlock) registerBlock("cracked_nether_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final WallBlock FUNGAL_RED_NETHER_BRICK_WALL = (WallBlock) registerBlock("fungal_red_nether_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final WallBlock CRACKED_RED_NETHER_BRICK_WALL = (WallBlock) registerBlock("cracked_red_nether_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    // Blackstone
    public static final WallBlock COBBLED_BLACKSTONE_WALL = (WallBlock) registerBlock("cobbled_blackstone_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()));

    public static final WallBlock CRACKED_BLACKSTONE_BRICK_WALL = (WallBlock) registerBlock("cracked_blackstone_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()));

    // Deepslate
    public static final WallBlock DEEPSLATE_WALL = (WallBlock) registerBlock("deepslate_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(3.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE)));

    public static final WallBlock CRACKED_DEEPSLATE_BRICK_WALL = (WallBlock) registerBlock("cracked_deepslate_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(3.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final WallBlock CRACKED_DEEPSLATE_TILE_WALL = (WallBlock) registerBlock("cracked_deepslate_tile_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(3.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)));

    // Prismarine
    public static final WallBlock PRISMARINE_BRICK_WALL = (WallBlock) registerBlock("prismarine_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()));

    public static final WallBlock DARK_PRISMARINE_WALL = (WallBlock) registerBlock("dark_prismarine_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()));


    // This is the template for all new stairs
    // For stairs made from vanilla materials:
    //public static final Block STAIRS_NAME = registerBlock("stairs_name",
    //        new ModStairsBlock(Blocks.VANILLA_BASE_STONE.getDefaultState(), FabricBlockSettings.of(Material.STONE).
    //                hardness(2.0f).resistance(6.0f).requiresTool()));

    // For stairs made from modded materials:
    //public static final Block STAIRS_NAME = registerBlock("stairs_name",
    //        new ModStairsBlock(ModBlocks.BASE_STONE.getDefaultState(), FabricBlockSettings.of(Material.STONE).
    //                hardness(2.0f).resistance(6.0f).requiresTool()));

    // Stone
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            new ModStairsBlock(Blocks.SMOOTH_STONE.getDefaultState(), FabricBlockSettings.
                    of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()));

    public static final Block CRACKED_STONE_BRICK_STAIRS = registerBlock("cracked_stone_brick_stairs",
            new ModStairsBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), FabricBlockSettings.
                    of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()));

    // Andesite, Diorite, and Granite
    public static final Block COBBLED_ANDESITE_STAIRS = registerBlock("cobbled_andesite_stairs",
            new ModStairsBlock(ModBlocks.COBBLED_ANDESITE.getDefaultState(), FabricBlockSettings.
                    of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()));

    public static final Block COBBLED_DIORITE_STAIRS = registerBlock("cobbled_diorite_stairs",
            new ModStairsBlock(ModBlocks.COBBLED_DIORITE.getDefaultState(), FabricBlockSettings.
                    of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()));

    public static final Block COBBLED_GRANITE_STAIRS = registerBlock("cobbled_granite_stairs",
            new ModStairsBlock(ModBlocks.COBBLED_GRANITE.getDefaultState(), FabricBlockSettings.
                    of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()));

    // Sandstone and Red Sandstone
    public static final Block CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            new ModStairsBlock(Blocks.SANDSTONE.getDefaultState(), FabricBlockSettings.
                    of(Material.STONE).hardness(2.0f).resistance(0.8f).requiresTool()));

    public static final Block CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            new ModStairsBlock(Blocks.RED_SANDSTONE.getDefaultState(), FabricBlockSettings.
                    of(Material.STONE).hardness(2.0f).resistance(0.8f).requiresTool()));

    // Netherrack
    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            new ModStairsBlock(Blocks.NETHERRACK.getDefaultState(), FabricBlockSettings.
                    of(Material.STONE).hardness(0.4f).resistance(0.4f).requiresTool()
                    .sounds(BlockSoundGroup.NETHERRACK)));

    // Nether Bricks and Red Nether Bricks
    public static final Block FUNGAL_NETHER_BRICK_STAIRS = registerBlock("fungal_nether_brick_stairs",
            new ModStairsBlock(ModBlocks.FUNGAL_NETHER_BRICKS.getDefaultState(), FabricBlockSettings.
                    of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRACKED_NETHER_BRICK_STAIRS = registerBlock("cracked_nether_brick_stairs",
            new ModStairsBlock(ModBlocks.FUNGAL_NETHER_BRICKS.getDefaultState(), FabricBlockSettings.
                    of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block FUNGAL_RED_NETHER_BRICK_STAIRS = registerBlock("fungal_red_nether_brick_stairs",
            new ModStairsBlock(ModBlocks.FUNGAL_RED_NETHER_BRICKS.getDefaultState(), FabricBlockSettings.
                    of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRACKED_RED_NETHER_BRICK_STAIRS = registerBlock("cracked_red_nether_brick_stairs",
            new ModStairsBlock(ModBlocks.FUNGAL_NETHER_BRICKS.getDefaultState(), FabricBlockSettings.
                    of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    // Blackstone
    public static final Block COBBLED_BLACKSTONE_STAIRS = registerBlock("cobbled_blackstone_stairs",
            new ModStairsBlock(ModBlocks.COBBLED_BLACKSTONE.getDefaultState(), FabricBlockSettings.
                    of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()));

    public static final Block CRACKED_BLACKSTONE_BRICK_STAIRS = registerBlock("cracked_blackstone_brick_stairs",
            new ModStairsBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(), FabricBlockSettings.
                    of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()));

    // Deepslate
    public static final Block DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            new ModStairsBlock(Blocks.DEEPSLATE.getDefaultState(), FabricBlockSettings.
                    of(Material.STONE).hardness(3.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block CRACKED_DEEPSLATE_BRICK_STAIRS = registerBlock("cracked_deepslate_brick_stairs",
            new ModStairsBlock(Blocks.DEEPSLATE_BRICKS.getDefaultState(), FabricBlockSettings.
                    of(Material.STONE).hardness(3.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final Block CRACKED_DEEPSLATE_TILE_STAIRS = registerBlock("cracked_deepslate_tile_stairs",
            new ModStairsBlock(Blocks.DEEPSLATE_TILES.getDefaultState(), FabricBlockSettings.
                    of(Material.STONE).hardness(3.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)));


    // This is the template for all new slabs
    //public static final Block SLAB_NAME = registerBlock("slab_name",
    //        new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).
    //                requiresTool()));

    // Stone
    public static final Block CRACKED_STONE_BRICK_SLAB = registerBlock("cracked_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).
                    requiresTool()));

    // Andesite, Diorite, and Granite
    public static final Block COBBLED_ANDESITE_SLAB = registerBlock("cobbled_andesite_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).
                    requiresTool()));

    public static final Block COBBLED_DIORITE_SLAB = registerBlock("cobbled_diorite_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).
                    requiresTool()));

    public static final Block COBBLED_GRANITE_SLAB = registerBlock("cobbled_granite_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).
                    requiresTool()));

    // Netherrack
    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(0.4f).resistance(0.4f).
                    requiresTool().sounds(BlockSoundGroup.NETHERRACK)));

    // Nether Bricks and Red Nether Bricks
    public static final Block FUNGAL_NETHER_BRICK_SLAB = registerBlock("fungal_nether_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).
                    requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRACKED_NETHER_BRICK_SLAB = registerBlock("cracked_nether_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).
                    requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block FUNGAL_RED_NETHER_BRICK_SLAB = registerBlock("fungal_red_nether_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).
                    requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CRACKED_RED_NETHER_BRICK_SLAB = registerBlock("cracked_red_nether_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).
                    requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    // Blackstone
    public static final Block COBBLED_BLACKSTONE_SLAB = registerBlock("cobbled_blackstone_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).
                    requiresTool()));

    public static final Block CRACKED_BLACKSTONE_BRICK_SLAB = registerBlock("cracked_blackstone_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).
                    requiresTool()));

    // Deepslate
    public static final Block DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(3.0f).resistance(6.0f).
                    requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block CRACKED_DEEPSLATE_BRICK_SLAB = registerBlock("cracked_deepslate_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(3.0f).resistance(6.0f).
                    requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final Block CRACKED_DEEPSLATE_TILE_SLAB = registerBlock("cracked_deepslate_tile_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(3.0f).resistance(6.0f).
                    requiresTool().sounds(BlockSoundGroup.DEEPSLATE_TILES)));


    // This is the template for all new fences
    //public static final Block FENCE_NAME = registerBlock("fence_name",
    //        new FenceBlock(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).
    //                requiresTool()));

    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            new FenceBlock(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).
                    requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));


    // This is the template for all new fence gates
    //public static final Block FENCE_GATE_NAME = registerBlock("fence_gate_name",
    //        new FenceGateBlock(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).
    //                requiresTool()));

    public static final Block NETHER_BRICK_FENCE_GATE = registerBlock("nether_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).
                    requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block RED_NETHER_BRICK_FENCE_GATE = registerBlock("red_nether_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).
                    requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));


    // This is the template for all new buttons
    //public static final Block BUTTON_NAME = registerBlock("button_name",
    //        new ModStoneButtonBlock(FabricBlockSettings.of(Material.STONE).hardness(3.0f).resistance(6.0f).
    //                requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block DEEPSLATE_BUTTON = registerBlock("deepslate_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.STONE).hardness(3.0f).resistance(6.0f).
                    requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));


    // This is the template for all new pressure plates
    //public static final Block PRESSURE_PLATE_NAME = registerBlock("pressure_plate_name",
    //        new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
    //          FabricBlockSettings.of(Material.STONE).hardness(3.0f).resistance(6.0f).
    //                requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block DEEPSLATE_PRESSURE_PLATE = registerBlock("deepslate_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.STONE).hardness(3.0f).resistance(6.0f).
                            requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    // Methods
    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(StoneRedone.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block)
    {
        return Registry.register(Registry.ITEM, new Identifier(StoneRedone.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }

    public static void registerModBlocks()
    {
        System.out.println("Registering ModBlocks for " + StoneRedone.MOD_ID);
    }
}
