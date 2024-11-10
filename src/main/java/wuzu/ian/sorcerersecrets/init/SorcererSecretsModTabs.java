
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.sorcerersecrets.init;

import wuzu.ian.sorcerersecrets.SorcererSecretsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class SorcererSecretsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SorcererSecretsMod.MODID);
	public static final RegistryObject<CreativeModeTab> SORCERER_SECRETS = REGISTRY.register("sorcerer_secrets",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.sorcerer_secrets.sorcerer_secrets")).icon(() -> new ItemStack(Items.DEBUG_STICK)).displayItems((parameters, tabData) -> {
				tabData.accept(SorcererSecretsModItems.FIRESWORD.get());
				tabData.accept(SorcererSecretsModItems.EARTHSWORD.get());
			})

					.build());
}
