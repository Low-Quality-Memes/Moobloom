package me.onyx.moobloom;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class MoobloomEntityRenderer extends MobEntityRenderer<MoobloomEntity, MoobloomEntityModel> {

    public MoobloomEntityRenderer(EntityRenderDispatcher dispatcher) {
        super(dispatcher, new MoobloomEntityModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(MoobloomEntity entity) {
        return new Identifier("moobloom", "textures/entity/moobloom/moobloom.png");
    }
}