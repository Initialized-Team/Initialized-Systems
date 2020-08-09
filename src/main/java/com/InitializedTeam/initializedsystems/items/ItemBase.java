package com.InitializedTeam.initializedsystems.items;


import com.InitializedTeam.initializedsystems.InitializedSystems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(InitializedSystems.TAB));
    }
}
