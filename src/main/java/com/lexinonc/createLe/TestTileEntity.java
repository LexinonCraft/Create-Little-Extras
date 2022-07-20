package com.lexinonc.createLe;

import com.simibubi.create.content.contraptions.base.KineticTileEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class TestTileEntity extends KineticTileEntity {

    public TestTileEntity(BlockPos pos, BlockState state) {
        super(CreateLittleExtras.TEST_TILE_ENTITY.get(), pos, state);
        setLazyTickRate(20);
    }

}
