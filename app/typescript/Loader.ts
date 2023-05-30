import App from '../templateengine/v2/svelte/App.svelte';

const svelteElement = document.querySelector('#svelte-anchor');
if (svelteElement !== null) {
    new App({
        target: svelteElement
    });
}