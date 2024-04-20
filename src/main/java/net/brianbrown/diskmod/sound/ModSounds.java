package net.brianbrown.diskmod.sound;

import net.brianbrown.diskmod.DiskMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, DiskMod.MODID);

    public static final Supplier<SoundEvent> CANT_TELL_ME_NOTHING = registerSoundEvents("cant_tell_me_nothing");
    public static final Supplier<SoundEvent> HEARTLESS = registerSoundEvents("heartless");
    public static final Supplier<SoundEvent> RUNAWAY = registerSoundEvents("runaway");
    public static final Supplier<SoundEvent> ON_SIGHT = registerSoundEvents("on_sight");
    public static final Supplier<SoundEvent> NO_MORE_PARTIES_IN_LA = registerSoundEvents("no_more_parties_in_la");
    public static final Supplier<SoundEvent> GHOST_TOWN = registerSoundEvents("ghost_town");
    public static final Supplier<SoundEvent> GOD_IS = registerSoundEvents("god_is");
    public static final Supplier<SoundEvent> BELIEVE_WHAT_I_SAY = registerSoundEvents("believe_what_i_say");

//    public static final SoundEvent SKINWALKER_SOUNDS = new net.neoforged.neoforge.client.event.sound.SoundEvent(1f, 1f,
//            ModSounds.SKINWALKER_BUGLE)

    private static Supplier<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () ->
                SoundEvent.createVariableRangeEvent(new ResourceLocation(DiskMod.MODID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
