<script lang="ts">
	import { currentCharacter } from "../../store/stores.js";

	let yourChar;
	currentCharacter.subscribe( value => {
		yourChar = value;
	})

	console.log(yourChar)
</script>
