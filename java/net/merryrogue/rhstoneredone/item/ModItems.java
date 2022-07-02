package net.merryrogue.rhstoneredone.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.merryrogue.rhstoneredone.StoneRedone;

public class ModItems
{
    // This is the template for all new items
    //public static final Item ITEMNAME = registerItem("name", new Item(new FabricItemSettings().group(ItemGroup.MISC));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(StoneRedone.MOD_ID, name),item);
    }

    public static void registerModItems ()
    {
        System.out.println("Registering Mod Items for " + StoneRedone.MOD_ID);
    }
}
