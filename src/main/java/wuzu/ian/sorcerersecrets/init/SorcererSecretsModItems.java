
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.sorcerersecrets.init;

import wuzu.ian.sorcerersecrets.item.FireswordItem;
import wuzu.ian.sorcerersecrets.SorcererSecretsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class SorcererSecretsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SorcererSecretsMod.MODID);
	public static final RegistryObject<Item> FIRESWORD = REGISTRY.register("firesword", () -> new FireswordItem());
	// Start of user code block custom items
	// End of user code block custom items
}
