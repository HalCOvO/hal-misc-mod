package dev.halcovo.items;

import dev.halcovo.HalMiscMod;
import dev.halcovo.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup HALMISCMODTAB = Registry.register(Registries.ITEM_GROUP, new Identifier(HalMiscMod.MOD_ID, "halmiscmodtab"),
    FabricItemGroup.builder()
            .displayName((Text.translatable("itemgroup.halmiscmodtab")))
            .icon(()-> new ItemStack(ModItems.TREGG)).entries((displayContext, entries) -> {
                entries.add(ModItems.TREGG);
                entries.add(ModItems.COOKED_TREGG);
                entries.add(ModBlocks.TROCK);
            }).build());
    public static void registerItemGroups(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries ->{
            entries.add(ModItems.COOKED_EGG);
        });
    }
}
