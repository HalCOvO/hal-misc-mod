package dev.halcovo.block;

import dev.halcovo.HalMiscMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block TROCK = registerBlock("trock",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));

    private static Block registerBlock(String name, Block block){
    registerBlockItem(name, block);
    return Registry.register(Registries.BLOCK, new Identifier(HalMiscMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(HalMiscMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    public static void registerModBlocks(){
        HalMiscMod.LOGGER.info("Registering ModBlocks for" +  HalMiscMod.MOD_ID);
    }
}
