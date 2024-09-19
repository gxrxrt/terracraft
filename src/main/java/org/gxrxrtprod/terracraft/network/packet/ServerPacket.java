package org.gxrxrtprod.terracraft.network.packet;


import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.util.Identifier;


public class ServerPacket {
    public final Identifier ID;
    public final ClientPlayNetworking.PlayChannelHandler HANDLER;

    public ServerPacket(Identifier id, ClientPlayNetworking.PlayChannelHandler handler){
        ID = id;
        HANDLER = handler;
    }
}
