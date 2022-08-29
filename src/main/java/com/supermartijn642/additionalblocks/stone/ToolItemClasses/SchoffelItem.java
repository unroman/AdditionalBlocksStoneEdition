package com.supermartijn642.additionalblocks.stone.ToolItemClasses;

import com.supermartijn642.additionalblocks.stone.IConfigObject;
import com.supermartijn642.additionalblocks.stone.IItemGroupIndex;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tiers;

import java.util.function.Supplier;

public class SchoffelItem extends HoeItem implements IConfigObject, IItemGroupIndex {

    private final Supplier<Boolean> enable;

    public SchoffelItem(String registryName, Supplier<Boolean> enable, Properties properties, int attackDamage, float attackSpeed, Tiers tier) {
        super(tier, attackDamage, attackSpeed, properties);
        this.setRegistryName(registryName);
        this.enable = enable;
    }

    @Override
    public boolean isEnabled() {
        return this.enable.get();
    }

    @Override
    public void fillItemCategory(CreativeModeTab group, NonNullList<ItemStack> items) {
        if (this.isEnabled())
            super.fillItemCategory(group, items);
    }

    @Override
    public int getItemGroupIndex() {
        return 4;
    }
}

