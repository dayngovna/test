package com.ekfar.topekfaramod.common.material;

import java.util.function.Supplier;

import com.ekfar.topekfaramod.core.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum CustomTool implements IItemTier {

	EXAMPLE_TOOL(4, 4000, 15f, 2f, 17, () -> Ingredient.of(ItemInit.EXAMPLE_ITEM.get()));
	//ctrl c ctrl v

	private final int harvestLevel;
	private final int maxUses;
	private final float effiency;
	private final float attackDamage;
	private final int enchantability;
	private final Ingredient repairMaterial;

	CustomTool(int harvestLevel, int maxUses, float effiency, float attackDamage, int enchantability,
			Supplier<Ingredient> repairMaterial) {
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.effiency = effiency;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial.get();

	}

	@Override
	public float getAttackDamageBonus() {
		return this.attackDamage;
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantability;
	}

	@Override
	public int getLevel() {
		return this.harvestLevel;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairMaterial;
	}

	@Override
	public float getSpeed() {
		return this.effiency;
	}

	@Override
	public int getUses() {
		return this.maxUses;
	}
}
