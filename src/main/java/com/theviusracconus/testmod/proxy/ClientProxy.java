package com.theviusracconus.testmod.proxy;

import com.theviusracconus.testmod.init.ModBlocks;
import com.theviusracconus.testmod.init.ModItems;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
        ModBlocks.initModels();
        ModItems.initModels();
    }
}
