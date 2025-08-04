<script lang="ts">
	import { currentCharacter } from "../../store/stores.js";
	let yourCharacter

	currentCharacter.subscribe( character =>{
		yourCharacter = character
	})

	console.log(yourCharacter)

</script>

<div class="flex-container">
	<a class="part" href="/CharacterSheet/CharacterCreator">Create a Character?</a>
	<a class="part" href="/ActualCharacterSheet">Have a Character?</a>
</div>

<style>
	.flex-container {
		display: flex;
		height: 100vh;
		width: 100%;
	}
	.part {
		background-color: #bfcde0;
		flex: 1;
		height: 100%;
		display: flex;
		justify-content: center;
		align-items: center;
		font-family: Verdana, Geneva, Tahoma, sans-serif;
	}
	.part:hover {
		background-color: #fefcfd;
	}
</style>