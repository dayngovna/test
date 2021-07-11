package com.ekfar.topekfaramod.core.itemgroup;

import com.ekfar.topekfaramod.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class EkfarGroup extends ItemGroup{

	public static final EkfarGroup EKFAR_MOD = new EkfarGroup(ItemGroup.TABS.length, "ekfar_group");
	
	public EkfarGroup(int p_i1853_1_, String p_i1853_2_) {
		super(p_i1853_1_, p_i1853_2_);
	}

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(ItemInit.EXAMPLE_ITEM.get());
	}

}
