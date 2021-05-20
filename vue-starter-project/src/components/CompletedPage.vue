<template>
<div>
    <HelloWorld
        :todos="todos"
        notStartedClasses="item"
        inProgressClasses="item"
        completeClasses="item active"
        @update="handleUpdate" 
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
    name: "CompletedPage",
    methods: {
        handleUpdate() {
            axios.get("/api/get-todo/complete")
                 .then(response => {
                     this.todos = response.data;
                     this.isLoaded = true;
                     this.isLoading = false;
                 })
        }
    },

    data() {
            return {
                todos: null,
                isLoaded: false,
                isLoading: true
            }
        },

    mounted() {
            axios.get("/api/get-todo/complete")
                 .then(response => {
                     this.todos = response.data;
                     this.isLoaded = true;
                     this.isLoading = false;
                 })
        }
    }
</script>
