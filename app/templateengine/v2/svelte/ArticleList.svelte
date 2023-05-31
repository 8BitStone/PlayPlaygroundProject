<script lang="ts">
    import AppLayout from "./AppLayout.svelte";

    export let viewModel;

    async function fetchData(){
        const res = await fetch(`/te2/api/list?maxRows=` + viewModel.maxRows);
        viewModel = await res.json();
    }
</script>

<AppLayout>
    {#if viewModel}
        {#each viewModel.articleItems as articleItem}
            {articleItem.name} ({articleItem.uuid}) <br />
        {/each}
    {/if}

    <input bind:value={viewModel.maxRows} type="number">
    <button on:click={fetchData}>Anzeigen</button>
</AppLayout>

<style lang="scss">

</style>