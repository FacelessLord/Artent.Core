package faceless.artent_core.item;

import net.minecraft.item.Item;

public class ArtentItem extends Item implements INamed {
    public final String Id;

    public ArtentItem(String itemId) {
        super(new Item.Settings());
        Id = itemId;
    }

    public ArtentItem(Settings settings, String itemId) {
        super(settings);
        Id = itemId;
    }

    @Override
    public String getId() {
        return Id;
    }
}
