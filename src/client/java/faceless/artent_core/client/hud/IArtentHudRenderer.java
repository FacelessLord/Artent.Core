package faceless.artent_core.client.hud;

import net.minecraft.client.gui.DrawContext;

public interface IArtentHudRenderer {
    void render(DrawContext context, float tickDelta, ArtentHudContext ctx);
}
