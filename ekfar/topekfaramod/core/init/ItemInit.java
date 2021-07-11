package com.ekfar.topekfaramod.core.init;

import com.ekfar.topekfaramod.FirstEkfaraMod;
import com.ekfar.topekfaramod.common.material.CustomArmorMaterial;
import com.ekfar.topekfaramod.common.material.CustomTool;
import com.ekfar.topekfaramod.core.itemgroup.EkfarGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			FirstEkfaraMod.MOD_ID);

	public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
			() -> new Item(new Item.Properties().tab(EkfarGroup.EKFAR_MOD)));

	public static final RegistryObject<Item> EXAMPLE_SWORD = ITEMS.register("example_sword", 
			() -> new SwordItem(CustomTool.EXAMPLE_TOOL, 5, -1f, new Item.Properties().tab(EkfarGroup.EKFAR_MOD)));

	public static final RegistryObject<Item> EXAMPLE_AXE = ITEMS.register("example_axe",
			() -> new SwordItem(CustomTool.EXAMPLE_TOOL, 5, -1f, new Item.Properties().tab(EkfarGroup.EKFAR_MOD)));

	public static final RegistryObject<Item> EXAMPLE_PICKAXE = ITEMS.register("example_pickaxe",
			() -> new SwordItem(CustomTool.EXAMPLE_TOOL, 5, -1f, new Item.Properties().tab(EkfarGroup.EKFAR_MOD)));

	public static final RegistryObject<Item> EXAMPLE_SHOVEL = ITEMS.register("example_shovel",
			() -> new SwordItem(CustomTool.EXAMPLE_TOOL, 5, -1f, new Item.Properties().tab(EkfarGroup.EKFAR_MOD)));

	public static final RegistryObject<Item> EXAMPLE_HOE = ITEMS.register("example_hoe", 
			() -> new SwordItem(CustomTool.EXAMPLE_TOOL, 5, -1f, new Item.Properties().tab(EkfarGroup.EKFAR_MOD)));

	public static final RegistryObject<Item> EXAMPLE_HELMET = ITEMS.register("example_helmet",
			() -> new ArmorItem(CustomArmorMaterial.EXAMPLE_ARMOR, EquipmentSlotType.HEAD,
					new Item.Properties().tab(EkfarGroup.EKFAR_MOD)));

	public static final RegistryObject<Item> EXAMPLE_CHESTPLATE = ITEMS.register("example_chestplate",
			() -> new ArmorItem(CustomArmorMaterial.EXAMPLE_ARMOR, EquipmentSlotType.CHEST,
					new Item.Properties().tab(EkfarGroup.EKFAR_MOD)));

	public static final RegistryObject<Item> EXAMPLE_LEGGINGS = ITEMS.register("example_leggings",
			() -> new ArmorItem(CustomArmorMaterial.EXAMPLE_ARMOR, EquipmentSlotType.LEGS,
					new Item.Properties().tab(EkfarGroup.EKFAR_MOD)));

	public static final RegistryObject<Item> EXAMPLE_BOOTS = ITEMS.register("example_boots",
			() -> new ArmorItem(CustomArmorMaterial.EXAMPLE_ARMOR, EquipmentSlotType.FEET,
					new Item.Properties().tab(EkfarGroup.EKFAR_MOD)));
}
