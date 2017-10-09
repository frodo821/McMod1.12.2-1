package myfirstmod;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = MyFirstMod.ModID, useMetadata = true)
public class MyFirstMod {
	public static final String ModID = "myfirstmod";
	
	@Instance(ModID)
	public static MyFirstMod instance;
	
	@SubscribeEvent
	protected static void onRegisterItems(RegistryEvent.Register<Item> event){
		ItemRegistry.Initialize(event);
		Register.RegisterItemsAndBlocks();
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		Config.configure(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
