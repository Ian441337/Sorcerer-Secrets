package wuzu.ian.sorcerersecrets.procedures;

import net.minecraft.world.entity.Entity;

public class FireswordLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.7) {
			entity.setSecondsOnFire(30);
		}
	}
}
