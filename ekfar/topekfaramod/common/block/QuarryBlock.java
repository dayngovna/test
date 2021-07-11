package com.ekfar.topekfaramod.common.block;

import com.ekfar.topekfaramod.core.init.TileEntityTypesInit;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class QuarryBlock extends Block{

	public QuarryBlock(Properties p_i48440_1_) {
		super(AbstractBlock.Properties.of(Material.METAL,MaterialColor.COLOR_GRAY).sound(SoundType.METAL));
	}
	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return TileEntityTypesInit.QUARRY_TILE_ENTITY_TYPE.get().create();
	}
}
