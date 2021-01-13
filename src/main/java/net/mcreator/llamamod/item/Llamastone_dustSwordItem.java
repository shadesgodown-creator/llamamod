
package net.mcreator.llamamod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.llamamod.itemgroup.LlamacreativetabItemGroup;
import net.mcreator.llamamod.LlamaModModElements;

@LlamaModModElements.ModElement.Tag
public class Llamastone_dustSwordItem extends LlamaModModElements.ModElement {
	@ObjectHolder("llama_mod:llamastone_dust_sword")
	public static final Item block = null;
	public Llamastone_dustSwordItem(LlamaModModElements instance) {
		super(instance, 54);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 10;
			}

			public float getEfficiency() {
				return 2f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 1;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Llamastone_dustDustItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(LlamacreativetabItemGroup.tab)) {
		}.setRegistryName("llamastone_dust_sword"));
	}
}
