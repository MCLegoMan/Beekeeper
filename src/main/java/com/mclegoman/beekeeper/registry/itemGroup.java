// Copyright (c) Daniel-Tayden Larsen 2022 //
// License: MCLM-OSL (2022) //

package com.mclegoman.beekeeper.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import static com.mclegoman.beekeeper.main.MOD_ID;

public class itemGroup {
    public static final ItemGroup BEEKEEPER = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "beekeeper"),
            () -> new ItemStack(Items.CHAINMAIL_HELMET));
}