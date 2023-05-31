<script lang="ts">
    import AppLayout from "./AppLayout.svelte";
    import {onMount} from "svelte";

    let viewModel;

    onMount(async () => {
        const res = await fetch(`/te2/api/list`);
        viewModel = await res.json();
    });
</script>

<AppLayout>
    {#if viewModel}
        {#each viewModel.articleItems as articleItem}
            {articleItem.name} ({articleItem.uuid}) <br />
        {/each}
    {/if}

    <form>
        <input name="maxRows" type="number">
        <button type="submit">Anzeigen</button>
    </form>
</AppLayout>

<style lang="scss">

</style>