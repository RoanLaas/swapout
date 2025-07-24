<script lang="ts">
	import type { Player } from '$lib/types.ts';
	import { writable } from 'svelte/store';

	const currentChar = writable(0);

	let yourChar: Player = {
			maxHealth: 22,
			currentHealth: 22,

			emotion1Name: "Anger",
			maxEmotion1: 50,
			currentEmotion1: 50,
			emotion2Name: "Lust",
			maxEmotion2: 20,
			currentEmotion2: 20,
			emotion3Name: "Greed",
			maxEmotion3: 42,
			currentEmotion3: 42,

			strength: 2,
			dexterity: 3,
			constitution: 4,
			intelligence: 5,
			wisdom: 6,
			charisma: 7,

			acrobatics: 1,
			animalHandling: 2,
			arcana: 3,
			athletics: 4,
			deception: 5,
			history: 6,
			insight: 7,
			intimidation: 8,
			investigation: 9,
			medicine: 10,
			nature: 11,
			perception: 12,
			performance: 13,
			persuasion: 14,
			religion: 15,
			sleightOfHand: 16,
			stealth: 17,
			survival: 18,

			inventory: {}
	}

	console.log($currentChar)

	currentChar.set(yourChar)
	console.log($currentChar)

</script>