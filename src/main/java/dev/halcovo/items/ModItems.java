package dev.halcovo.items;

import dev.halcovo.HalMiscMod;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TREGG = registerItem("tregg",
            new EggItem(new FabricItemSettings().maxCount(16)));
    public static final Item COOKED_TREGG = registerItem("cooked_tregg",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6). saturationModifier(6).build())));

    public static final Item COOKED_EGG = registerItem("cooked_egg",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5). saturationModifier(6).build())));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(HalMiscMod.MOD_ID, name), item);


    }
    public static void registerModItems() {
    HalMiscMod.LOGGER.info("Registering Mod Items for" + HalMiscMod.MOD_ID);

    }
}