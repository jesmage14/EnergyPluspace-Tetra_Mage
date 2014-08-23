package tetramage.nuclearmayhem.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import tetramage.nuclearmayhem.block.BlockHydroelectricTurbine;
import tetramage.nuclearmayhem.block.CementBlock;
import tetramage.nuclearmayhem.block.CopperOre;
import tetramage.nuclearmayhem.block.LeadOre;
import tetramage.nuclearmayhem.block.ReactorContainmentBlock;
import tetramage.nuclearmayhem.block.SilverOre;
import tetramage.nuclearmayhem.block.SteelBlock;
import tetramage.nuclearmayhem.block.WoodMill;
import tetramage.nuclearmayhem.block.ZincOre;
import tetramage.nuclearmayhem.creativetab.placeholder.NuclearMayhemTabPlaceHolder;
import tetramage.nuclearmayhem.item.CadmiumIngot;
import tetramage.nuclearmayhem.item.CopperIngot;
import tetramage.nuclearmayhem.item.IndiumIngot;
import tetramage.nuclearmayhem.item.ItemHydroelectricTurbine;
import tetramage.nuclearmayhem.item.LeadIngot;
import tetramage.nuclearmayhem.item.SilverIngot;
import tetramage.nuclearmayhem.item.SteelIngot;
import tetramage.nuclearmayhem.item.SteelSupport;
import tetramage.nuclearmayhem.item.TurbineBlade;
import tetramage.nuclearmayhem.item.TurbineHead;
import tetramage.nuclearmayhem.item.TurbineHub;
import tetramage.nuclearmayhem.item.WaterProofing;
import tetramage.nuclearmayhem.item.ZincIngot;
import tetramage.nuclearmayhem.proxy.CommonProxy;
import tetramage.nuclearmayhem.tileentity.TileEntityHydroelectricTurbine;
import tetramage.nuclearmayhem.worldgen.NuclearMayhemWorldGen;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;




