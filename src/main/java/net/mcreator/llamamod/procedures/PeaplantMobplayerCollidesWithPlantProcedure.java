package net.mcreator.llamamod.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.llamamod.LlamaModModElements;

import java.util.Map;

@LlamaModModElements.ModElement.Tag
public class PeaplantMobplayerCollidesWithPlantProcedure extends LlamaModModElements.ModElement {
	public PeaplantMobplayerCollidesWithPlantProcedure(LlamaModModElements instance) {
		super(instance, 68);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure PeaplantMobplayerCollidesWithPlant!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.isSprinting())) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
		}
	}
}
