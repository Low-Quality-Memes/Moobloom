package me.onyx.moobloom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class MoobloomEntity extends PathAwareEntity {
    public MoobloomEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }
}