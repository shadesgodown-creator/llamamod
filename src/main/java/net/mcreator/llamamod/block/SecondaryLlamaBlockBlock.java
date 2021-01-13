
package net.mcreator.llamamod.block;

import net.minecraft.block.material.Material;

@LlamaModModElements.ModElement.Tag
public class SecondaryLlamaBlockBlock extends LlamaModModElements.ModElement {

	@ObjectHolder("llama_mod:secondary_llama_block")
	public static final Block block = null;

	public SecondaryLlamaBlockBlock(LlamaModModElements instance) {
		super(instance, 84);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(LlamacreativetabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(1f, 10f).lightValue(15).harvestLevel(1)
							.harvestTool(ToolType.PICKAXE));

			setRegistryName("secondary_llama_block");
		}

		@Override
		public PathNodeType getAiPathNodeType(BlockState state, IBlockReader world, BlockPos pos, MobEntity entity) {
			return PathNodeType.LAVA;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}