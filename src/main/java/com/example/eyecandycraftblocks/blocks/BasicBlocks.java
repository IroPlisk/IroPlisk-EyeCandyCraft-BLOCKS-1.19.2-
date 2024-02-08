package com.example.eyecandycraftblocks.blocks;

import com.example.eyecandycraftblocks.EyeCandyCraftBlocks;

import com.example.eyecandycraftblocks.EyeCandyCraftBlocksCreativeModeTab;
import com.example.eyecandycraftblocks.items.BasicItemBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BasicBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, EyeCandyCraftBlocks.MODID);

    public static final RegistryObject<Block> WHITE_CORRUGATED_STEEL = registerBlock("corrugatedsteelwhite",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> LIGHT_GRAY_CORRUGATED_STEEL = registerBlock("corrugatedsteellightgray",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> GRAY_CORRUGATED_STEEL = registerBlock("corrugatedsteelgray",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BLACK_CORRUGATED_STEEL = registerBlock("corrugatedsteelblack",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BROWN_CORRUGATED_STEEL = registerBlock("corrugatedsteelbrown",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> RED_CORRUGATED_STEEL = registerBlock("corrugatedsteelred",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> ORANGE_CORRUGATED_STEEL = registerBlock("corrugatedsteelorange",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> YELLOW_CORRUGATED_STEEL = registerBlock("corrugatedsteelyellow",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> LIME_CORRUGATED_STEEL = registerBlock("corrugatedsteellime",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> GREEN_CORRUGATED_STEEL = registerBlock("corrugatedsteelgreen",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> LIGHT_BLUE_CORRUGATED_STEEL = registerBlock("corrugatedsteellightblue",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> CYAN_CORRUGATED_STEEL = registerBlock("corrugatedsteelcyan",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> BLUE_CORRUGATED_STEEL = registerBlock("corrugatedsteelblue",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> PURPLE_CORRUGATED_STEEL = registerBlock("corrugatedsteelpurple",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> MAGENTA_CORRUGATED_STEEL = registerBlock("corrugatedsteelmagenta",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> PINK_CORRUGATED_STEEL = registerBlock("corrugatedsteelpink",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);
    public static final RegistryObject<Block> ASPHALT = registerBlock("asphalt",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).
                    requiresCorrectToolForDrops()), EyeCandyCraftBlocksCreativeModeTab.ECC_BLOCKS_CREATIVE_MODE_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab){
        return BasicItemBlocks.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}