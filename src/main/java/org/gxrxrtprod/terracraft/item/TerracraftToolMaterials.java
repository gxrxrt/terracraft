package org.gxrxrtprod.terracraft.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum TerracraftToolMaterials implements ToolMaterial {
    RUBY(3, 1432, 7.0F, 3.0F, 10, () -> {
        return Ingredient.ofItems(new ItemConvertible[] {ModItems.Ruby});
    });


    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    TerracraftToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient){
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<>(repairIngredient);
    }

    // прочность
    public int getDurability() {
        return this.itemDurability;
    }

    // скорость копания
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    // урон
    public float getAttackDamage() {
        return this.attackDamage;
    }

    // уровень копания
    public int getMiningLevel() {
        return this.miningLevel;
    }

    // уровень, который требуется для получения более высокого уровня чар
    public int getEnchantability() {
        return this.enchantability;
    }

    // предмет для починки
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
