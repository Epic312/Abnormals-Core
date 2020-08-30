package com.teamabnormals.abnormals_core.common.blocks.wood;

import com.teamabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.teamabnormals.abnormals_core.core.util.ItemStackUtil;

import net.minecraft.block.BlockState;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;

public class WoodStairsBlock extends AbnormalsStairsBlock {
	public WoodStairsBlock(BlockState state, Properties properties) {
		super(state, properties);
	}
	
	@Override
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
		if (ItemStackUtil.isInGroup(this.asItem(), group)) {
			int targetIndex = ItemStackUtil.findIndexOfItem(Items.DARK_OAK_STAIRS, items);
			if (targetIndex != -1) {
				items.add(targetIndex + 1, new ItemStack(this));
			} else {
				super.fillItemGroup(group, items);
			}
		}
	}
}
