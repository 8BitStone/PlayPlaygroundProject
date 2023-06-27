<script lang="ts">
    import AppLayout from "./AppLayout.svelte";
    import type {ArticleListViewModel} from "../viewmodels/ArticleListViewModel";

    export let viewModel: ArticleListViewModel;

    async function fetchData(){
        const res = await fetch(`/te2/api/list?maxRows=` + viewModel.max_rows);
        viewModel = await res.json();
    }
</script>

<AppLayout>
    {#if viewModel}
        {#each viewModel.article_items as articleItem}
            {articleItem.name} ({articleItem.uuid}) <br />
        {/each}
    {/if}

    <input bind:value={viewModel.max_rows} type="number">
    <button on:click={fetchData}>Anzeigen</button>
</AppLayout>

<style lang="scss">

</style>