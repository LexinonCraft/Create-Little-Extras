package com.lexinonc.createLe.gravPulley;

import com.mojang.datafixers.types.Type;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.Set;

public class GravPulleyTileEntityType extends BlockEntityType<GravPulleyTileEntity> {
    public GravPulleyTileEntityType(BlockEntitySupplier p_155259_, Set<Block> p_155260_, Type<?> p_155261_) {
        super(p_155259_, p_155260_, p_155261_);
    }
}
