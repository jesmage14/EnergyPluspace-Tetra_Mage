package tetramage.nuclearmayhem.creativetab;

import tetramage.nuclearmayhem.common.NuclearMayhem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class NuclearMayhemTab extends CreativeTabs {

	public NuclearMayhemTab(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	public Item getTabIconItem() {
		return NuclearMayhem.NuclearMayhemTabPlaceHolder;
	}

}