@Mod(modid = NuclearMayhem.modid, name = NuclearMayhem.name, version = NuclearMayhem.version)
public class NuclearMayhem {

public static final String modid = "NuclearMayhem";

public static final String name = "EnergyPluspace";

public static final String version = "ALPHA 1.0";


@SidedProxy(clientSide="tetramage.nuclearmayhem.proxy.ClientProxy", serverSide="tetramage.nuclearmayhem.proxy.CommonProxy")
public static CommonProxy proxy;




//Blocks

public static Block SteelBlock;
public static Block ZincOre;
public static Block CopperOre;
public static Block LeadOre;
public static Block SilverOre;
public static Block ReactorContainmentBlock;
public static Block CementBlock;
public static Block blockHydroelectricTurbine;
public static Block WoodMillIdle;
public static Block WoodMillActive;




//Ore Generation

NuclearMayhemWorldGen eventWorldgen = new NuclearMayhemWorldGen();

//Items

public static Item ZincIngot;
public static Item CopperIngot;
public static Item LeadIngot;
public static Item CadmiumIngot;
public static Item IndiumIngot;
public static Item SilverIngot;
public static Item SteelIngot;
public static Item TurbineBlade;
public static Item TurbineHub;
public static Item TurbineHead;
public static Item WaterProofing;
public static Item SteelSupport;
public static Item itemHydroelectricTurbine;

public static CreativeTabs NuclearMayhemTab = new CreativeTabs("NuclearMayhemTab"){
	
	public Item getTabIconItem() {
		return SteelIngot;
	}
};
public static Item NuclearMayhemTabPlaceHolder = new NuclearMayhemTabPlaceHolder(3009).setUnlocalizedName("NuclearMayhemTabPlaceHolder").setTextureName("NuclearMayhem:CadmiumIngot");


@EventHandler
	public void preInit(FMLPreInitializationEvent e){
	
	SteelBlock = new SteelBlock(3000, Material.rock).setBlockName("SteelBlock").setBlockTextureName("NuclearMayhem:SteelBlock").setCreativeTab(NuclearMayhemTab);
	GameRegistry.registerBlock(SteelBlock, "SteelBlock");
	
	SteelIngot = new SteelIngot(3014).setUnlocalizedName("SteelIngot").setTextureName("NuclearMayhem:SteelIngot").setCreativeTab(NuclearMayhemTab);
	GameRegistry.registerItem(SteelIngot, "SteelIngot");
	
	ZincOre = new ZincOre(3001, Material.rock).setBlockName("ZincOre").setBlockTextureName("NuclearMayhem:ZincOre").setCreativeTab(NuclearMayhemTab);
	GameRegistry.registerBlock(ZincOre, "ZincOre");
	
	CopperOre = new CopperOre(3002, Material.rock).setBlockName("CopperOre").setBlockTextureName("NuclearMayhem:CopperOre").setCreativeTab(NuclearMayhemTab);
	GameRegistry.registerBlock(CopperOre, "CopperOre");
	
	LeadOre = new LeadOre(3006, Material.rock).setBlockName("LeadOre").setBlockTextureName("NuclearMayhem:LeadOre").setCreativeTab(NuclearMayhemTab);
	GameRegistry.registerBlock(LeadOre, "LeadOre");
	
	SilverOre = new SilverOre(3010, Material.rock).setBlockName("SilverOre").setBlockTextureName("NuclearMayhem:SilverOre").setCreativeTab(NuclearMayhemTab);
	GameRegistry.registerBlock(SilverOre, "SilverOre");
	
	ReactorContainmentBlock = new ReactorContainmentBlock(3012, Material.rock).setBlockName("ReactorContainmentBlock").setBlockTextureName("NuclearMayhem:ReactorContainmentBlock").setCreativeTab(NuclearMayhemTab);
	GameRegistry.registerBlock(ReactorContainmentBlock, "ReactorContainmentBlock");
	
	CementBlock = new CementBlock(3013, Material.rock).setBlockName("CementBlock").setBlockTextureName("NuclearMayhem:CementBlock").setCreativeTab(NuclearMayhemTab);
	GameRegistry.registerBlock(CementBlock, "CementBlock");
	
	blockHydroelectricTurbine = new BlockHydroelectricTurbine(3020, Material.rock).setBlockName("HydroelectricTurbine");
	GameRegistry.registerBlock(blockHydroelectricTurbine, "blockHydroelectricTurbine");
	
	GameRegistry.registerTileEntity(TileEntityHydroelectricTurbine.class, "HydroelectricTurbine");
	
	itemHydroelectricTurbine = new ItemHydroelectricTurbine(3021).setUnlocalizedName("HydroelectricTurbine").setTextureName("diamond").setCreativeTab(NuclearMayhemTab);
	GameRegistry.registerItem(itemHydroelectricTurbine, "itemHydroelectricTurbine");
	
	ZincIngot = new ZincIngot(3003).setUnlocalizedName("ZincIngot").setTextureName("NuclearMayhem:ZincIngot").setCreativeTab(NuclearMayhemTab);
	GameRegistry.registerItem(ZincIngot, "ZincIngot");
	
	CopperIngot = new CopperIngot(3004).setUnlocalizedName("CopperIngot").setTextureName("NuclearMayhem:CopperIngot").setCreativeTab(NuclearMayhemTab);
	GameRegistry.registerItem(CopperIngot, "CopperIngot");
	
	LeadIngot = new LeadIngot(3005).setUnlocalizedName("LeadIngot").setTextureName("NuclearMayhem:LeadIngot").setCreativeTab(NuclearMayhemTab);
	GameRegistry.registerItem(LeadIngot, "LeadIngot");
	
	CadmiumIngot = new CadmiumIngot(3007).setUnlocalizedName("CadmiumIngot").setTextureName("NuclearMayhem:CadmiumIngot").setCreativeTab(NuclearMayhemTab);
	GameRegistry.registerItem(CadmiumIngot, "CadmiumIngot");
	
	IndiumIngot = new IndiumIngot(3008).setUnlocalizedName("IndiumIngot").setTextureName("NuclearMayhem:IndiumIngot").setCreativeTab(NuclearMayhemTab);
	GameRegistry.registerItem(IndiumIngot, "IndiumIngot");
	
	SilverIngot = new SilverIngot(3011).setUnlocalizedName("SilverIngot").setTextureName("NuclearMayhem:SilverIngot").setCreativeTab(NuclearMayhemTab);
	GameRegistry.registerItem(SilverIngot, "SilverIngot");
	
	TurbineBlade = new TurbineBlade(3015).setUnlocalizedName("TurbineBlade").setTextureName("NuclearMayhem:TurbineBlade").setCreativeTab(NuclearMayhemTab);
	GameRegistry.registerItem(TurbineBlade, "TurbineBlade");
	
	TurbineHub = new TurbineHub(3016).setUnlocalizedName("TurbineHub").setTextureName("NuclearMayhem:TurbineHub").setCreativeTab(NuclearMayhemTab);
	GameRegistry.registerItem(TurbineHub, "TurbineHub");
	
	TurbineHead = new TurbineHead(3017).setUnlocalizedName("TurbineHead").setTextureName("NuclearMayhem:TurbineHead").setCreativeTab(NuclearMayhemTab);
	GameRegistry.registerItem(TurbineHead, "TurbineHead");
	
	WaterProofing = new WaterProofing(3018).setUnlocalizedName("WaterProofing").setTextureName("NuclearMayhem:WaterProofing").setCreativeTab(NuclearMayhemTab);
	GameRegistry.registerItem(WaterProofing, "WaterProofing");
	
	SteelSupport = new SteelSupport(3019).setUnlocalizedName("SteelSupport").setTextureName("NuclearMayhem:SteelSupport").setCreativeTab(NuclearMayhemTab);
	GameRegistry.registerItem(SteelSupport, "SteelSupport");
	
	WoodMillIdle = new WoodMill(false).setBlockName("WoodMillIdle").setCreativeTab(NuclearMayhemTab);
	GameRegistry.registerBlock(WoodMillIdle, "WoodMillIdle");
	
	WoodMillActive = new WoodMill(false).setBlockName("WoodMillActive").setLightLevel(0.625F);
	GameRegistry.registerBlock(WoodMillActive, "WoodMillActive");		
	
	proxy.registerRenderThings();
	
	
	
}

@EventHandler
	public void init(FMLInitializationEvent e){
	
			GameRegistry.registerItem(NuclearMayhemTabPlaceHolder, "NuclearMayhemPlaceHolder");
			
			//Smelting Recipes Registry
			
			GameRegistry.addSmelting(ZincOre, new ItemStack(ZincIngot), 1);
			GameRegistry.addSmelting(CopperOre, new ItemStack(CopperIngot), 1);
			GameRegistry.addSmelting(LeadOre, new ItemStack(LeadIngot), 1);
			GameRegistry.addSmelting(ZincIngot, new ItemStack(IndiumIngot), 2);
			GameRegistry.addSmelting(SilverOre, new ItemStack(SilverIngot), 3);
			
			//World Generation Registry
			
			GameRegistry.registerWorldGenerator(eventWorldgen, 0);
			
			//Crafting Recipes Registry
			
				ItemStack waterStack = new ItemStack(Items.water_bucket, 1);
				ItemStack sandStack = new ItemStack(Blocks.sand, 1);
				ItemStack gravelStack = new ItemStack(Blocks.gravel, 1);
				ItemStack clayStack = new ItemStack(Blocks.clay, 1);
				
			
			GameRegistry.addRecipe(new ItemStack(ReactorContainmentBlock, 1), new Object [] {
				"OOO", "OSO", "OOO", 'S', SteelBlock, 'O', Blocks.obsidian		
				});
			
			GameRegistry.addShapelessRecipe(new ItemStack(CementBlock), waterStack, sandStack, gravelStack, clayStack);
			
			GameRegistry.addRecipe(new ItemStack(SteelBlock, 1), new Object [] {
				"SSS", "SSS", "SSS", 'S', SteelIngot		
				});
			
			GameRegistry.addRecipe(new ItemStack(TurbineBlade, 1), new Object [] {
				"SS ", "SS ", "  S", 'S', SteelIngot		
				});
			
			GameRegistry.addRecipe(new ItemStack(TurbineHub, 1), new Object [] {
				" S ", "SSS", " S ", 'S', SteelIngot		
				});
			
			GameRegistry.addRecipe(new ItemStack(TurbineHead, 1), new Object [] {
				"TTT", "THT", "TTT", 'T', TurbineBlade, 'H', TurbineHub		
				});
			
			GameRegistry.addRecipe(new ItemStack(SteelSupport, 2), new Object [] {
				"S S", "SSS", "S S", 'S', SteelIngot		
				});
			
			GameRegistry.addRecipe(new ItemStack(itemHydroelectricTurbine, 1), new Object [] {
				"WWW", "WTW", "WWW", 'T', TurbineHead, 'W', WaterProofing		
				});
			
			proxy.registerProxies();
	}
}
