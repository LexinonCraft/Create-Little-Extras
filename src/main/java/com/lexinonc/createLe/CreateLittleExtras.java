package com.lexinonc.createLe;

import com.simibubi.create.foundation.block.BlockStressValues;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.nullness.NonNullSupplier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(CreateLittleExtras.MODID)
public class CreateLittleExtras {

    public static final String MODID = "create_le";

    private static final NonNullSupplier<CreateRegistrate> REGISTRATE = CreateRegistrate.lazy(MODID);

    public static final CreativeModeTab MY_TAB = new MyItemGroup();

    public CreateLittleExtras() {
        MyFluids.register();
        MyItems.register();

        BlockStressValues.registerProvider(MODID, new MyStressValueProvider());

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static CreateRegistrate registrate() {
        return REGISTRATE.get();
    }

}
