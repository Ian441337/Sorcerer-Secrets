
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
	public static final RegistryObject<Item> RUNE_B = block(SorcererSecretsModBlocks.RUNE_B);
	public static final RegistryObject<Item> RUNE_C = block(SorcererSecretsModBlocks.RUNE_C);
	public static final RegistryObject<Item> RUNE_D = block(SorcererSecretsModBlocks.RUNE_D);
	public static final RegistryObject<Item> RUNE_E = block(SorcererSecretsModBlocks.RUNE_E);
	public static final RegistryObject<Item> RUNE_F = block(SorcererSecretsModBlocks.RUNE_F);
	public static final RegistryObject<Item> RUNE_G = block(SorcererSecretsModBlocks.RUNE_G);
	public static final RegistryObject<Item> RUNE_H = block(SorcererSecretsModBlocks.RUNE_H);
	public static final RegistryObject<Item> RUNE_I = block(SorcererSecretsModBlocks.RUNE_I);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
