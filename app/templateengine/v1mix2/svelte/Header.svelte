<script lang="ts">
    import { onMount } from 'svelte';

    let viewModel;

    onMount(async () => {
        const res = await fetch(`/te12/api/header?page=` + window.location.pathname);
        viewModel = await res.json();
    });
</script>

{#if viewModel}
    {#each viewModel.navPoints as navItem}
        <a href="{navItem.path}">
            {#if navItem.isActive}
                <b>{navItem.name}</b>
            {:else}
                {navItem.name}
            {/if}
        </a>
        <br>
    {/each}
{/if}

<style lang="scss">

</style>