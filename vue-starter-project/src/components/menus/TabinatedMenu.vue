<template>
    <div>
        <div class="ui secondary pointing menu">
            <router-link to="/not-started" :class="notStartedClasses">
                Not Started
            </router-link>
            <router-link to="/in-progress" :class="inProgressClasses">
                In-Progress
            </router-link>
            <router-link to="/complete" :class="completeClasses">
                Complete
            </router-link>
        </div>
    </div>
</template>
<script>
    export default {
        name: "TabinatedMenu",
        props: {
            notStartedClasses: String,
            inProgressClasses: String,
            completeClasses: String
        }
    }
</script>

