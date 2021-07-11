package com.ekfar.topekfaramod.client.screen;

import com.ekfar.topekfaramod.FirstEkfaraMod;
import com.ekfar.topekfaramod.common.container.DisplayCaseContainer;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class DisplayCaseScreen extends ContainerScreen<DisplayCaseContainer> {

	private static final ResourceLocation DISPLAY_CASE_GUI = new ResourceLocation(FirstEkfaraMod.MOD_ID,
			"textures/gui/display_case.png");

	public DisplayCaseScreen(DisplayCaseContainer p_i51105_1_, PlayerInventory p_i51105_2_,
			ITextComponent p_i51105_3_) {
		super(p_i51105_1_, p_i51105_2_, p_i51105_3_);

		this.leftPos = 0;
		this.topPos = 0;
		this.imageWidth = 175;
		this.imageHeight = 201;
	}

	@Override
	public void render(MatrixStack p_230450_1_, int p_230450_3_, int p_230450_4_,float p_230450_2_) {
		this.renderBackground(p_230450_1_);
		super.render(p_230450_1_, p_230450_3_, p_230450_4_, p_230450_2_);
		this.renderTooltip(p_230450_1_, p_230450_3_, p_230450_4_);

	}

	@Override
	protected void renderLabels(MatrixStack matrixStack, int x, int y) {
		this.font.draw(matrixStack, this.inventory.getDisplayName(), (float) this.titleLabelX,
				(float) this.titleLabelY, 4210752);
	}

	@Override
	protected void renderBg(MatrixStack matrixStack,float particalTicks, int mouseX, int mouseY) {
		RenderSystem.color4f(1f, 1f, 1f, 1f);
		this.minecraft.textureManager.bind(DISPLAY_CASE_GUI);
		int x = (this.width - this.imageWidth) / 2;
		int y = (this.height - this.imageHeight) / 2;
		this.blit(matrixStack, x, y, 0, 0, this.imageWidth, this.imageHeight);

	}

}
