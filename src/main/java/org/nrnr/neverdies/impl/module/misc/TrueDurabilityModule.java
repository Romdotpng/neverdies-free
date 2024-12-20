package org.nrnr.neverdies.impl.module.misc;

import org.nrnr.neverdies.api.event.listener.EventListener;
import org.nrnr.neverdies.api.module.ModuleCategory;
import org.nrnr.neverdies.api.module.ToggleModule;
import org.nrnr.neverdies.impl.event.item.DurabilityEvent;

/**
 * @author chronos
 * @since 1.0
 */
public class TrueDurabilityModule extends ToggleModule {

    /**
     *
     */
    public TrueDurabilityModule() {
        super("TrueDurability", "Displays the true durability of unbreakable items",
                ModuleCategory.MISCELLANEOUS);
    }

    @EventListener
    public void onDurability(DurabilityEvent event) {
        // ??? Whats this
        int dura = event.getItemDamage();
        if (event.getDamage() < 0) {
            dura = event.getDamage();
        }
        event.cancel();
        event.setDamage(dura);
    }
}
