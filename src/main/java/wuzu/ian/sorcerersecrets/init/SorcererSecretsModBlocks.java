
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.sorcerersecrets.init;

import wuzu.ian.sorcerersecrets.block.RuneABlock;
import wuzu.ian.sorcerersecrets.SorcererSecretsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class SorcererSecretsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SorcererSecretsMod.MODID);
	public static final RegistryObject<Block> RUNE_A = REGISTRY.register("rune_a", () -> new RuneABlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
