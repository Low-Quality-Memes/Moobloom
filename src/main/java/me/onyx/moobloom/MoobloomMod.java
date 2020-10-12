package me.onyx.moobloom;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MoobloomMod implements ModInitializer {
    public static final EntityType<MoobloomEntity> MOOBLOOM = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("moobloom", "moobloom"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MoobloomEntity::new).dimensions(EntityDimensions.fixed(0.75F, 0.75F)).build()
    );

	@Override
	public void onInitialize() {
        FabricDefaultAttributeRegistry.register(MOOBLOOM, MoobloomEntity.createMobAttributes());
	}
}
