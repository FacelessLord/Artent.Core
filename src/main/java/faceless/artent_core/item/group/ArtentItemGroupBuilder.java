package faceless.artent_core.item.group;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ArtentItemGroupBuilder {
    public ItemGroup.Builder builder;
    public List<ItemStack> Items = new ArrayList<>();

    public ArtentItemGroupBuilder(Supplier<ItemStack> icon, String groupId) {
        builder = FabricItemGroup.builder().icon(icon).displayName(Text.translatable("itemGroup.artent." + groupId));
    }

    public void addItem(Item item) {
        Items.add(new ItemStack(item));
    }

    public ItemGroup build() {
        return builder.entries((ctx, entries) -> entries.addAll(Items)).build();
    }
}
