package org.gxrxrtprod.terracraft.network;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import org.gxrxrtprod.terracraft.Terracraft;
import org.gxrxrtprod.terracraft.network.packet.ClientPacket;
import org.gxrxrtprod.terracraft.network.packet.ServerPacket;

public class ModNetwork {

    private static ClientPacket registerPacket(Identifier id, ServerPlayNetworking.PlayChannelHandler handler){
        ClientPacket packet = new ClientPacket(id, handler);
        ServerPlayNetworking.registerGlobalReceiver(packet.ID, handler);

        return packet;
    }

    private static ServerPacket registerPacket(Identifier id, ClientPlayNetworking.PlayChannelHandler handler){
        ServerPacket packet = new ServerPacket(id, handler);
        ClientPlayNetworking.registerGlobalReceiver(packet.ID, handler);

        return packet;
    }

    public static void send (ClientPacket packet){
        ClientPlayNetworking.send(packet.ID, PacketByteBufs.create());
    }

    public static void send (ServerPacket packet, ServerPlayerEntity receiver){
        ServerPlayNetworking.send(receiver, packet.ID, PacketByteBufs.create());
    }
    public static void register(){
        Terracraft.LOGGER.info("Registering network for: " + Terracraft.MOD_ID);

    }
}
