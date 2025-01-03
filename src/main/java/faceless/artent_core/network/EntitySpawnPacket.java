package faceless.artent_core.network;//package faceless.artent.api.network;
//
//import io.netty.buffer.Unpooled;
//import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
//import net.minecraft.entity.Entity;
//import net.minecraft.network.PacketByteBuf;
//import net.minecraft.network.packet.Packet;
//import net.minecraft.registry.Registries;
//import net.minecraft.util.Identifier;
//
//public class EntitySpawnPacket {
//    public static Packet<?> create(Entity e, Identifier packetID) {
//        if (e.getWorld().isClient)
//            throw new IllegalStateException("SpawnPacketUtil.create called on the logical client!");
//        PacketByteBuf byteBuf = new PacketByteBuf(Unpooled.buffer());
//        byteBuf.writeVarInt(Registries.ENTITY_TYPE.getRawId(e.getType()));
//        byteBuf.writeUuid(e.getUuid());
//        byteBuf.writeVarInt(e.getId());
//
//        PacketBufUtil.writeVec3d(byteBuf, e.getPos());
//        PacketBufUtil.writeAngle(byteBuf, e.getPitch());
//        PacketBufUtil.writeAngle(byteBuf, e.getYaw());
//
//        return ServerPlayNetworking.createS2CPacket(packetID, byteBuf);
//    }
//}