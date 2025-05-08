<script lang="TS">
	const emotion1 = 25;
	const maxEmotion1 = 50;
	const emotion2 = 100;
	const maxEmotion2 = 100;
	const emotion3 = 50;
	const maxEmotion3 = 200;

	const health = 8;
	const maxHealth = 14;
</script>

<div class="bottom-bar">
	<div class="spell-bar-container">
		<h3>Emotion 1</h3>
		<div class="bar">
			<div class="bar-fill" style="width: {(emotion1 / maxEmotion1) * 100}%"></div>
		</div>
		<h3>Emotion 2</h3>
		<div class="bar">
			<div class="bar-fill" style="width: {(emotion2 / maxEmotion2) * 100}%"></div>
		</div>
		<h3>Emotion 3</h3>
		<div class="bar">
			<div class="bar-fill" style="width: {(emotion3 / maxEmotion3) * 100}%"></div>
		</div>
	</div>
	<div class="armour-class-container">
		<h2>Armour Class</h2>
		<h3>69</h3>
		<h3>322</h3>
		<h3>34</h3>
	</div>
	<div class="health-bar-container">
		<h2>Health</h2>
		<div class="bar">
			<div class="bar-fill" style="width: {(health / maxHealth) * 100}%"></div>
		</div>
	</div>
</div>

<style>
	.bottom-bar {
		display: flex;
		height: 20vh;
		width: 100%;
		background-color: #fc5130;
		bottom: 0;
		position: fixed;
		padding-bottom: 1%;
		justify-content: flex-start;
	}
	.spell-bar-container {
		display: flex;
		height: 100%;
		padding-left: 5%;
		padding-bottom: 1%;

		flex-direction: column;
		justify-content: space-evenly;
		align-items: flex-start;
	}
	.armour-class-container {
		display: flex;
		height: 100%;
		gap: 10px;
		padding-left: 1%;
		flex-wrap: wrap;
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
		height: 50px;
		width: 200px;
		background-color: antiquewhite;
	}
	.bar-fill {
		height: 100%;
		background-color: aquamarine;
	}
</style>
