package com.shotadft.more_fixes.mixin;

import net.minecraft.client.gui.screens.worldselection.CreateWorldScreen;
import net.minecraft.client.gui.screens.worldselection.WorldCreationUiState;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CreateWorldScreen.class)
public class CreateWorldScreenMixin {

    @Final
    @Shadow
    WorldCreationUiState uiState;

    @Inject(method = "init()V", at = @At("TAIL"))
    private void onInit(CallbackInfo ci) {
        this.uiState.setWorldType(this.uiState.getWorldType().preset() != null ? this.uiState.getWorldType() : this.uiState.getNormalPresetList().getFirst());
    }
}
