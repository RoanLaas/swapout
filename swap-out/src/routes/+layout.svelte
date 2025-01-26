<script lang="ts">
	let { children } = $props();
</script>

<nav>
	<a href="/">Home</a>
	<a href="/map">Map</a>
	<a href="/spells">Spells</a>
</nav>

{@render children()}
