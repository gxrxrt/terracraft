package org.gxrxrtprod.terracraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.gxrxrtprod.terracraft.Terracraft;
import org.gxrxrtprod.terracraft.item.material.armor.RubyArmorMaterial;


public class ModItems {
    public static final Item Ruby = registerItem("ruby_item", new Item(new FabricItemSettings()), ModItemGroups.TerracraftItemGroup);
    public static final Item Gel = registerItem("gel_item", new Item(new FabricItemSettings()), ModItemGroups.TerracraftItemGroup);

    public static final Item RUBY_SWORD = registerItem("ruby_sword", new SwordItem(TerracraftToolMaterials.RUBY, 3, 2.5F, new FabricItemSettings()), ModItemGroups.TerracraftTools);
    public static final Item RUBY_HELMET = registerItem("ruby_helmet", new ArmorItem(new RubyArmorMaterial(), EquipmentSlot.HEAD, new FabricItemSettings()), ModItemGroups.TerracraftArmorItemGroup);
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", new ArmorItem(new RubyArmorMaterial(), EquipmentSlot.CHEST, new FabricItemSettings()), ModItemGroups.TerracraftArmorItemGroup);
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings", new ArmorItem(new RubyArmorMaterial(), EquipmentSlot.LEGS, new FabricItemSettings()), ModItemGroups.TerracraftArmorItemGroup);
    public static final Item RUBY_BOOTS = registerItem("ruby_boots", new ArmorItem(new RubyArmorMaterial(), EquipmentSlot.FEET, new FabricItemSettings()), ModItemGroups.TerracraftArmorItemGroup);

    public static final Item RUBY_AXE = registerItem("ruby_axe", new TerracraftAxeItem(TerracraftToolMaterials.RUBY, 6, 0.5F, new FabricItemSettings()), ModItemGroups.TerracraftTools);
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", new TerracraftPickaxeItem(TerracraftToolMaterials.RUBY, 4, 0.9F, new FabricItemSettings()), ModItemGroups.TerracraftTools);
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", new TerracraftShovelItem(TerracraftToolMaterials.RUBY, 4, 0.8F, new FabricItemSettings()), ModItemGroups.TerracraftTools);
    public static final Item RUBY_HOE = registerItem("ruby_hoe", new TerracraftHoeitem(TerracraftToolMaterials.RUBY, 4, 0.8F, new FabricItemSettings()), ModItemGroups.TerracraftTools);


    public static Item registerItem(String id, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Terracraft.MOD_ID, id), item);
    }

    public static Item registerItem(String id, Item item, ItemGroup itemGroup){
        Item returnItem = Registry.register(Registries.ITEM, new Identifier(Terracraft.MOD_ID, id), item);
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(returnItem));
        return returnItem;
    }

    public static  void register(){
        Terracraft.LOGGER.debug("Registering items for: " + Terracraft.MOD_ID);
    }
}
