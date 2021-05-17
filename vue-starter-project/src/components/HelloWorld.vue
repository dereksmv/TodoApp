<template>
<div>
  <div class="hello">
    <div class="split-header">
      <div>
        <PageHeader text="Todo"/>
        <div>
          {{ info }}
        </div>
      </div>
      <div>
        <PrimaryButton text="Add New"/>
      </div>
    </div>
  </div>
  <div>
    <TabinatedMenu/>
  </div>
</div>
</template>

<script>
import PageHeader from "./PageHeader.vue";
import PrimaryButton from "./buttons/PrimaryButton.vue";
import TabinatedMenu from "./menus/TabinatedMenu.vue";

export default {
  name: 'HelloWorld',
  components: {PageHeader, PrimaryButton, TabinatedMenu},
  props: {
    msg: String
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


</style>
