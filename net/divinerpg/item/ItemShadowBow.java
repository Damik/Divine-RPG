package net.divinerpg.item;

import java.util.List;
import java.util.Random;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemShadowBow extends ItemBow
{
    private int lastDamage = -1;

    public ItemShadowBow(int var1)
    {
        super(var1);
        this.setMaxDamage(10000);
    }

    /**
     * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
     */
    @Override
    public void onPlayerStoppedUsing(ItemStack var1, World var2, EntityPlayer var3, int var4)
    {
        this.lastDamage = -1;
        boolean var5 = var3.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, var1) > 0;

        if (var5 || var3.inventory.hasItem(Item.arrow.itemID))
        {
            int var6 = this.getMaxItemUseDuration(var1) - var4;
            var6 = (int)(var6 / 0.5F);
            float var7 = var6 / 20.0F;
            var7 = (var7 * var7 + var7 * 2.0F) / 3.0F;

            if (var7 < 0.1D * 0.5F)
                return;

            boolean var8 = false;

            if (var7 > 1.0F)
            {
                if (var7 > 9.0F)
                {
                    var8 = true;
                }

                var7 = 1.0F;
            }

            EntityArrow var9 = new EntityArrow(var2, var3, var7 * 2.0F);

            if (var7 >= 1.0F)
            {
                var9.field_70135_K = true;
            }

            int var10 = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, var1);

            if (var10 > 0)
            {
                var9.setDamage(var9.getDamage() + var10 * 0.5D + 0.5D);
            }

            int var11 = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, var1);

            if (var11 > 0)
            {
                var9.setKnockbackStrength(var11);
            }

            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, var1) > 0)
            {
                var9.setFire(100);
            }

            var1.damageItem(1, var3);
            var2.playSoundAtEntity(var3, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + var7 * 0.5F);

            if (!var5)
            {
                var3.inventory.consumeInventoryItem(Item.arrow.itemID);
            }
            else
            {
                var9.field_70135_K = false;
            }

            if (!var2.isRemote)
            {
                var2.spawnEntityInWorld(var9);
            }
        }
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    @Override
    public EnumAction getItemUseAction(ItemStack var1)
    {
        return EnumAction.bow;
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void onUsingItemTick(ItemStack var1, EntityPlayer var2, int var3)
    {
        super.onUsingItemTick(var1, var2, var3);
        int var4 = var1.getMaxItemUseDuration() - var2.getItemInUseCount();

        if (var4 > 100 && (new Random()).nextInt(100) == 0)
        {
            var1.damageItem(var4 / 100, var2);
        }

        if (var1.getItemDamage() < this.lastDamage)
        {
            this.onPlayerStoppedUsing(var1, ModLoader.getMinecraftInstance().theWorld, var2, var2.getItemInUseCount());
            var2.setItemInUse((ItemStack)null, 0);
            var2.inventory.setInventorySlotContents(var2.inventory.currentItem, (ItemStack)null);
        }
        else
        {
            this.lastDamage = var1.getItemDamage();
        }
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("2 Ranged Damage");
        par3List.add("2 Times Faster");
        par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
    }
    private Icon[] Texture = new Icon[4];
    @Override
    public void registerIcons(IconRegister iconRegister)

    {

        itemIcon = iconRegister.registerIcon("DivineRPG:" + this.getUnlocalizedName().substring(5) + "_0");
        for (int N = 0; N < 4; N++)
        {
            this.Texture[N] = iconRegister.registerIcon("DivineRPG:" + this.getUnlocalizedName().substring(5) + "_" + N);

        }
    }
    @Override
    public Icon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
    {
        if(player.getItemInUse() == null) return this.itemIcon;
        int Pulling = stack.getMaxItemUseDuration() - useRemaining;
        if (Pulling >= 18)
            return Texture[3];
        else if (Pulling > 13)
            return Texture[2];
        else if (Pulling > 0)
            return Texture[1];	   
        return Texture[0];
    }
}

