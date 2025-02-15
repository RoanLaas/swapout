<!---
@component

{#if browser}
    <ThreeDViewer>
{/if}
-->

<script lang="ts">
	import { browser } from '$app/environment';
    import * as THREE from 'three';


     if (browser){

        console.log(window.innerWidth)
        const scene = new THREE.Scene()
        const camera = new THREE.PerspectiveCamera(75, window.innerWidth / window.innerHeight, 0.1, 1000);

        const renderer = new THREE.WebGLRenderer();
        renderer.setSize(window.innerWidth, window.innerHeight);
        renderer.setAnimationLoop(animate);
        document.body.appendChild(renderer.domElement);

        const geometry = new THREE.BoxGeometry(1, 1, 1);
        const material = new THREE.MeshBasicMaterial({ color: 0x20ff45});
        const coob = new THREE.Mesh(geometry, material);
        scene.add(coob);

        camera.position.z = 5;

        function animate(){
            coob.rotation.x += 0.01;
            coob.rotation.y += 0.01;

            renderer.render(scene, camera);
        }
     }

</script>
