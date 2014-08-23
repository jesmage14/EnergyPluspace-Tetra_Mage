package tetramage.nuclearmayhem.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import tetramage.nuclearmayhem.common.NuclearMayhem;
import tetramage.nuclearmayhem.tileentity.TileEntityWoodMill;
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
		return side == 1 ? this.iconTop : (side == 0 ? this.iconTop : (side != metadata ? this.blockIcon : this.iconFront));
	}
	public Item getItemDropped(World world, int x, int y, int z) {
		return Item.getItemFromBlock(NuclearMayhem.WoodMillIdle);	
		
	}
	
	public void onBlockAdded(World world, int x, int y, int z) {
		super.onBlockAdded(world, x, y, z);
		this.setDefualtDirection(world, x, y, z);
	}
	
	
	
	
	
	
	
	private void setDefualtDirection(World world, int x, int y, int z) {
		if(!world.isRemote) {
			Block b1 = world.getBlock(x, y, z - 1);
			Block b2 = world.getBlock(x, y, z + 1);
			Block b3 = world.getBlock(x - 1, y, z);
			Block b4 = world.getBlock(x + 1, y, z);
			
			byte b0 = 3;
			
			if(b1.func_149730_j() && !b2.func_149730_j()) {
				b0 = 3;
				
			}
			
			if(b2.func_149730_j() && !b1.func_149730_j()) {
				b0 = 2;
				
			}
			
			if(b3.func_149730_j() && !b4.func_149730_j()) {
				b0 = 5;
				
			}
			
			if(b4.func_149730_j() && !b3.func_149730_j()) {
				b0 = 4;
				
			}
			
			world.setBlockMetadataWithNotify(x, y, x, b0, 2);
			
		}
	}
	
	//TODO onBlockActivated

	@Override
	public TileEntity createNewTileEntity(World world, int i) {
		return new TileEntityWoodMill();
	}

	//TODO randomDisplayTick
	
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityplayer, ItemStack itemstack) {
		int l = MathHelper.floor_double((double)(entityplayer.rotationYaw * 4.0F / 360.F) + 0.5D) & 3;
		
		if(l == 0){
			world.setBlockMetadataWithNotify(x, y, z, 2, 2);
			
		}
		
		if(l == 1){
			world.setBlockMetadataWithNotify(x, y, z, 5, 2);
			
		}
		
		if(l == 2){
			world.setBlockMetadataWithNotify(x, y, z, 3, 2);
			
		}
		
		if(l == 3){
			world.setBlockMetadataWithNotify(x, y, z, 4, 2);
			
		}
		
		if(itemstack.hasDisplayName()) {
		((TileEntityWoodMill)world.getTileEntity(x, y, z)).setGuiDisplayName(itemstack.getDisplayName());
		
		}
	}
	
	
}
