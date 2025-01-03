package faceless.artent.core.client.mixin;

import faceless.artent.core.client.hud.ArtentHudContext;
import faceless.artent.core.client.hud.ArtentHudRendererRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class InGameHudMixin {
    @Final
    @Shadow
    private Random random;
    @Final
    @Shadow
    private MinecraftClient client;

    @Inject(method = "render", at = @At("TAIL"))
    public void render(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        var hud = (InGameHud) (Object) this;
        if (this.client.options.hudHidden) return;

        var ctx = new ArtentHudContext(
                this.client,
                hud.getTextRenderer(),
                this.getCameraPlayer(),
                context.getScaledWindowWidth(),
                context.getScaledWindowHeight(),
                random
        );
        ArtentHudRendererRegistry.callRenderers(context, tickCounter.getTickDelta(true), ctx);
    }


    @Shadow
    private PlayerEntity getCameraPlayer() {
        return null;
    }
}
