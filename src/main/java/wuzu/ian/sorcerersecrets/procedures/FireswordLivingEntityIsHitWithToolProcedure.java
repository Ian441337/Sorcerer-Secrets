package wuzu.ian.sorcerersecrets.procedures;

import net.minecraft.world.entity.Entity;

public class FireswordLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(30);
	}
}