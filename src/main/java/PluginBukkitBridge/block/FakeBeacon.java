package PluginBukkitBridge.block;

import java.util.Collection;
import java.util.Collections;

import org.bukkit.block.Beacon;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.BeaconInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import PluginBukkitBridge.MyPlugin;
import PluginBukkitBridge.inventory.FakeBeaconInventory;

public class FakeBeacon extends FakeContainerBlockState implements Beacon {
    public FakeBeacon(FakeBlock arg) {
        super(arg);
    }

    @Override
    public BeaconInventory getInventory() {
        return new FakeBeaconInventory(this, 64);
    }

    @Override
    public Collection<LivingEntity> getEntitiesInRange() {
        MyPlugin.fixme();
        return Collections.emptyList();
    }

    @Override
    public int getTier() {
        MyPlugin.fixme();
        return 0;
    }

    @Override
    public PotionEffect getPrimaryEffect() {
        MyPlugin.fixme();
        return null;
    }

    @Override
    public void setPrimaryEffect(PotionEffectType potionEffectType) {
        MyPlugin.fixme();
    }

    @Override
    public PotionEffect getSecondaryEffect() {
        MyPlugin.fixme();
        return null;
    }

    @Override
    public void setSecondaryEffect(PotionEffectType potionEffectType) {
        MyPlugin.fixme();
    }

    @Override
    public boolean isLocked() {
        MyPlugin.fixme();
        return false;
    }

    @Override
    public String getLock() {
        MyPlugin.fixme();
        return null;
    }

    @Override
    public void setLock(String s) {
        MyPlugin.fixme();
    }

    @Override
    public String getCustomName() {
        MyPlugin.fixme();
        return null;
    }

    @Override
    public void setCustomName(String arg0) {
        MyPlugin.fixme();
    }

    @Override
    public BeaconInventory getSnapshotInventory() {
        // TODO Auto-generated method stub
        return null;
    }
}
