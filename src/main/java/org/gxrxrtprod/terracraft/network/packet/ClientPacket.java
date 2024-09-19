package org.gxrxrtprod.terracraft.network.packet;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;


public class ClientPacket {
    public final Identifier ID;
    public final ServerPlayNetworking.PlayChannelHandler HANDLER;

    public ClientPacket(Identifier id, ServerPlayNetworking.PlayChannelHandler handler){
        ID = id;
        HANDLER = handler;
    }
}
