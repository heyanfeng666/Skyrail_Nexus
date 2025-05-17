package com.skyrail_nexus.register;

import com.skyrail_nexus.SkyRailNexus;
import com.skyrail_nexus.register.Item.Rail_Wrench;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    @SafeVarargs
    private static Item registerItem(String name, Item item, RegistryKey<ItemGroup>... groups){
        Item register = Registry.register(Registries.ITEM, Identifier.of(SkyRailNexus.MOD_ID, name), item);
        for (RegistryKey<ItemGroup> group : groups) {
            ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(register));
        }
        return register;
    }

    public static void init(){
        SkyRailNexus.LOGGER.info("Registry Items");
    }
}
