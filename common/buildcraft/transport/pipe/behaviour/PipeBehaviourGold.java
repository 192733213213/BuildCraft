package buildcraft.transport.pipe.behaviour;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;

import buildcraft.transport.api_move.IFlowItems;
import buildcraft.transport.api_move.IPipe;
import buildcraft.transport.api_move.PipeBehaviour;
import buildcraft.transport.api_move.PipeFlow;

public class PipeBehaviourGold extends PipeBehaviour {
    public PipeBehaviourGold(IPipe pipe) {
        super(pipe);
    }

    public PipeBehaviourGold(IPipe pipe, NBTTagCompound nbt) {
        super(pipe, nbt);
    }

    @Override
    public int getTextureIndex(EnumFacing face) {
        return 0;
    }

    @Override
    public void configureFlow(PipeFlow flow) {
        if (flow instanceof IFlowItems) {
            IFlowItems itemFlow = (IFlowItems) flow;
            itemFlow.setTargetSpeed(0.2);
            itemFlow.setSpeedDelta(0.07);
        }
    }

    @Override
    public boolean canConnect(EnumFacing face, PipeBehaviour other) {
        return true;
    }

    @Override
    public boolean canConnect(EnumFacing face, TileEntity oTile) {
        return true;
    }
}
