package com.mcmoddev.communitymod.randogeek;

import com.mcmoddev.communitymod.CommunityGlobals;
import com.mcmoddev.communitymod.ISubMod;
import com.mcmoddev.communitymod.SubMod;
import com.mcmoddev.communitymod.shared.ClientUtil;
import com.mcmoddev.communitymod.shared.RegUtil;

import geek.aperturescience.init.ApertureScienceBlocks;
import geek.aperturescience.init.ApertureScienceItems;
import net.minecraft.entity.passive.HorseArmorType;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@SubMod(name = "Geek's Random Addition", description = "Geek's Random Additions to the community mod", attribution = "LegendaryGeek")
public class RandoGeek implements ISubMod {
	public static final Item.ToolMaterial ICE_TOOL_MATERIAL;
	public static final ItemArmor.ArmorMaterial ICE_ARMOR_MATERIAL;
	public static final HorseArmorType ICE_HORSE_ARMOR;

	static {
		ICE_TOOL_MATERIAL = EnumHelper.addToolMaterial(new ResourceLocation(CommunityGlobals.MOD_ID, "ice").toString(),
				4, 1561, 12F, 4.0F, 30);
		ICE_ARMOR_MATERIAL = EnumHelper.addArmorMaterial(
				new ResourceLocation(CommunityGlobals.MOD_ID, "ice").toString(),
				new ResourceLocation(CommunityGlobals.MOD_ID, "ice").toString(),

				33, new int[] { 3, 6, 8, 3 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
		ICE_HORSE_ARMOR = EnumHelper.addHorseArmor(new ResourceLocation(CommunityGlobals.MOD_ID, "ice").toString(),
				new ResourceLocation(CommunityGlobals.MOD_ID, "textures/entities/horse/armor/horse_armor_ice.png").toString(), 12);
	}



	@SubscribeEvent
	public void registerItems(IForgeRegistry<Item> reg) {
		RegUtil.registerItem(reg, ModItems.IceHelm, "icehelm");
		RegUtil.registerItem(reg, ModItems.IceChestplate, "icechestplate");
		RegUtil.registerItem(reg, ModItems.IceLegs, "iceleggings");
		RegUtil.registerItem(reg, ModItems.IceBooties, "icebooties");
		RegUtil.registerItem(reg, ModItems.IceSword, "icesword");
		RegUtil.registerItem(reg, ModItems.IceSpade, "icespade");
		RegUtil.registerItem(reg, ModItems.IcePickaxe, "icepickaxe");
		RegUtil.registerItem(reg, ModItems.IceHoe, "icehoe");
		RegUtil.registerItem(reg, ModItems.IceAxe, "iceaxe");
		RegUtil.registerItem(reg, ModItems.ForkedApple, "forkedapple");
	}
	
	@SubscribeEvent
	public void registerModels(final ModelRegistryEvent event) {
		ClientUtil.simpleItemModel(ModItems.ForkedApple);
		ClientUtil.simpleItemModel(ModItems.IceAxe);
		ClientUtil.simpleItemModel(ModItems.IceBooties);
		ClientUtil.simpleItemModel(ModItems.IceChestplate);
		ClientUtil.simpleItemModel(ModItems.IceHelm);
		ClientUtil.simpleItemModel(ModItems.IceHoe);
		ClientUtil.simpleItemModel(ModItems.IceLegs);
		ClientUtil.simpleItemModel(ModItems.IcePickaxe);
		ClientUtil.simpleItemModel(ModItems.IceSpade);
		ClientUtil.simpleItemModel(ModItems.IceSword);
	}

}
