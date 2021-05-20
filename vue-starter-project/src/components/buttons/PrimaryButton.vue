<template>
<div>
  <div class="button-primary">
    <button v-on:click="showModal" class="ui primary button">{{ text }}</button>
  </div>

</div>

</template>

<script>

import axios from "axios";


export default {
  name: 'PrimaryButton',
  data() {
    return {
      dataLength: 0
    }
  },
  props: {
    text: String
  },
  emits: {
    update: () => {
      return true
    }
  },
  methods: {
      emitUpdate() {

          this.$emit("update")
        
      },
      showModal() {
        try {
           window.$('.ui.modal.create').modal({ 
             onApprove:  () => {
              let title = document.getElementById("title").value;
              let desc = document.getElementById("desc").value;
              let data = {
                  title: title,
                  desc: desc
              }
              axios.post("/api/create-todo", data)
                  .then(() => {
                    this.emitUpdate()
                  })
        }
            })
  .modal('show');
  } catch (error) {
        alert(error);
      }
}
}
}
</script>

<style>

</style>
