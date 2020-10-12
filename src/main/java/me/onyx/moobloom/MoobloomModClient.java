package me.onyx.moobloom;

import me.onyx.moobloom.MoobloomEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class MoobloomModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        System.out.println("we're gaming");
        EntityRendererRegistry.INSTANCE.register(MoobloomMod.MOOBLOOM, (dispatcher, context) -> {
            return new MoobloomEntityRenderer(dispatcher);
        });
        System.out.println("we're gaming 2 electric boogaloo");
    }
}
