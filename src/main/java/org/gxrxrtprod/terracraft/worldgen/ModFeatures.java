package org.gxrxrtprod.terracraft.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.gxrxrtprod.terracraft.Terracraft;

import java.util.function.Predicate;

public class ModFeatures {



    private static RegistryKey<PlacedFeature> registerOreFeature(String id, RegistryKey<Registry<PlacedFeature>> registryKey, Predicate<BiomeSelectionContext> biomeSelectionContext, GenerationStep.Feature feature){
        RegistryKey<PlacedFeature> result = RegistryKey.of(registryKey, new Identifier(Terracraft.MOD_ID, id));
        BiomeModifications.addFeature(biomeSelectionContext, feature, result);

        return result;
    }

    public static void register(){
        Terracraft.LOGGER.debug("Registring features for: " + Terracraft.MOD_ID);
    }
}
