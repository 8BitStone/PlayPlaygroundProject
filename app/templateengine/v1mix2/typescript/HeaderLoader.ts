import Header from '../svelte/Header.svelte';

const svelteElement = document.querySelector('#header');
if (svelteElement !== null) {
    new Header({
        target: svelteElement
    });
}