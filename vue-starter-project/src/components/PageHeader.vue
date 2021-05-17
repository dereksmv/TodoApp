<template>
  <div class="header">
    <div>
        <h1 class="ui header">
            {{ text }}
        </h1>
    </div>
  </div>
</template>

<script>

export default {
  name: 'Header',
  props: {
    text: String
  }
}

</script>

<style>
    
</style>