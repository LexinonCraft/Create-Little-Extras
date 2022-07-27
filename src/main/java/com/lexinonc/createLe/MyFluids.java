package com.lexinonc.createLe;

import com.simibubi.create.AllTags;
import com.simibubi.create.content.contraptions.fluids.VirtualFluid;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.entry.FluidEntry;

public class MyFluids {

    private static final CreateRegistrate REGISTRATE = CreateLittleExtras.registrate();

    public static final FluidEntry<VirtualFluid> SUPER_GLUE = REGISTRATE.virtualFluid("super_glue")
            .lang(f -> "fluid.create_le.super_glue", "Super Glue")
            .register();

    public static void register() { /* Loads this class */ }

}
