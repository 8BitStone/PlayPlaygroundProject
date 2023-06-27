import ArticleList from '../svelte/ArticleList.svelte';
import {parseViewModelDataAsJson} from "./Utils";

const svelteElement = document.querySelector('body');
if (svelteElement !== null) {
    new ArticleList({
        target: svelteElement,
        props: {
            viewModel : parseViewModelDataAsJson(svelteElement)
        }
    });
}