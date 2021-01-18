
package net.mcreator.llamamod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.llamamod.item.Opm112137778783979000043789366907396403206438274809326895Item;
import net.mcreator.llamamod.LlamaModModElements;

@LlamaModModElements.ModElement.Tag
public class OpmtabItemGroup extends LlamaModModElements.ModElement {
	public OpmtabItemGroup(LlamaModModElements instance) {
		super(instance, 116);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabopmtab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Opm112137778783979000043789366907396403206438274809326895Item.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
