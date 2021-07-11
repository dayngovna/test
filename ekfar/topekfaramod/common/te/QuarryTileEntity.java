package com.ekfar.topekfaramod.common.te;

import com.ekfar.topekfaramod.core.init.TileEntityTypesInit;

import net.minecraft.block.Blocks;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class QuarryTileEntity extends TileEntity implements ITickableTileEntity{

	public QuarryTileEntity(TileEntityType<?> p_i48289_1_) {
		super(p_i48289_1_);
		// TODO Auto-generated constructor stub
	}
	public QuarryTileEntity() {
		this(TileEntityTypesInit.QUARRY_TILE_ENTITY_TYPE.get());
	}
	@Override
	public void tick() {
		this.level.setBlock(this.worldPosition.below(),Blocks.AIR.defaultBlockState(), 0);
		
	}
}
