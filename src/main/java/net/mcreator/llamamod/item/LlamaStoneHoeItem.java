
package net.mcreator.llamamod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.llamamod.itemgroup.LlamacreativetabItemGroup;
import net.mcreator.llamamod.LlamaModModElements;

@LlamaModModElements.ModElement.Tag
public class LlamaStoneHoeItem extends LlamaModModElements.ModElement {
	@ObjectHolder("llama_mod:llama_stone_hoe")
	public static final Item block = null;
	public LlamaStoneHoeItem(LlamaModModElements instance) {
		super(instance, 35);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(LlamaStoneIngotItem.block, (int) (1)));
			}
		}, -3f, new Item.Properties().group(LlamacreativetabItemGroup.tab)) {
		}.setRegistryName("llama_stone_hoe"));
	}
}
