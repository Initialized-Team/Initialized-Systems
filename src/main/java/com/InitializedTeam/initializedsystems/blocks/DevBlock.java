package com.InitializedTeam.initializedsystems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class DevBlock extends Block {
    public DevBlock() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(18000000.0f,3600000.0f)
                .sound(SoundType.STONE)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)

        );
    }
}
