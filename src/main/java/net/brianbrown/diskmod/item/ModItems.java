package net.brianbrown.diskmod.item;

import net.brianbrown.diskmod.DiskMod;
//import net.brianbrown.diskmod.DiskMod.ModEntities;
import net.brianbrown.diskmod.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(DiskMod.MODID);

    public static final Supplier<Item> CANT_TELL_ME_NOTHING = ITEMS.register("cant_tell_me_nothing",
            () -> new RecordItem(4, ModSounds.CANT_TELL_ME_NOTHING, new Item.Properties().stacksTo(1), 10960));
    public static final Supplier<Item> HEARTLESS = ITEMS.register("heartless",
            () -> new RecordItem(4, ModSounds.HEARTLESS, new Item.Properties().stacksTo(1), 10960));
    public static final Supplier<Item> RUNAWAY = ITEMS.register("runaway",
            () -> new RecordItem(5, ModSounds.RUNAWAY, new Item.Properties().stacksTo(1), 10960));
    public static final Supplier<Item> ON_SIGHT = ITEMS.register("on_sight",
            () -> new RecordItem(6, ModSounds.ON_SIGHT, new Item.Properties().stacksTo(1), 3120));
    public static final Supplier<Item> NO_MORE_PARTIES_IN_LA = ITEMS.register("no_more_parties_in_la",
            () -> new RecordItem(7, ModSounds.NO_MORE_PARTIES_IN_LA, new Item.Properties().stacksTo(1), 7480));
    public static final Supplier<Item> GHOST_TOWN = ITEMS.register("ghost_town",
            () -> new RecordItem(8, ModSounds.GHOST_TOWN, new Item.Properties().stacksTo(1), 5420));
    public static final Supplier<Item> GOD_IS = ITEMS.register("god_is",
            () -> new RecordItem(9, ModSounds.GOD_IS, new Item.Properties().stacksTo(1), 4060));
    public static final Supplier<Item> BELIEVE_WHAT_I_SAY = ITEMS.register("believe_what_i_say",
            () -> new RecordItem(10, ModSounds.BELIEVE_WHAT_I_SAY, new Item.Properties().stacksTo(1), 4840));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
