package com.skyrail_nexus.register;

import com.skyrail_nexus.SkyRailNexus;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final RegistryKey<ItemGroup> MOD_ITEM_GROUP = register("sky_rail_nexus");

    private static RegistryKey<ItemGroup> register(String id) {

    }
}
