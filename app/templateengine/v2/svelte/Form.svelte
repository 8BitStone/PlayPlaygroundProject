<script lang="ts">
    import AppLayout from "./AppLayout.svelte";

    export let viewModel;
    export let csrfToken;

    async function submit() {
        const body = viewModel.form.rawData;
        const res = await fetch(
            '/te2/api/form',
            {
                method: "POST",
                body: JSON.stringify(body),
                headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json',
                    'CSRF-TOKEN': csrfToken
                }
            });
        viewModel = await res.json();
    }
</script>

<AppLayout>
    {#if viewModel}
        {#if viewModel.form.errors.length > 0}
            something is not right <br>
        {/if}
        <input bind:value={viewModel.form.rawData.someString}>
        <button on:click={submit}>OK</button>
    {/if}
</AppLayout>

<style lang="scss">

</style>