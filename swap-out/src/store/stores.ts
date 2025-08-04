import { writable } from "svelte/store";
import { Player } from '$lib/classes.ts';

export const currentCharacter = writable(new Player());