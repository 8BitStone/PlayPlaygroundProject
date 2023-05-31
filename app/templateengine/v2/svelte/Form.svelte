<script lang="ts">
    import AppLayout from "./AppLayout.svelte";

    export let viewModel;

    async function submit() {
        const res = await fetch('/te2/api/form', {method: "POST", body: viewModel.form});
        viewModel = await res.json();
    }
</script>

<AppLayout>
    {#if viewModel}
        <input bind:value={viewModel.form.someString}>
        <button on:click={submit}>OK</button>
    {/if}
</AppLayout>

<style lang="scss">

</style>