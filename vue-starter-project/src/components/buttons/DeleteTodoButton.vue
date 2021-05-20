<template>
    <div>
        <div>
            <button v-on:click="showModal" :id="indexNumber" class="ui icon red button">
                <i class="white trash icon"></i> Delete
            </button>
        </div>

    </div>
</template>

<script>
import axios from "axios";

export default {
    name: "DeleteTodoButton",

        props: {
        indexNumber: Number,

        },
    methods: {
        deleteTodo(id) {
            let self = this;
            axios.delete(`/api/delete/${id}`)
                 .then(() => {
                     self.$emit("update");
                     console.log(this);
                 })
            },
        showModal(event) {
            let id = event.target.id;
            window.$('.mini.modal.delete').modal({onApprove: () => {this.deleteTodo(id)}}).modal('show');
        }
    }


    

        
}
</script>