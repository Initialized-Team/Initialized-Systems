package com.InitializedTeam.initializedsystems.util;

import com.InitializedTeam.initializedsystems.InitializedSystems;
import com.InitializedTeam.initializedsystems.blocks.*;
import com.InitializedTeam.initializedsystems.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, InitializedSystems.MODID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, InitializedSystems.MODID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> ENERGY_CRYSTAL_1 = ITEMS.register("energy_crystal_1", ItemBase::new);
    public static final RegistryObject<Item> ENERGY_CRYSTAL_2 = ITEMS.register("energy_crystal_2", ItemBase::new);
    public static final RegistryObject<Item> ENERGY_CRYSTAL_3 = ITEMS.register("energy_crystal_3", ItemBase::new);
    public static final RegistryObject<Item> ENERGY_CRYSTAL_4 = ITEMS.register("energy_crystal_4", ItemBase::new);
    public static final RegistryObject<Item> ENERGY_CRYSTAL_5 = ITEMS.register("energy_crystal_5", ItemBase::new);
    public static final RegistryObject<Item> ENERGY_CRYSTAL_6 = ITEMS.register("energy_crystal_6", ItemBase::new);
    public static final RegistryObject<Item> ENERGY_CRYSTAL_7 = ITEMS.register("energy_crystal_7", ItemBase::new);
    public static final RegistryObject<Item> ENERGY_CRYSTAL_FRAGMENTS = ITEMS.register("energy_crystal_fragments", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block> CRYSTAL_ORE_BLOCK = BLOCKS.register("crystal_ore_block", CrystalOreBlock::new);
    public static final RegistryObject<Block> DEV_BLOCK = BLOCKS.register("dev_block", DevBlock::new);
    public static final RegistryObject<Block> POWER_CUBE_1 = BLOCKS.register("power_cube_1", PowerCube1::new);
    public static final RegistryObject<Block> POWER_CUBE_2 = BLOCKS.register("power_cube_2", PowerCube2::new);
    public static final RegistryObject<Block> POWER_CUBE_3 = BLOCKS.register("power_cube_3", PowerCube3::new);
    public static final RegistryObject<Block> POWER_CUBE_4 = BLOCKS.register("power_cube_4", PowerCube4::new);
    public static final RegistryObject<Block> POWER_CUBE_5 = BLOCKS.register("power_cube_5", PowerCube5::new);
    public static final RegistryObject<Block> POWER_CUBE_6 = BLOCKS.register("power_cube_6", PowerCube6::new);
    public static final RegistryObject<Block> POWER_CUBE_7 = BLOCKS.register("power_cube_7", PowerCube7::new);
    public static final RegistryObject<Block> POWER_CUBE_0 = BLOCKS.register("power_cube_0", PowerCube0::new);
    public static final RegistryObject<Block> DEV_CABLE = BLOCKS.register("dev_cable", DevCable::new);
    public static final RegistryObject<Block> GEN_BLOCK = BLOCKS.register("gen_block", GenBlock::new);

    // Block Items
    public static final RegistryObject<Item> CRYSTAL_ORE_BLOCK_ITEM = ITEMS.register("crystal_ore_block", () -> new BlockItemBase(CRYSTAL_ORE_BLOCK.get()));
    public static final RegistryObject<Item> DEV_BLOCK_ITEM = ITEMS.register("dev_block", () -> new BlockItemBase(DEV_BLOCK.get()));
    public static final RegistryObject<Item> POWER_CUBE_1_ITEM = ITEMS.register("power_cube_1", () -> new BlockItemBase(POWER_CUBE_1.get()));
    public static final RegistryObject<Item> POWER_CUBE_2_ITEM = ITEMS.register("power_cube_2", () -> new BlockItemBase(POWER_CUBE_2.get()));
    public static final RegistryObject<Item> POWER_CUBE_3_ITEM = ITEMS.register("power_cube_3", () -> new BlockItemBase(POWER_CUBE_3.get()));
    public static final RegistryObject<Item> POWER_CUBE_4_ITEM = ITEMS.register("power_cube_4", () -> new BlockItemBase(POWER_CUBE_4.get()));
    public static final RegistryObject<Item> POWER_CUBE_5_ITEM = ITEMS.register("power_cube_5", () -> new BlockItemBase(POWER_CUBE_5.get()));
    public static final RegistryObject<Item> POWER_CUBE_6_ITEM = ITEMS.register("power_cube_6", () -> new BlockItemBase(POWER_CUBE_6.get()));
    public static final RegistryObject<Item> POWER_CUBE_7_ITEM = ITEMS.register("power_cube_7", () -> new BlockItemBase(POWER_CUBE_7.get()));
    public static final RegistryObject<Item> POWER_CUBE_0_ITEM = ITEMS.register("power_cube_0", () -> new BlockItemBase(POWER_CUBE_0.get()));
    public static final RegistryObject<Item> DEV_CABLE_ITEM = ITEMS.register("dev_cable", () -> new BlockItemBase(DEV_CABLE.get()));
    public static final RegistryObject<Item> GEN_BLOCK_ITEM = ITEMS.register("gen_block", () -> new BlockItemBase(GEN_BLOCK.get()));

}
