// Copyright (c) Daniel-Tayden Larsen 2022 //
// License: MCLM-OSL (2022) //

package com.mclegoman.beekeeper.registry;

import com.mclegoman.beekeeper.main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.mclegoman.beekeeper.main.MOD_ID;

public class items {
    public static final Item GOLDEN_CHAINMAIL_HELMET = registerItem("golden_chainmail_helmet",
            new ArmorItem(armorMaterials.GOLD_CHAIN, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(itemGroup.BEEKEEPER)));
    public static final Item GOLDEN_CHAINMAIL_CHESTPLATE = registerItem("golden_chainmail_chainmail",
            new ArmorItem(armorMaterials.GOLD_CHAIN, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(itemGroup.BEEKEEPER)));
    public static final Item GOLDEN_CHAINMAIL_LEGGINGS = registerItem("golden_chainmail_leggings",
            new ArmorItem(armorMaterials.GOLD_CHAIN, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(itemGroup.BEEKEEPER)));
    public static final Item GOLDEN_CHAINMAIL_BOOTS = registerItem("golden_chainmail_boots",
            new ArmorItem(armorMaterials.GOLD_CHAIN, EquipmentSlot.FEET,
                    new FabricItemSettings().group(itemGroup.BEEKEEPER)));
    public static final Item DIAMOND_CHAINMAIL_HELMET = registerItem("diamond_chainmail_helmet",
            new ArmorItem(armorMaterials.DIAMOND_CHAIN, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(itemGroup.BEEKEEPER)));
    public static final Item DIAMOND_CHAINMAIL_CHESTPLATE = registerItem("diamond_chainmail_chainmail",
            new ArmorItem(armorMaterials.DIAMOND_CHAIN, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(itemGroup.BEEKEEPER)));
    public static final Item DIAMOND_CHAINMAIL_LEGGINGS = registerItem("diamond_chainmail_leggings",
            new ArmorItem(armorMaterials.DIAMOND_CHAIN, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(itemGroup.BEEKEEPER)));
    public static final Item DIAMOND_CHAINMAIL_BOOTS = registerItem("diamond_chainmail_boots",
            new ArmorItem(armorMaterials.DIAMOND_CHAIN, EquipmentSlot.FEET,
                    new FabricItemSettings().group(itemGroup.BEEKEEPER)));
    public static final Item NETHERITE_CHAINMAIL_HELMET = registerItem("netherite_chainmail_helmet",
            new ArmorItem(armorMaterials.NETHERITE_CHAIN, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(itemGroup.BEEKEEPER)));
    public static final Item NETHERITE_CHAINMAIL_CHESTPLATE = registerItem("netherite_chainmail_chainmail",
            new ArmorItem(armorMaterials.NETHERITE_CHAIN, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(itemGroup.BEEKEEPER)));
    public static final Item NETHERITE_CHAINMAIL_LEGGINGS = registerItem("netherite_chainmail_leggings",
            new ArmorItem(armorMaterials.NETHERITE_CHAIN, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(itemGroup.BEEKEEPER)));
    public static final Item NETHERITE_CHAINMAIL_BOOTS = registerItem("netherite_chainmail_boots",
            new ArmorItem(armorMaterials.NETHERITE_CHAIN, EquipmentSlot.FEET,
                    new FabricItemSettings().group(itemGroup.BEEKEEPER)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void registerItems() {
        main.LOGGER.info("Registering Items for " + MOD_ID);
    }
}