<script lang="ts">
    import { onMount } from 'svelte';

    let viewModel;

    onMount(async () => {
        const res = await fetch(`/te2/api/footer`);
        viewModel = await res.json();
    });
</script>

<div><b>- Footer -</b></div>
{#if viewModel}
    <div>Best Customer: {viewModel.primeAddressName}</div>
{/if}

<style lang="scss">

</style>