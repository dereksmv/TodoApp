<template>
  <div class="hello">
    {{ info }}
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: 'Test',
  data() {
    return {
      info: null
    }
  },
  mounted() {
    axios.get("/api/get-todo")
         .then(response => {
           this.info = response.data;
         })
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
