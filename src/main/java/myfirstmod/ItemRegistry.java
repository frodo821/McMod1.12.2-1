package myfirstmod;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

public class ItemRegistry {
	static IForgeRegistry<Item> ItemRegistry;
	public static void Initialize(RegistryEvent.Register<Item> reg){
		ItemRegistry = reg.getRegistry();
	}
	
	public static void Register(Item item){
		ItemRegistry.register(item);
	}
}
