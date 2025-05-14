<script lang="ts">
	const emotion1Name = 'Brug';
	const emotion1 = 25;
	const maxEmotion1 = 50;
	const emotion1AC = 34;

	const emotion2Name = 'Rhymes with';
	const emotion2 = 100;
	const maxEmotion2 = 100;
	const emotion2AC = 50;

	const emotion3Name = 'Grug';
	const emotion3 = 50;
	const maxEmotion3 = 200;
	const emotion3AC = 30;

	const health = 8;
	const maxHealth = 14;
</script>

<div class="bottom-bar">
	<div class="emotion-info-container">
		<div class="half-bar-container">
			<div class="bar">
				<text>{emotion1Name} | Armour Class: {emotion1AC} : </text>
			</div>
			<div class="bar">
				<text>{emotion2Name} | Armour Class: {emotion2AC} : </text>
			</div>
			<div class="bar">
				<text>{emotion3Name} | Armour Class: {emotion3AC} : </text>
			</div>
		</div>

		<div class="half-bar-container">
			<div class="bar" style="background-color: antiquewhite">
				<div class="bar-fill" style="width: {(emotion1 / maxEmotion1) * 100}%"></div>
			</div>
			<div class="bar" style="background-color: antiquewhite">
				<div class="bar-fill" style="width: {(emotion2 / maxEmotion2) * 100}%"></div>
			</div>
			<div class="bar" style="background-color: antiquewhite">
				<div class="bar-fill" style="width: {(emotion3 / maxEmotion3) * 100}%"></div>
			</div>
		</div>
	</div>
</div>

<style>
	.bottom-bar {
		display: flex;
		height: 20vh;
		width: 100%;
		background-color: #30fc48;
		bottom: 0;
		position: fixed;
		padding-bottom: 0.5%;
		padding-left: 0.2%;
		justify-content: flex-start;
	}
	.emotion-info-container {
		display: flex;
		height: 100%;
		width: 40%;

		align-items: flex-start;
	}
	.half-bar-container {
		display: flex;
		height: 100%;
		width: 50%;

		justify-content: space-evenly;

		align-content: flex-start;
		flex-direction: column;
		align-items: flex-start;
	}
	.health-bar-container {
		display: flex;
		height: 100%;
		padding-left: 5%;
		flex-direction: column;
	}
	.bar {
		display: flex;
		height: 20%;
		width: 90%;
		align-items: flex-end;
	}
	.bar-fill {
		height: 100%;
		background-color: rgb(237, 133, 65);
	}
</style>
