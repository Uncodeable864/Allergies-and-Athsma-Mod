package com.pielpell.allergiesathsma.init;

import com.pielpell.allergiesathsma.items.AllergyShot;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ItemInit {

    private static final Item ALLERGY_SHOT = new AllergyShot(new Item.Properties());

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(

                ALLERGY_SHOT.setRegistryName("allergy_shot")

        );
    }
}
