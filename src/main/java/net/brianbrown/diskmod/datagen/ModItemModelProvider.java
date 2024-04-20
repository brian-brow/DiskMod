package net.brianbrown.diskmod.datagen;

import net.brianbrown.diskmod.DiskMod;
import net.brianbrown.diskmod.item.ModItems;
import net.brianbrown.diskmod.util.NameUtility;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.function.Supplier;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DiskMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        item(ModItems.CANT_TELL_ME_NOTHING.get());
        item(ModItems.HEARTLESS.get());
        item(ModItems.RUNAWAY.get());
        item(ModItems.ON_SIGHT.get());
        item(ModItems.NO_MORE_PARTIES_IN_LA.get());
        item(ModItems.GHOST_TOWN.get());
        item(ModItems.GOD_IS.get());
        item(ModItems.BELIEVE_WHAT_I_SAY.get());
    }

    private void item(Item item) {
        String name = NameUtility.getItemName(item);
        getBuilder(name)
                .parent(getExistingFile(mcLoc("item/generated")))
                .texture("layer0", "item/" + name);
    }

//    private ItemModelBuilder simpleItem(Supplier<Item> item) {
//        return withExistingParent(item.get().getDescriptionId(),
//                new ResourceLocation("item/generated")).texture("layer0",
//                new ResourceLocation(DiskMod.MODID, "item/" + item.get().));
//    }
}
