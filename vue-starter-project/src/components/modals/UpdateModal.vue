<template>

<div class="ui modal create">
  <i class="close icon"></i>
  <div class="header">
    Create To Do Item
  </div>
    <div class="ui form" id="todoForm">
        <div class="field">
            <label for="Title">Title: </label>
            <input type="text" id="updateTitle"/>
        </div>
        <div class="field">
            <label for="Description">Description: </label>
            <input type="text" id="updateDesc"/>
        </div>
    </div>
  <div class="actions">
    <button class="ui red deny button">
        {{ cancelText }}
    </button>
    <button class="ui positive right labeled icon button">
            {{ confirmText }}
      <i class="checkmark icon"></i>
        </button>
    </div>
</div>


</template>

<script>


export default {
    name: "Update",
    props: {
        cancelText: String,
        confirmText: String,
        apiRoute: String
    }
}
</script>

<style scoped>
    #todoForm {
        width: 80%;
        margin: 25px;
    }
</style>
