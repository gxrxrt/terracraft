package org.gxrxrtprod.terracraft.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.gxrxrtprod.terracraft.Terracraft;
import org.gxrxrtprod.terracraft.item.ModItemGroups;
import org.gxrxrtprod.terracraft.item.ModItems;

public abstract class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block", new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroups.TerracraftItemGroup);

    protected static Block registerBlock(String id, Block block, ItemGroup itemGroup){
        ModItems.registerItem(id, new BlockItem(block, new FabricItemSettings()), itemGroup);

        return Registry.register(Registries.BLOCK, new Identifier(Terracraft.MOD_ID, id), block);
    }

    protected static Block registerBlock(String id, Block block){
        ModItems.registerItem(id, new BlockItem(block, new FabricItemSettings()));

        return Registry.register(Registries.BLOCK, new Identifier(Terracraft.MOD_ID, id), block);
    }
    public static void register(){
        Terracraft.LOGGER.debug("Registering blocks for: " + Terracraft.MOD_ID);
    }


}
