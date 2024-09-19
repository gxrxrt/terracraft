package org.gxrxrtprod.terracraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.gxrxrtprod.terracraft.Terracraft;

public class ModItemGroups {
    public static final ItemGroup TerracraftItemGroup = FabricItemGroup.builder(new Identifier(Terracraft.MOD_ID, "terracraft_itemgroup")).icon(() -> new ItemStack(ModItems.Ruby)).build();
    public static final ItemGroup TerracraftArmorItemGroup = FabricItemGroup.builder(new Identifier(Terracraft.MOD_ID, "terracraft_armor_itemgroup")).icon(() -> new ItemStack(ModItems.Gel)).build();
    public static final ItemGroup TerracraftTools = FabricItemGroup.builder(new Identifier(Terracraft.MOD_ID, "terracraft_tools_itemgroup")).icon(() -> new ItemStack(ModItems.RUBY_PICKAXE)).build();


}