package faceless.artent.core.block;

import faceless.artent.core.item.INamed;
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
