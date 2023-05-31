import Form from '../templateengine/v2/svelte/Form.svelte';
import {parseViewModelDataAsJson} from "./Utils";

const svelteElement = document.querySelector('body');
if (svelteElement !== null) {
    new Form({
        target: svelteElement,
        props: {
            viewModel : parseViewModelDataAsJson(svelteElement)
        }
    });
}