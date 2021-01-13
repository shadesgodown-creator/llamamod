
package net.mcreator.llamamod.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.DamageSource;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.llamamod.LlamaModModElements;

@LlamaModModElements.ModElement.Tag
public class LamaenchantEnchantment extends LlamaModModElements.ModElement {
	@ObjectHolder("llama_mod:lamaenchant")
	public static final Enchantment enchantment = null;
	public LamaenchantEnchantment(LlamaModModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("lamaenchant"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.VERY_RARE, EnchantmentType.ALL, slots);
		}

		@Override
		public int getMinLevel() {
			return 30;
		}

		@Override
		public int getMaxLevel() {
			return 60;
		}

		@Override
		public int calcModifierDamage(int level, DamageSource source) {
			return level * 22;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return true;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}
	}
}
