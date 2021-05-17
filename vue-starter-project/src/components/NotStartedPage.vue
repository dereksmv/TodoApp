<template>
<div>
    <HelloWorld
        :todos="todos"
        notStartedClasses="item active"
        inProgressClasses="item"
        completeClasses="item"
    />
</div>
</template>

<script>
import HelloWorld from "./HelloWorld";

import axios from "axios";

export default {
    components: {HelloWorld},
    name: "InProgressPage",
    data() {
            return {
                todos: null,
            }
        },

    mounted() {
            axios.get("/api/get-todo/not started")
                 .then(response => {
                     this.todos = response.data;
                     console.log(this.todos)
                 })
        }
    }
</script>
