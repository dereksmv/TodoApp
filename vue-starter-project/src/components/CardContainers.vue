<template>
    <div class="card-grid">
        <div v-for="todo in todos" :key="todo.id">
            <TodoCards :title="todo.title"
            :description="todo.desc"
            :createdOn="todo.createdOn"
            :lastUpdated="todo.lastUpdated"
            :id="todo.id"
            />
        </div>
    </div>
</template>



<script>
import TodoCards from "./cards/TodoCards.vue";

export default {
        name: "CardContainers",
        components: {TodoCards},
        props: {
            todos: []
            },
    }

</script>

<style scoped>
.card-grid {
    display: grid;
    grid-template-columns: auto auto auto auto auto auto;
    margin: 25px;
}
</style>
