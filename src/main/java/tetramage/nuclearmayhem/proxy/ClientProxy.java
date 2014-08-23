package tetramage.nuclearmayhem.proxy;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import tetramage.nuclearmayhem.renderer.RenderHydroelectricTurbine;
import tetramage.nuclearmayhem.tileentity.TileEntityHydroelectricTurbine;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
	
	public void registerProxies(){

	}
	
	public void registerTileEntitySpecialRenderer(){
		
	}
	
	public void registerRenderThings() {
		TileEntitySpecialRenderer render = new RenderHydroelectricTurbine();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHydroelectricTurbine.class, render);
	}
	
}
