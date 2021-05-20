<template>

<div class="ui mini modal delete">
  <i class="close icon"></i>
  <div class="header">
    {{ title }}
  </div>
  <div class="description">
   {{ descriptor }}
  </div>
  <div class="actions">
    <button class="ui red deny button">
        {{ cancelText }}
    </button>
  <button class="ui approve green button">
            {{ confirmText }}
        </button>
    </div>
</div>
</template>

<script>


export default {
    name: "ConfirmDeleteModal",
    props: {
        cancelText: String,
        confirmText: String,
        title: String,
        descriptor: String
    }
}
</script>

<style scoped>
    #todoForm {
        width: 80%;
        margin: 25px;
    }

    .description {
        padding: 20px;
    }
</style>
