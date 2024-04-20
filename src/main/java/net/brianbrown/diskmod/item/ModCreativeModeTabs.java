package net.brianbrown.diskmod.item;

import net.brianbrown.diskmod.DiskMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DiskMod.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> KANYE_TAB = CREATIVE_MODE_TABS.register("kanye_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.diskmod")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ModItems.ON_SIGHT.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ModItems.CANT_TELL_ME_NOTHING.get());
                output.accept(ModItems.HEARTLESS.get());
                output.accept(ModItems.RUNAWAY.get());
                output.accept(ModItems.ON_SIGHT.get());
                output.accept(ModItems.NO_MORE_PARTIES_IN_LA.get());
                output.accept(ModItems.GHOST_TOWN.get());
                output.accept(ModItems.GOD_IS.get());
                output.accept(ModItems.BELIEVE_WHAT_I_SAY.get());
            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}