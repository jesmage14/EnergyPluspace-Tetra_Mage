package tetramage.nuclearmayhem.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import tetramage.nuclearmayhem.common.NuclearMayhem;

public class ItemHydroelectricTurbine extends Item {
	

	
	public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int side, float x2, float y2, float z2){
		if(!world.isRemote){
			world.setBlock(x, y+1, z, NuclearMayhem.blockHydroelectricTurbine);
		return true;
	}
		return false;
	}

	public ItemHydroelectricTurbine(int i){
		
	}
		
	
}
