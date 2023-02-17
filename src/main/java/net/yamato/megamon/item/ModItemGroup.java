package net.yamato.megamon.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.yamato.megamon.Megamon;

public class ModItemGroup {
    public static final ItemGroup MEGAMON = FabricItemGroupBuilder.build(
            new Identifier(Megamon.MOD_ID, "megamon"), () -> new ItemStack(ModItems.BEAD));
}
