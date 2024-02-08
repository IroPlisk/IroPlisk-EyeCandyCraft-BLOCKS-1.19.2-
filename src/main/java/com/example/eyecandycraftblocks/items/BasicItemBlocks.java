package com.example.eyecandycraftblocks.items;

import com.example.eyecandycraftblocks.EyeCandyCraftBlocks;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BasicItemBlocks {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EyeCandyCraftBlocks.MODID);

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus);}

}
