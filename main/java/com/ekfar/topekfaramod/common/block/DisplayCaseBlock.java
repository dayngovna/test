package com.ekfar.topekfaramod.common.block;

import com.ekfar.topekfaramod.common.te.DisplayCaseTileEntity;
import com.ekfar.topekfaramod.core.init.TileEntityTypesInit;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class DisplayCaseBlock extends Block {

	public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

	private static final VoxelShape SHAPE_S = VoxelShapes.join(Block.box(6, 0, 1, 10, 13, 5), Block.box(1, 13, 0, 15, 14, 14), IBooleanFunction.OR);

	private static final VoxelShape SHAPE_N = VoxelShapes.join(Block.box(6, 0, 11, 10, 13, 15), Block.box(1, 13, 2, 15, 14, 16), IBooleanFunction.OR);
			
	private static final VoxelShape SHAPE_E = VoxelShapes.join(Block.box(1, 0, 6, 5, 13, 10), Block.box(0, 13, 1, 14, 14, 15), IBooleanFunction.OR);
	
	private static final VoxelShape SHAPE_W = VoxelShapes.join(Block.box(11, 0, 6, 15, 13, 10), Block.box(2, 13, 1, 16, 14, 15), IBooleanFunction.OR);
	
	public DisplayCaseBlock() {
		super(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).sound(SoundType.METAL));

		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}
	
	@Override
	public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_,
			ISelectionContext p_220053_4_) {
		switch(p_220053_1_.getValue(FACING)) {
		case EAST:
			return SHAPE_E;
		case WEST:
			return SHAPE_W;
		case SOUTH:
			return SHAPE_S;
		default:
			return SHAPE_N;
		}
	}

//	@Override
//	public BlockState mirror(BlockState state, Mirror mirrorIn) {
//
//		return state.rotate(mirrorIn.getRotation(state.get(FACING)));
//	}
//
//	@Override
//	public BlockState rotate(BlockState state, IWorld world, BlockPos pos, Rotation direction) {
//
//		return state.setValue(FACING, Direction.rotate(p_220253_1_.getValue(FACING)));
//	}

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
		// TODO Auto-generated method stub
		return this.defaultBlockState().setValue(FACING, p_196258_1_.getHorizontalDirection().getOpposite());
	}

	@Override
	protected void createBlockStateDefinition(Builder<Block, BlockState> p_206840_1_) {
		// TODO Auto-generated method stub
		super.createBlockStateDefinition(p_206840_1_);
		p_206840_1_.add(FACING);
	}

	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}

	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return TileEntityTypesInit.DISPLAY_CASE_TILE_ENTITY_TYPE.get().create();
	}

	@Override
	public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult hit) {
		if (!worldIn.isClientSide()) {
			TileEntity te = worldIn.getBlockEntity(pos);
			if (te instanceof DisplayCaseTileEntity) {
				NetworkHooks.openGui((ServerPlayerEntity) player, (DisplayCaseTileEntity) te, pos);

			}
		}
		return ActionResultType.SUCCESS;
	}
}
