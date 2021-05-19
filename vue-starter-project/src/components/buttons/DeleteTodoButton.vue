<template>
    <div>
        <div>
            <i v-on:click="showModal" :id="this.indexNumber" class="red trash icon"></i>
        </div>
    </div>
</template>

<script>
import axios from "axios";
/*const $ = require('jquery');
import "../../../semantic/dist/semantic.js";*/

export default {
    name: "DeleteTodoButton",
        props: {
        indexNumber: Number,

        },
    methods: {
        showModal(event) {
            let id = event.target.id;
            axios.delete(`/api/delete/${id}`)
                 .then(() => {
                     this.$emit("update");
                 })

        }
    }


    

        
}
</script>