package com.ekfar.topekfaramod.core.util;

import com.ekfar.topekfaramod.FirstEkfaraMod;
import com.ekfar.topekfaramod.client.screen.DisplayCaseScreen;
import com.ekfar.topekfaramod.client.ter.DisplayCaseTileEntityRenderer;
import com.ekfar.topekfaramod.core.init.ContainerTypesInit;
import com.ekfar.topekfaramod.core.init.TileEntityTypesInit;

import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = FirstEkfaraMod.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientClassSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		ScreenManager.register(ContainerTypesInit.DISPLAY_CASE_CONTAINER_TYPE.get(), DisplayCaseScreen::new);
		
		ClientRegistry.bindTileEntityRenderer(TileEntityTypesInit.DISPLAY_CASE_TILE_ENTITY_TYPE.get(), DisplayCaseTileEntityRenderer::new);
	}
}
