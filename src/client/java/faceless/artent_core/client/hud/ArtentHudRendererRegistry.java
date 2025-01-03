package faceless.artent_core.client.hud;

import net.minecraft.client.gui.DrawContext;

import java.util.ArrayList;
import java.util.List;

public class ArtentHudRendererRegistry {
    private static List<IArtentHudRenderer> renderers = new ArrayList<>();

    public static void registerRenderer(IArtentHudRenderer hudRenderer) {
        renderers.add(hudRenderer);
    }

    public static void callRenderers(DrawContext context, float tickDelta, ArtentHudContext ctx) {
        for (IArtentHudRenderer hudRenderer : renderers) {
            hudRenderer.render(context, tickDelta, ctx);
        }
    }
}
