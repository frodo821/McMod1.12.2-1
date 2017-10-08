package myfirstmod;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Config {
	static Configuration cfg_instance;
	public static IInvokable invoke;
	
	public static void configure(FMLPreInitializationEvent e){
		cfg_instance = new Configuration(e.getSuggestedConfigurationFile());
	}
	
}
