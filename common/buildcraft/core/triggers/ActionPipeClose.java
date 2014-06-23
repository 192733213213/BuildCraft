/**
 * Copyright (c) 2011-2014, SpaceToad and the BuildCraft Team
 * http://www.mod-buildcraft.com
 *
 * BuildCraft is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://www.mod-buildcraft.com/MMPL-1.0.txt
 */
package buildcraft.core.triggers;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import buildcraft.api.gates.IAction;
import buildcraft.api.gates.IActionParameter;
import buildcraft.api.gates.IGate;
import buildcraft.core.utils.StringUtils;
import buildcraft.transport.Pipe;

public class ActionPipeClose extends BCAction {

	private IIcon icon;

	public ActionPipeClose() {
		super("buildcraft:pipe.close");
	}

	@Override
	public IIcon getIcon() {
		return icon;
	}

	@Override
	public String getDescription() {
		return StringUtils.localize("gate.action.pipe.close");
	}

	@Override
	public void registerIcons(IIconRegister iconRegister) {
		icon = iconRegister.registerIcon("buildcraft:triggers/action_pipe_close");
	}

	@Override
	public IAction rotateLeft() {
		return this;
	}

	@Override
	public void actionActivate(IGate gate, IActionParameter[] parameters) {
		((Pipe) gate.getPipe()).close();
	}
}