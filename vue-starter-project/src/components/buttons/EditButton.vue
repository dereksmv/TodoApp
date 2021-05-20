<template>
    <div>
        <div>
            <button v-on:click="showModal" class="ui icon button">
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
        title: String,
        id: Number,
        status: String,
        desc: String
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
                title: updateTarget.title.value,
                desc: updateTarget.desc.value,
                status: updateTarget.status.value
            }
            axios.patch(`/api/update/${id}`, data)
                 .then(() => {
                     this.$emit("update");
                     console.log(this);
                 })
            },
        populateModal() {
            
            let modalText = this.updateCreator();
            modalText.title.value = this.title
            modalText.status.value = this.status;
            modalText.desc.value = this.desc;
        },
        showModal() {
            let id = this.id;
            window.$('.ui.modal.update').modal({onShow: () => this.populateModal(), onApprove: () => {this.updateTodo(id)}}).modal('show');
        }
    }


    

        
}
</script>