package com.lexinonc.createLe;

import com.simibubi.create.AllItems;
import com.simibubi.create.content.AllSections;
import com.simibubi.create.foundation.item.CreateItemGroupBase;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.EnumSet;

public class MyItemGroup extends CreativeModeTab {

    public MyItemGroup() {
        super("create_le.main");
    }

    @Override
    public @NotNull ItemStack makeIcon() {
        return AllItems.ANDESITE_ALLOY.asStack();
    }

}
