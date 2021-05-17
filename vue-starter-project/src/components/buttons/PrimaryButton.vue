<template>
  <div class="button-primary">
    <button class="ui primary button">{{ text }}</button>
    <div class="ui modal">
        <div class="header">Header</div>
        <div class="scrolling content">
        <p>Very long content goes here</p>
        </div>
    </div>
  </div>

</template>

<script>
import { $ } from "jquery";

export default {
 
  name: 'PrimaryButton',

  props: {
    text: String
  },
  methods: {
      showModal: () => {
          $('.ui.longer.modal')
            .modal('show')
;
      }
  }

}
</script>

<style>

</style>
