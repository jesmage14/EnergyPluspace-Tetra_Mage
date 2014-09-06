package tetramage.nuclearmayhem.tileentity;

import net.minecraft.tileentity.TileEntity;

public class TileEntityHydroelectricTurbine extends TileEntity {
	
	public float rotation = 0;
	
	public float maxPower = 10000;
	public float power = 0;
	
	public float powerPerRotation = 0.1F;
	
	public void updateEntity()
	{
		rotation++;
		
		power+=powerPerRotation;
		if(power > maxPower) power = maxPower;
	}
	
	
	
	
}
