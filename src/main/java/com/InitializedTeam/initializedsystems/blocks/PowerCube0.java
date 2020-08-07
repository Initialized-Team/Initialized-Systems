package com.InitializedTeam.initializedsystems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PowerCube0 extends Block {
    public PowerCube0() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(18000000.0f,3600000.0f)
                .sound(SoundType.METAL)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)

        );
    }
}
