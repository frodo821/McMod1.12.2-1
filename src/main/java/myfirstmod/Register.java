package myfirstmod;

import myfirstmod.items.ItemMagicFood;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Register {
	
	public static Item magicFood;
	
	public static void RegisterItemsAndBlocks(){
		magicFood = new ItemMagicFood();
		ItemRegistry.Register(magicFood);
	}
	
	public static void RegisterCraftings(){
		
	}
}
