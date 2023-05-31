<script lang="ts">
    import Header from "./Header.svelte";
    import Footer from "./Footer.svelte";
</script>

<header>
    <Header/>
</header>

<main>
    <slot/>
</main>

<footer>
    <Footer/>
</footer>

<style lang="scss">
  header{
    background-color: #888;
  }

  main{
    margin: 10px 0;
  }

  footer{
    background-color: #888;
  }
</style>