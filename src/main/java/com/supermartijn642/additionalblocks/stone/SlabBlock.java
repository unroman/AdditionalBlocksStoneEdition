package com.supermartijn642.additionalblocks.stone;

import net.minecraft.block.Block;

/**
 * Created 1/17/2021 by SuperMartijn642
 */
public class SlabBlock extends net.minecraft.block.SlabBlock {

    public SlabBlock(Block block, Properties properties){
        super(properties);
        this.setRegistryName(block.getRegistryName().getPath() + "_slab");
    }
    public SlabBlock(Block block, String registryName, Properties properties){
        super(properties);
        this.setRegistryName(registryName);
    }
}
