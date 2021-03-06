/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package net.divinerpg.vethea.gen.layer3;
import java.util.Random;

import net.divinerpg.helper.block.VetheaBlockHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class QuadroticPost extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}

	public QuadroticPost() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 0, j + 5, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 0, j + 5, k + 1, VetheaBlockHelper.firelight.blockID);
		world.setBlock(i + 0, j + 5, k + 2, VetheaBlockHelper.firelight.blockID);
		world.setBlock(i + 0, j + 5, k + 3, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 1, j + 5, k + 0, VetheaBlockHelper.firelight.blockID);
		world.setBlock(i + 1, j + 5, k + 1, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 1, j + 5, k + 2, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 1, j + 5, k + 3, VetheaBlockHelper.firelight.blockID);
		world.setBlock(i + 1, j + 6, k + 1, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 1, j + 6, k + 2, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 1, j + 7, k + 1, VetheaBlockHelper.quadroticAltar.blockID);
		world.setBlock(i + 1, j + 7, k + 2, VetheaBlockHelper.quadroticAltar.blockID);
		world.setBlock(i + 2, j + 5, k + 0, VetheaBlockHelper.firelight.blockID);
		world.setBlock(i + 2, j + 5, k + 1, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 2, j + 5, k + 2, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 2, j + 5, k + 3, VetheaBlockHelper.firelight.blockID);
		world.setBlock(i + 2, j + 6, k + 1, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 2, j + 6, k + 2, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 2, j + 7, k + 1, VetheaBlockHelper.quadroticAltar.blockID);
		world.setBlock(i + 2, j + 7, k + 2, VetheaBlockHelper.quadroticAltar.blockID);
		world.setBlock(i + 3, j + 5, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 3, j + 5, k + 1, VetheaBlockHelper.firelight.blockID);
		world.setBlock(i + 3, j + 5, k + 2, VetheaBlockHelper.firelight.blockID);
		world.setBlock(i + 3, j + 5, k + 3, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 3, j + 6, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 3, j + 6, k + 3, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 4, j + 4, k + 1, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 4, j + 4, k + 2, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 4, j + 5, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 4, j + 5, k + 1, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 4, j + 5, k + 2, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 4, j + 5, k + 3, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 5, j + 3, k + 1, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 5, j + 3, k + 2, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 5, j + 4, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 5, j + 4, k + 1, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 5, j + 4, k + 2, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 5, j + 4, k + 3, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 5, j + 5, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 5, j + 5, k + 3, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 6, j + 2, k + 1, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 6, j + 2, k + 2, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 6, j + 3, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 6, j + 3, k + 1, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 6, j + 3, k + 2, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 6, j + 3, k + 3, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 6, j + 4, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 6, j + 4, k + 3, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 7, j + 1, k + 1, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 7, j + 1, k + 2, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 7, j + 2, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 7, j + 2, k + 1, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 7, j + 2, k + 2, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 7, j + 2, k + 3, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 7, j + 3, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 7, j + 3, k + 3, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 8, j + 0, k + 1, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 8, j + 0, k + 2, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 8, j + 1, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 8, j + 1, k + 1, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 8, j + 1, k + 2, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 8, j + 1, k + 3, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 8, j + 2, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 8, j + 2, k + 3, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 9, j + 0, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 9, j + 0, k + 1, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 9, j + 0, k + 2, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 9, j + 0, k + 3, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 9, j + 1, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 9, j + 1, k + 3, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 10, j + 0, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 10, j + 0, k + 3, VetheaBlockHelper.dreambricks2.blockID);

		return true;
	}
}