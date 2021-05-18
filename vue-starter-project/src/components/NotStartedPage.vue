<template>
<div>
    <HelloWorld
        @update="handleUpdate"
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
    name: "NotStartedPage",
    data() {
            return {
                todos: null,
            }
        },
    methods: {        
        
        handleUpdate() {
            console.log("Update recieved in page component")
            axios.get("/api/get-todo/not started")
                 .then(response => {
                     this.todos = response.data;
                 })
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
