package com.theviusracconus.testmod.init;

import com.theviusracconus.testmod.blocks.BlockColorfulBlock;
import com.theviusracconus.testmod.blocks.BlockTheviusOre;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks
{
    public static BlockColorfulBlock colorfulBlock;
    public static BlockTheviusOre theviusOre;

    public static void init()
    {
        colorfulBlock = new BlockColorfulBlock();
        theviusOre = new BlockTheviusOre();

        GameRegistry.registerBlock(colorfulBlock);
        GameRegistry.registerBlock(theviusOre);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels()
    {
        colorfulBlock.initModel();
        theviusOre.initModel();
    }
}
