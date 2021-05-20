<template>
<div>
  <div class="main-nav">
    <div class="hello">
      <div class="split-header">
        <div>
          <PageHeader text="Todo"
          />
          <div>
            {{ info }}
          </div>
        </div>
        <div>
          <PrimaryButton 
          v-on:update="handleUpdate"
          text="Add New"/>
        </div>
      </div>
    </div>
    <div>
      <TabinatedMenu
      :completeClasses="completeClasses"
      :inProgressClasses="inProgressClasses"
      :notStartedClasses="notStartedClasses"
      />
    </div>
    
  </div>
  <div>

    <CardContainers
    :todos="todos"
    @update="this.$emit('update')"
    />
  </div>
</div>
</template>

<script>
import PageHeader from "./PageHeader.vue";
import PrimaryButton from "./buttons/PrimaryButton.vue";
import TabinatedMenu from "./menus/TabinatedMenu.vue";
import CardContainers from "./CardContainers.vue";


export default {
  name: 'HelloWorld',
  components: {PageHeader, PrimaryButton, TabinatedMenu, CardContainers},
  props: {
    todos: Array,
    notStartedClasses: String,
    inProgressClasses: String,
    completeClasses: String
  },
  methods: {
    handleUpdate() {
      console.log("Update revieved from HelloWorld");
      this.$emit("update")
    }
  },
  data() {
    return {
      info: "A simple to-do application built with Spring-boot, MySQL, and Vue.js \n by Derek Smith and Jeremy Pavlich"
    }
  }
}
</script>

<style>
.hello {
  padding: 25px;
  width: 100%;
}

.split-header {
  display: grid;
  grid-template-columns: auto auto;
}

.main-nav {
  background-color: white;
}


</style>
