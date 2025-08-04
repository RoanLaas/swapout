<script lang="ts">
	import { currentCharacter } from "../../store/stores.js";
	let yourCharacter

	currentCharacter.subscribe( character =>{
		yourCharacter = character
	})

	console.log(yourCharacter)

</script>
