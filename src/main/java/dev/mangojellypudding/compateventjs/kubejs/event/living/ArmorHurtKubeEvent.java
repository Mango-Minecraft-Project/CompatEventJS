package dev.mangojellypudding.compateventjs.kubejs.event.living;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.event.entity.living.ArmorHurtEvent;

import java.util.Map;

public class ArmorHurtKubeEvent extends KubeLivingEntityEvent<ArmorHurtEvent> {
    public ArmorHurtKubeEvent(ArmorHurtEvent event) {
        super(event);
    }

    public ItemStack getItem(EquipmentSlot slot) {
        return event.getArmorItemStack(slot);
    }

    public Map<EquipmentSlot, ArmorHurtEvent.ArmorEntry> getArmorMap() {
        return event.getArmorMap();
    }

    public float getNewDamage(EquipmentSlot slot) {
        return event.getNewDamage(slot);
    }

    public void setNewDamage(EquipmentSlot slot, float newDamage) {
        event.setNewDamage(slot, newDamage);
    }

    public float getOriginalDamage(EquipmentSlot slot) {
        return event.getOriginalDamage(slot);
    }
}
