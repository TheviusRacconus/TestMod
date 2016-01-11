package com.theviusracconus.testmod.creativetab;

import com.theviusracconus.testmod.init.ModBlocks;
import com.theviusracconus.testmod.init.ModItems;
import com.theviusracconus.testmod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTestMod
{
    public static final CreativeTabs TESTMOD_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.thiefMask;
        }
    };
}
