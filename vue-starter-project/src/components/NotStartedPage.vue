<template>
<div>

        <HelloWorld
            @update="handleUpdate"
            :todos="todos"
            notStartedClasses="item active"
            inProgressClasses="item"
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
    name: "NotStartedPage",
    data() {
            return {
                todos: null,
                isLoading: true,
                isLoaded: false
            }
        },
    methods: {        
        
        handleUpdate() {
                axios.get("/api/get-todo/not started")
                    .then(response => {
                        this.todos = response.data;
                        this.isLoading = false,
                        this.isLoaded = true
                    })
                }
            },

        mounted() {
                axios.get("/api/get-todo/not started")
                    .then(response => {
                        this.todos = response.data;
                        this.isLoading = false,
                        this.isLoaded = true
                    })
                }
        }
</script>
