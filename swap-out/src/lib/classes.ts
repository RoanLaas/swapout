export class Player {
	maxHealth: number = 0;
	currentHealth: number = 0;

	emotion1Name: string = "null";
	maxEmotion1: number = 0;
	currentEmotion1: number = 0;
	emotion2Name: string = "null";
	maxEmotion2: number = 0;
	currentEmotion2: number = 0;
	emotion3Name: string = "null";
	maxEmotion3: number = 0;
	currentEmotion3: number = 0; 

	strength: number = 0;
	dexterity: number = 0;
	constitution: number = 0;
	intelligence: number = 0;
	wisdom: number = 0;
	charisma: number = 0;

	acrobatics: number = 0;
	animalHandling: number = 0;
	arcana: number = 0;
	athletics: number = 0;
	deception: number = 0;
	history: number = 0;
	insight: number = 0;
	intimidation: number = 0;
	investigation: number = 0;
	medicine: number = 0;
	nature: number = 0;
	perception: number = 0;
	performance: number = 0;
	persuasion: number = 0;
	religion: number = 0;
	sleightOfHand: number = 0;
	stealth: number = 0;
	survival: number =0;

	inventory: {} = {};
};

export type Class = {
	className: string;

	primaryStat1: string;
	primaryStat2: string;

	secondaryStat1: string;
	secondaryStat2: string;
};
