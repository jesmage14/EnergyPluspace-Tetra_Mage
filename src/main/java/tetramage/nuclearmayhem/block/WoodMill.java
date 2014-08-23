package tetramage.nuclearmayhem.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import tetramage.nuclearmayhem.common.NuclearMayhem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class WoodMill extends BlockContainer{
	
	private final boolean isActive;
	
	@SideOnly(Side.CLIENT)
	private IIcon iconFront;
	
	@SideOnly(Side.CLIENT)
	private IIcon iconTop;

	public WoodMill(boolean isActive) {
		super(Material.iron);
		
		this.isActive = isActive;
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(NuclearMayhem.modid + ":" + "WoodMillSide");
		this.iconFront = iconRegister.registerIcon(NuclearMayhem.modid + ":" + (this.isActive ? "WoodMillFrontOn" : "WoodMillFrontOff" ));
		this.iconTop = iconRegister.registerIcon(NuclearMayhem.modid + ":" + "WoodMillTop");
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata) {
		return side == 3 ? this.iconFront : side == 1 ? this.iconTop : (side == metadata ? this.iconFront : this.blockIcon);
	}
	
	
	
	
	
	
	
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return null;
	}

}
