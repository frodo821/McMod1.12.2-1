package myfirstmod.items;

import myfirstmod.MyFirstMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemMagicFood extends ItemFood {
	private ItemMagicFood(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setMaxStackSize(999);
		setUnlocalizedName("item.MagicFood");
		setRegistryName(MyFirstMod.ModID, "itemMagicFood");
	}
	
	public ItemMagicFood(){
		this(6, 8.0F, false);
	}
	
	@Override
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 8;
    }
	
	@Override
	protected void onFoodEaten(ItemStack stack,World world, EntityPlayer player)
	{
        if (!world.isRemote)
        {
        	PotionEffect effect = PotionTypes.STRONG_REGENERATION.getEffects().get(0);
            player.addPotionEffect(
            	new PotionEffect(
            		effect.getPotion(),
            		effect.getAmplifier(),
            		20
            		));
        }
	}
}
