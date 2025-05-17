package com.skyrail_nexus.register;

import com.skyrail_nexus.SkyRailNexus;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;


public class ModBlocks {

    @SafeVarargs
    private static Block registerBlock(String name, Block item, RegistryKey<ItemGroup>... groups){
        Block register = Registry.register(Registries.BLOCK, Identifier.of(SkyRailNexus.MOD_ID, name), item);
        for (RegistryKey<ItemGroup> group : groups) {
            ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(register));
        }
        return register;
    }

    public static void init(){
        SkyRailNexus.LOGGER.info("Registry Blocks");
    }
}
