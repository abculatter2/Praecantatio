package com.abculatter.praecantatio;

import com.abculatter.praecantatio.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "praecantatio", name = "Praecantatio", version = "B79-0.1")
public class praecantatio {

    @Mod.Instance("praecantatio")
    public static praecantatio instance;

    @SidedProxy
    public static IProxy proxy ;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {



    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {


    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {


    }
}
