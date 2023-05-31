import Index from '../templateengine/v2/svelte/Index.svelte';

const svelteElement = document.querySelector('body');
if (svelteElement !== null) {
    new Index({
        target: svelteElement
    });
}