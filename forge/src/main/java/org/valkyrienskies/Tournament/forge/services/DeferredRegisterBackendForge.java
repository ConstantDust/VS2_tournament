package org.valkyrienskies.Tournament.forge.services;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import org.jetbrains.annotations.NotNull;
import org.valkyrienskies.Tournament.forge.DeferredRegisterImpl;
import org.valkyrienskies.tournament.registry.DeferredRegister;
import org.valkyrienskies.tournament.services.DeferredRegisterBackend;

public class DeferredRegisterBackendForge implements DeferredRegisterBackend {

    @NotNull
    @Override
    public <T> DeferredRegister<T> makeDeferredRegister(@NotNull String id, @NotNull ResourceKey<Registry<T>> registry) {
        return new DeferredRegisterImpl(id, registry);
    }
}
