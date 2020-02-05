package cn.mcmod.sakura.block.crop;

import cn.mcmod.sakura.item.ItemLoader;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockRapeseedCrop extends BlockCrops {

	@Override
	protected Item getCrop() {
		return ItemLoader.RAPESEED;
	}
	@Override
	protected Item getSeed() {
		return ItemLoader.RAPESEED;
	}
}
