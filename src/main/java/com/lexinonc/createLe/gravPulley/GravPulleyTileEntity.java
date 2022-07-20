package com.lexinonc.createLe.gravPulley;

import com.simibubi.create.content.contraptions.components.structureMovement.pulley.PulleyTileEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class GravPulleyTileEntity extends PulleyTileEntity {

    protected int cutRopeOffset;

    public GravPulleyTileEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

}
