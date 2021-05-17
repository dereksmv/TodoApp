<template>
  <div class="container">
    <router-view></router-view>
  </div>
</template>

<script>


export default {
  name: 'App',
  components: {

  }
}
</script>

<style>
  @import "../semantic/dist/semantic.rtl.css";
  #app {
    background-color: #f5f5f5;
    color: black;
    height: 100vh;
  }
</style>


