<template>
<div>
    <HelloWorld
        @update="handleUpdate"
        :todos="todos"
        notStartedClasses="item"
        inProgressClasses="item active"
        completeClasses="item"
        :isLoaded= isLoaded
        :isLoading= isLoading
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
                isLoaded: false,
                isLoading: true
            }
        },
    methods: {
        handleUpdate() {
            axios.get("/api/get-todo/in progress")
                 .then(response => {
                     this.todos = response.data;
                     this.isLoaded = true;
                     this.isLoading = false;
                 })
        }
    },

    mounted() {
            axios.get("/api/get-todo/in progress")
                 .then(response => {
                     this.todos = response.data;
                     this.isLoaded = true;
                     this.isLoading = false;
                 })
        }
    }
</script>
