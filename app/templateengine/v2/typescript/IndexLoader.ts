import Index from '../svelte/Index.svelte';

const svelteElement = document.querySelector('body');
if (svelteElement !== null) {
    new Index({
        target: svelteElement
    });
}