<template>
    <div>
        <div>
            <button v-on:click="showModal" :id="indexNumber" class="ui icon button">
                <i class="white edit icon"></i> Edit
            </button>
        </div>

    </div>
</template>

<script>
import axios from "axios";

export default {
    name: "EditButton",

        props: {
        indexNumber: Number,

        },
    methods: {
        updateCreator() {
            let title = document.getElementById("updateTitle");
            let desc = document.getElementById('updateDesc');
            let status = document.getElementById('updateStatus');
            let myObj = {};
            myObj.title = title;
            myObj.desc = desc;
            myObj.status = status;
            return myObj;
        },
        updateTodo(id) {
            
            let updateTarget = this.updateCreator();
            let data = {
                title: updateTarget.title,
                desc: updateTarget.desc,
                status: updateTarget.status
            }
            axios.patch(`/api/update/${id}`, updated)
                 .then(() => {
                     self.$emit("update");
                     console.log(this);
                 })
            },
        populateModal(index) {
            let todoObject = todos.find(o => o.id === index);
            let modalText = this.updateCreator();
            modalText.title.value = todoObject.title;
            modalText.status.value = todoObject.status;
            modalText.desc.value = todoObject.status;
        },
        showModal(event) {
            let id = event.target.id;
            window.$('.ui.modal.update').modal({onShow: () => this.populateModal(id), onApprove: () => {this.updateTodo(id)}}).modal('show');
        }
    }


    

        
}
</script>