function getASModifier(abilityScore: number) {
	return Math.floor((abilityScore - 10) / 2);
}

export { getASModifier };
