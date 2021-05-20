<template>
  <div class="container">
    <router-view></router-view>
        <ConfirmDeleteModal 
        confirmText="Delete"
        cancelText="Cancel"
        title="Are You Sure?"
        descriptor="Please confirm that you want to delete this modal"
        />
       <CreateToDoModal
        confirmText="Save"
        cancelText="Cancel"
        />
  </div>
  
</template>

<script>
import ConfirmDeleteModal from './components/modals/ConfirmDeleteModal';
import CreateToDoModal from './components/modals/CreateToDoModal'

export default {
  name: 'App',
  components: {
    ConfirmDeleteModal,
    CreateToDoModal
  }
}
</script>

<style>
  @import "../semantic/dist/semantic.rtl.css";

  
  #app {
    background-color: #f5f5f5;
    color: black;
    height: 100%;
  }
</style>


