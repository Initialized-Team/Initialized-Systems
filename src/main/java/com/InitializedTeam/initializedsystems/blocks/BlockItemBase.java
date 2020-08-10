package com.InitializedTeam.initializedsystems.blocks;

import com.InitializedTeam.initializedsystems.InitializedSystems;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(InitializedSystems.TAB));
    }
}
