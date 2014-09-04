package tetramage.nuclearmayhem.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import tetramage.nuclearmayhem.tileentity.TileEntityHydroelectricTurbine;

public class BlockHydroelectricTurbine extends BlockContainer {

	public BlockHydroelectricTurbine(int i, Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHardness(10F);
	}


	public int getRenderType(){
		return -1;
	}
	
	public boolean isOpaqueCube(){
		return false;
	}
	
	
	public boolean renderAsNormalBlock(){
		return false;
	}
	
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityHydroelectricTurbine();
	}
}
	
	