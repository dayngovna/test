package com.ekfar.topekfaramod.core.init;

import com.ekfar.topekfaramod.FirstEkfaraMod;
import com.ekfar.topekfaramod.common.te.DisplayCaseTileEntity;
import com.ekfar.topekfaramod.common.te.QuarryTileEntity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypesInit {

	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE = DeferredRegister
			.create(ForgeRegistries.TILE_ENTITIES, FirstEkfaraMod.MOD_ID);

	
	public static final RegistryObject<TileEntityType<QuarryTileEntity>> QUARRY_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE
			.register("quarry",() -> TileEntityType.Builder.of(QuarryTileEntity::new, BlockInit.QUARRY.get()).build(null));

	
	public static final RegistryObject<TileEntityType<DisplayCaseTileEntity>> DISPLAY_CASE_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE
			.register("display_case", () -> TileEntityType.Builder.of(DisplayCaseTileEntity::new, BlockInit.DISPLAY_CASE.get()).build(null));

}
