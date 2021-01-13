package net.mcreator.llamamod.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.llamamod.LlamaModModElements;

import java.util.Map;

@LlamaModModElements.ModElement.Tag
public class LlamaspiterBulletHitsLivingEntity1Procedure extends LlamaModModElements.ModElement {
	public LlamaspiterBulletHitsLivingEntity1Procedure(LlamaModModElements instance) {
		super(instance, 73);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure LlamaspiterBulletHitsLivingEntity1!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).attackEntityFrom(new DamageSource("ew spit").setDamageBypassesArmor(), (float) 100000);
		}
	}
}
