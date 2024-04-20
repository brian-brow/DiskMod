package net.brianbrown.diskmod.datagen;

import net.brianbrown.diskmod.DiskMod;
import net.brianbrown.diskmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, DiskMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.CANT_TELL_ME_NOTHING.get());
        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.HEARTLESS.get());
        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.RUNAWAY.get());
        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.ON_SIGHT.get());
        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.NO_MORE_PARTIES_IN_LA.get());
        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.GHOST_TOWN.get());
        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.GOD_IS.get());
        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.BELIEVE_WHAT_I_SAY.get());
    }
}
