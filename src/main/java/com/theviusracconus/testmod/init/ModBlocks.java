package com.theviusracconus.testmod.init;

import com.theviusracconus.testmod.blocks.BlockColorfulBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks
{
    public static BlockColorfulBlock colorfulBlock;

    public static void init()
    {
        colorfulBlock = new BlockColorfulBlock();

        GameRegistry.registerBlock(colorfulBlock);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels()
    {
        colorfulBlock.initModel();
    }
}
