package io.github.homchom.recode.mod.mixin.render;

import io.github.homchom.recode.Recode;
import net.minecraft.client.resources.model.*;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.util.profiling.ProfilerFiller;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@SuppressWarnings("ALL")
@Mixin(ModelManager.class)
public class MModelManager {
    @Inject(method = "prepare", at = @At("RETURN"))
    private void prepare(ResourceManager resourceManager, ProfilerFiller profiler, CallbackInfoReturnable<ModelBakery> cir) {
        Recode.modelLoader = cir.getReturnValue();
    }
}