
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.sorcerersecrets.init;

import wuzu.ian.sorcerersecrets.item.FireswordItem;
import wuzu.ian.sorcerersecrets.item.EarthswordItem;
import wuzu.ian.sorcerersecrets.SorcererSecretsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class SorcererSecretsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SorcererSecretsMod.MODID);
	public static final RegistryObject<Item> FIRESWORD = REGISTRY.register("firesword", () -> new FireswordItem());
	public static final RegistryObject<Item> EARTHSWORD = REGISTRY.register("earthsword", () -> new EarthswordItem());
	public static final RegistryObject<Item> RUNE_A = block(SorcererSecretsModBlocks.RUNE_A);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
