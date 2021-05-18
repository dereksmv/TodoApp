<template>
<div>
  <div class="button-primary">
    <button v-on:click="showModal" class="ui primary button">{{ text }}</button>
  </div>
  <CreateToDoModal
    confirmText = "Save"
    cancelText = "Cancel"
  />
</div>

</template>

<script>
import CreateToDoModal from "../modals/CreateToDoModal.vue";
const $ = require('jquery');
import "../../../semantic/dist/semantic.js"
import axios from "axios";


export default {
 components: {CreateToDoModal},
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
           $('.ui.modal').modal({ 
             onApprove:  () => {
              let title = document.getElementById("title").value;
              let desc = document.getElementById("desc").value;
              let data = {
                  title: title,
                  desc: desc
              }
              axios.post("/api/create-todo", data)
                  .then(() => {
                    return
                  }, this.emitUpdate())
        }
            })
  .modal('show');
  }
}
}
</script>

<style>

</style>
