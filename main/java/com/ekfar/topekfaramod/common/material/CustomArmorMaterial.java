package com.ekfar.topekfaramod.common.material;

import java.util.function.Supplier;

import com.ekfar.topekfaramod.core.init.ItemInit;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum CustomArmorMaterial implements IArmorMaterial {
	EXAMPLE_ARMOR("example", 10, new int[] { 4, 7, 9, 4 }, 17, SoundEvents.BEACON_DEACTIVATE, 4f, 0.2f,
			() -> Ingredient.of(ItemInit.EXAMPLE_ITEM.get()));

	private static final int[] baseDurability = { 128, 144, 160, 112 };
	private final String name;
	private final int durabilityMultiplier;
	private int[] armorVal;
	private int enchantability;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knockbackResistance;
	private final Ingredient repairIngredient;

	CustomArmorMaterial(String name, int durabilityMultiplier, int[] armorVal, int enchantability,
			SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.armorVal = armorVal;
		this.enchantability = enchantability;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredient = repairIngredient.get();
	}

	@Override
	public int getDefenseForSlot(EquipmentSlotType arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDurabilityForSlot(EquipmentSlotType arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getEnchantmentValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SoundEvent getEquipSound() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getKnockbackResistance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ingredient getRepairIngredient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getToughness() {
		// TODO Auto-generated method stub
		return 0;
	}

}
