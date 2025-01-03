package faceless.artent_core.block;

import faceless.artent_core.item.INamed;
import net.minecraft.block.Block;

public class ArtentBlock extends Block implements INamed {
    public final String Id;

    public ArtentBlock(String blockId, Settings settings) {
        super(settings);
        Id = blockId;
    }

    @Override
    public String getId() {
        return Id;
    }
}
