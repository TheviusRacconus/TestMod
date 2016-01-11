package com.theviusracconus.testmod.init;

import com.theviusracconus.testmod.items.ItemThiefMask;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems
{
    public static ItemThiefMask thiefMask;

    public static void init()
    {
        thiefMask = new ItemThiefMask();

        GameRegistry.registerItem(thiefMask);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels()
    {
        thiefMask.initModel();
    }
}
