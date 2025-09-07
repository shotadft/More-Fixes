package com.shotadft.more_fixes.fabric;

import com.shotadft.more_fixes.MoreFixes;
import net.fabricmc.api.ModInitializer;

public final class MoreFixesFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MoreFixes.init();
    }
}
