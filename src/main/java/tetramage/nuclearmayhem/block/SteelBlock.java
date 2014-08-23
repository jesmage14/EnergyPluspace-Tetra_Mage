package tetramage.nuclearmayhem.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SteelBlock extends Block {
	
	public boolean isOpaqueCube(){
		return false;
	}
	
	
	public boolean renderAsNormalBlock(){
		return false;
	}

	public SteelBlock(int i, Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHardness(10F);
		this.setResistance(25.0F);
	}

}
