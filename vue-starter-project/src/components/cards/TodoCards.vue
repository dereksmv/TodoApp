<template>
    <div class="todo-card">
        <div class="ui card sizer">
            <div class="content">
                <div class="header">{{ title }}</div>

            </div>
            <div class="content">
                <h4 class="ui sub header">
                Status
                </h4>
                <div class="ui small feed">
                    <div class="event">
                        <div class="summary">
                            {{ status }}
                        </div>
                    </div>
                </div>
                <h4 class="ui sub header">Description</h4>
                <div class="ui small feed">
                    <div class="event">
                        <div class="content">
                            <div class="summary">
                                {{ description }}
                            </div>
                        </div>
                    </div>
                </div>
                <h5 class="ui sub header">
                    Created
                </h5>
                <div class="ui small feed">
                <div class="event">
                    <div class="content">
                        <div class="summary">
                        {{ createdOn }}
                        </div>
                    </div>
                </div>
                </div>
                <h5 class="ui sub header">
                    Last Modified
                </h5>
                <div class="event">
                    {{ lastUpdated }}
                </div>
                <div class="extra-grid extra content">
                    <div>
                        <EditButton
                        :title = title
                        :id = id
                        :desc = description
                        :status= status
                        @update="handleUpdate"
                        />
                    </div>
                    <div>
                        <DeleteTodoButton
                        :indexNumber="id"
                        @update="handleUpdate"
                        />
                    </div>

                </div>
            </div>
    </div>
    </div>
</template>

<script>
import DeleteTodoButton from "../buttons/DeleteTodoButton";
import EditButton from "../buttons/EditButton";


export default {
    name: "TodoCards",
    components: {
        DeleteTodoButton, EditButton
    },
    props: {
        id: Number,
        title: String,
        status: String,
        description: String,
        createdOn: String,
        lastUpdated: String,
        },
        methods: {
            handleUpdate() {
                this.$emit("update");
            }
        }
    }
</script>

<style scoped>
    .todo-card {
        margin: 10px;
        
    }

    .sizer {
        height: 450px;
        box-shadow: 0 20px 50px rgba(240, 46, 170, 0.7);
    }

    .extra-grid {
        display: grid;
        grid-template-columns: auto auto;
        padding: 10px;
    }
</style>

<style scoped>
.styledHeader {
    background-color: navy;
}
</style>
