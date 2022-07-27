package com.lexinonc.createLe;

import com.simibubi.create.foundation.block.BlockStressValues;
import com.simibubi.create.foundation.utility.Couple;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

public class MyStressValueProvider implements BlockStressValues.IStressValueProvider {
    @Override
    public double getImpact(Block block) {
        /*if(block == CreateLittleExtras.testBlock.get())
            return 128;*/

        return 0;
    }

    @Override
    public double getCapacity(Block block) {
        return 0;
    }

    @Override
    public boolean hasImpact(Block block) {
        //return block == CreateLittleExtras.testBlock.get();
        return false;
    }

    @Override
    public boolean hasCapacity(Block block) {
        return false;
    }

    @Nullable
    @Override
    public Couple<Integer> getGeneratedRPM(Block block) {
        return null;
    }
}
