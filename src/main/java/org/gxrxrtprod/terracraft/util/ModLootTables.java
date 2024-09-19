package org.gxrxrtprod.terracraft.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import org.gxrxrtprod.terracraft.item.ModItems;

public class ModLootTables {
    public static final Identifier DEEPSLATE_ID = new Identifier("minecraft", "blocks/deepslate");
    public static final Identifier  WEAPONSMITH_ID = new Identifier("minecraft", "chests/village/village_weaponsmith");
    public static final Identifier RUINED_PORTAL_ID = new Identifier("minecraft", "chests/ruined_portal");
    public static void register(){
        LootTableEvents.MODIFY.register(((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (id.equals(DEEPSLATE_ID)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.001f))
                        .with(ItemEntry.builder(ModItems.Ruby));
                tableBuilder.pool(poolBuilder);
            }
            if (id.equals(RUINED_PORTAL_ID)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(1, 3))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .with(ItemEntry.builder(ModItems.Ruby));
                tableBuilder.pool(poolBuilder);
            }
            if (id.equals(WEAPONSMITH_ID)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(1, 3))
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(ModItems.Ruby));
                tableBuilder.pool(poolBuilder);
            }
        }));
    }
}
