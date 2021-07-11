package com.ekfar.topekfaramod.core.init;

import com.ekfar.topekfaramod.FirstEkfaraMod;
import com.ekfar.topekfaramod.common.block.DisplayCaseBlock;
import com.ekfar.topekfaramod.common.block.QuarryBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			FirstEkfaraMod.MOD_ID);

	// public static final RegistryObject<Block> EXAMPLE_BLOCK =
	// BLOCKS.register("example_block",
	// () -> new Block(AbstractBlock.Properties.of(Material.STONE,
	// MaterialColor.COLOR_GRAY)
	// .harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.GLASS).strength(6)));

	public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_ORE)));

	public static final RegistryObject<Block> QUARRY = BLOCKS.register("quarry", 
			() -> new QuarryBlock(AbstractBlock.Properties.copy(Blocks.IRON_ORE)));
	
	public static final RegistryObject<Block> DISPLAY_CASE = BLOCKS.register("display_case",
			() -> new DisplayCaseBlock());
}
