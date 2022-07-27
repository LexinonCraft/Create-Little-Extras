package com.lexinonc.createLe;

import com.simibubi.create.content.AllSections;
import com.simibubi.create.content.contraptions.itemAssembly.SequencedAssemblyItem;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

public class MyItems {

    private static final CreateRegistrate REGISTRATE = CreateLittleExtras.registrate()
            .creativeModeTab(() -> CreateLittleExtras.MY_TAB);

    public static final ItemEntry<SequencedAssemblyItem> INCOMPLETE_SUPER_GLUE_ITEM = REGISTRATE.item("incomplete_super_glue", SequencedAssemblyItem::new).register();

    public static void register() { /* Loads this class */ }

}
