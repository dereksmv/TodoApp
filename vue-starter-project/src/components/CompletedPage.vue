<template>
<div>
    <HelloWorld
        :todos="todos"
        notStartedClasses="item"
        inProgressClasses="item"
        completeClasses="item active"
    />
</div>
</template>

<script>
import HelloWorld from "./HelloWorld";

import axios from "axios";

export default {
    components: {HelloWorld},
    name: "CompletedPage",
    data() {
            return {
                todos: null,
            }
        },

    mounted() {
            axios.get("/api/get-todo/completed")
                 .then(response => {
                     this.todos = response.data;
                     console.log(this.todos)
                 })
        }
    }
</script>
