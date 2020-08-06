package com.InitializedTeam.initializedsystems.util;

import com.InitializedTeam.initializedsystems.InitializedSystems;
import com.InitializedTeam.initializedsystems.blocks.BlockItemBase;
import com.InitializedTeam.initializedsystems.blocks.CrystalOreBlock;
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

    // Blocks
    public static final RegistryObject<Block> CRYSTAL_ORE_BLOCK = BLOCKS.register("crystal_ore_block", CrystalOreBlock::new);

    // Block Items
    public static final RegistryObject<Item> CRYSTAL_ORE_BLOCK_ITEM = ITEMS.register("crystal_ore_block", () -> new BlockItemBase(CRYSTAL_ORE_BLOCK.get()));

}
