package net.yamato.megamon.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.yamato.megamon.Megamon;

public class ModItems {
    public static final Item BEAD = registerItem("bead",
            new Item(new FabricItemSettings().group(ModItemGroup.MEGAMON)));
    public static final Item ARAMASA_CARD = registerItem("aramasa_card",
            new Item(new FabricItemSettings().group(ModItemGroup.MEGAMON)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Megamon.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Megamon.LOGGER.debug("Registering Mod Items for " + Megamon.MOD_ID);
    }

}
