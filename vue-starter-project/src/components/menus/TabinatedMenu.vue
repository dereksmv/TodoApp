<template>
    <div>
        <div class="ui secondary pointing menu">
            <router-link to="/not-started" class="item active">
                Not Started
            </router-link>
            <router-link to="/in-progress" class="item">
                In-Progress
            </router-link>
            <router-link to="/complete" class="item">
                Complete
            </router-link>
        </div>
    </div>
</template>
<script>
    export default {
        name: "TabinatedMenu"
    }
</script>

