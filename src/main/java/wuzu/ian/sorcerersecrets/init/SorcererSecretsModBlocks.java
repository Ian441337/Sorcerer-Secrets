
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wuzu.ian.sorcerersecrets.init;

import wuzu.ian.sorcerersecrets.SorcererSecretsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class SorcererSecretsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SorcererSecretsMod.MODID);
	public static final RegistryObject<Block> RUNE_A = REGISTRY.register("rune_a", () -> new RuneABlock());
	public static final RegistryObject<Block> RUNE_B = REGISTRY.register("rune_b", () -> new RuneBBlock());
	public static final RegistryObject<Block> RUNE_C = REGISTRY.register("rune_c", () -> new RuneCBlock());
	public static final RegistryObject<Block> RUNE_D = REGISTRY.register("rune_d", () -> new RuneDBlock());
	public static final RegistryObject<Block> RUNE_E = REGISTRY.register("rune_e", () -> new RuneEBlock());
	public static final RegistryObject<Block> RUNE_F = REGISTRY.register("rune_f", () -> new RuneFBlock());
	public static final RegistryObject<Block> RUNE_G = REGISTRY.register("rune_g", () -> new RuneGBlock());
	public static final RegistryObject<Block> RUNE_H = REGISTRY.register("rune_h", () -> new RuneHBlock());
	public static final RegistryObject<Block> RUNE_I = REGISTRY.register("rune_i", () -> new RuneIBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
