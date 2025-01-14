package com.nisovin.magicspells.castmodifiers.conditions;

import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;

import com.nisovin.magicspells.castmodifiers.Condition;

public class AlwaysCondition extends Condition {

	@Override
	public boolean initialize(String var) {
		return true;
	}

	@Override
	public boolean check(LivingEntity caster) {
		return true;
	}

	@Override
	public boolean check(LivingEntity caster, LivingEntity target) {
		return true;
	}

	@Override
	public boolean check(LivingEntity caster, Location location) {
		return true;
	}

}
