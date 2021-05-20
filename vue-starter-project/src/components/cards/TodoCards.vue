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
                        <DeleteTodoButton
                        :indexNumber="id"
                        @update="handleUpdate"
                        />
                    </div>
                    <div>
                        <button class="ui button">Edit</button>
                    </div>
                </div>
            </div>
    </div>
    </div>
</template>

<script>
import DeleteTodoButton from "../buttons/DeleteTodoButton"

export default {
    name: "TodoCards",
    components: {
        DeleteTodoButton
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
    }

    .extra-grid {
        display: grid;
        grid-template-columns: auto auto;
        padding: 10px;
    }
</style>
