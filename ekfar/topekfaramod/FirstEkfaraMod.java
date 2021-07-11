package com.ekfar.topekfaramod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ekfar.topekfaramod.core.init.BlockInit;
import com.ekfar.topekfaramod.core.init.ContainerTypesInit;
import com.ekfar.topekfaramod.core.init.FeatureInit;
import com.ekfar.topekfaramod.core.init.ItemInit;
import com.ekfar.topekfaramod.core.init.TileEntityTypesInit;
import com.ekfar.topekfaramod.core.itemgroup.EkfarGroup;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

//https://crafting.thedestruc7i0n.ca/
@Mod("fem")
@Mod.EventBusSubscriber(modid = FirstEkfaraMod.MOD_ID, bus = Bus.MOD)
public class FirstEkfaraMod {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "fem";

	public FirstEkfaraMod() {

		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		TileEntityTypesInit.TILE_ENTITY_TYPE.register(bus);
		ContainerTypesInit.CONTAINER_TYPES.register(bus);
		
		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, FeatureInit::addOres);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			event.getRegistry().register(new BlockItem(block, new Item.Properties().tab(EkfarGroup.EKFAR_MOD))
					.setRegistryName(block.getRegistryName()));
		});
	}
}
