export type Player = {
	maxHealth: number;
	currentHealth: number;

	emotion1Name: string;
	maxEmotion1: number;
	currentEmotion1: number;
	emotion2Name: string;
	maxEmotion2: number;
	currentEmotion2: number;
	emotion3Name: string;
	maxEmotion3: number;
	currentEmotion3: number;

	strength: number;
	dexterity: number;
	constitution: number;
	intelligence: number;
	wisdom: number;
	charisma: number;

	acrobatics: number;
	animalHandling: number;
	arcana: number;
	athletics: number;
	deception: number;
	history: number;
	insight: number;
	intimidation: number;
	investigation: number;
	medicine: number;
	nature: number;
	perception: number;
	performance: number;
	persuasion: number;
	religion: number;
	sleightOfHand: number;
	stealth: number;
	survival: number;

	inventory: {};
};

export type Class = {
	className: string;

	primaryStat1: string;
	primaryStat2: string;

	secondaryStat1: string;
	secondaryStat2: string;
}
